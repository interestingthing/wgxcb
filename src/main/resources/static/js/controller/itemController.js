//控制层
app.controller('itemController', function ($scope, $http, $controller, itemService) {

    $controller('baseController', {$scope: $scope});//继承


    $scope.specificationItems = {};//存储用户选择的规格
    $scope.renderFinish = function () {
        $(function () {
            var tempLength = 0; //临时变量,当前移动的长度
            var viewNum = 5; //设置每次显示图片的个数量
            var moveNum = 2; //每次移动的数量
            var moveTime = 300; //移动速度,毫秒
            var scrollDiv = $(".spec-scroll .items ul"); //进行移动动画的容器
            var scrollItems = $(".spec-scroll .items ul li"); //移动容器里的集合
            var moveLength = scrollItems.eq(0).width() * moveNum; //计算每次移动的长度
            var countLength = (scrollItems.length - viewNum) * scrollItems.eq(0).width(); //计算总长度,总个数*单个长度

            //下一张
            $(".spec-scroll .next").bind("click", function () {
                if (tempLength < countLength) {
                    if ((countLength - tempLength) > moveLength) {
                        scrollDiv.animate({left: "-=" + moveLength + "px"}, moveTime);
                        tempLength += moveLength;
                    } else {
                        scrollDiv.animate({left: "-=" + (countLength - tempLength) + "px"}, moveTime);
                        tempLength += (countLength - tempLength);
                    }
                }
            });
            //上一张
            $(".spec-scroll .prev").bind("click", function () {
                if (tempLength > 0) {
                    if (tempLength > moveLength) {
                        scrollDiv.animate({left: "+=" + moveLength + "px"}, moveTime);
                        tempLength -= moveLength;
                    } else {
                        scrollDiv.animate({left: "+=" + tempLength + "px"}, moveTime);
                        tempLength = 0;
                    }
                }
            });
        });
    }
    //数量加减
    $scope.addNum = function (x) {
        $scope.num += x;
        if ($scope.num < 1) {
            $scope.num = 1;
        }
    }

    //用户选择规格
    $scope.selectSpecification = function (key, value) {
        $scope.specificationItems[key] = value;
        searchSku();//查询SKU
    }

    //判断某规格是否被选中
    $scope.isSelected = function (key, value) {
        if ($scope.specificationItems[key] == value) {
            return true;
        } else {
            return false;
        }
    }

    $scope.sku = {};//当前选择的SKU

    //加载默认SKU
    $scope.loadSku = function () {
        $scope.sku = skuList[0];
        $scope.imageList = img[0];
        console.log($scope.sku);
        $scope.specificationItems = JSON.parse(JSON.stringify($scope.sku.spec));
    }

    //匹配两个对象是否相等
    // spec:{"颜色":"桔色","床单尺寸":"1.2米(160*220cm)"}\
    // spec:{"颜色":"桔色","床单尺寸":"1.2米(160*220cm)"}
    matchObject = function (map1, map2) {
        for (var k in map1) {
            if (map1[k] != map2[k]) {
                return false;
            }
        }
        for (var k in map2) {
            if (map2[k] != map1[k]) {
                return false;
            }
        }
        return true;
    }

    //根据规格查询sku
    searchSku = function () {
        var i;

        for (i = 0; i < skuList.length; i++) {
            if (matchObject(skuList[i].spec, $scope.specificationItems)) {
                $scope.sku = skuList[i];
                $scope.imageList = img[i];
                console.log($scope.sku);
                // location.href="http://localhost:8080/sku/"+$scope.sku.spuId+"-"+$scope.sku.id+".html";
                return;
            }
        }
        $scope.sku = {id: i, title: '-----', price: i};

    }

    //添加商品到购物车
    $scope.addToCart = function () {
        //alert('SKUID:'+$scope.sku.id );

        $http.get('../cart/addGoodsToCartList?itemId='
            + $scope.sku.id + '&num=' + $scope.num).success(
            function (response) {
                if (response.success) {
                    location.href = 'http://localhost:8080/user/cart.html';
                } else {
                    alert(response.message);
                }
            }
        );

    }

    //读取列表数据绑定到表单中  
    $scope.findAll = function () {
        itemService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        );
    }

    //分页
    $scope.findPage = function (page, rows) {
        itemService.findPage(page, rows).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne = function (id) {
        itemService.findOne(id).success(
            function (response) {
                $scope.entity = response;
            }
        );
    }

    //保存
    $scope.save = function () {
        var serviceObject;//服务层对象
        if ($scope.entity.id != null) {//如果有ID
            serviceObject = itemService.update($scope.entity); //修改
        } else {
            serviceObject = itemService.add($scope.entity);//增加
        }
        serviceObject.success(
            function (response) {
                if (response.success) {
                    //重新查询
                    $scope.reloadList();//重新加载
                } else {
                    alert(response.message);
                }
            }
        );
    }


    //批量删除
    $scope.dele = function () {
        //获取选中的复选框
        itemService.dele($scope.selectIds).success(
            function (response) {
                if (response.success) {
                    $scope.reloadList();//刷新列表
                    $scope.selectIds = [];
                }
            }
        );
    }

    $scope.searchEntity = {};//定义搜索对象

    //搜索
    $scope.search = function (page, rows) {
        itemService.search(page, rows, $scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

});	
