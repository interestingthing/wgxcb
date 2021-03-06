//控制层
app.controller('itemCatController', function ($scope, $controller, itemCatService, typeTemplateService) {

    $controller('baseController', {$scope: $scope});//继承
    $scope.showTypeList = function () {
        itemCatService.showTypeList().success(
            function (response) {
                $scope.list = response;
            }
        );
    }

    //读取列表数据绑定到表单中  
    $scope.findAll = function () {
        itemCatService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        );
    }

    //分页
    $scope.findPage = function (page, rows) {
        itemCatService.findPage(page, rows).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne = function (id) {
        itemCatService.findOne(id).success(
            function (response) {
                $scope.entity = response;
            }
        );
    }

    //保存
    $scope.save = function () {
        var serviceObject;//服务层对象
        if ($scope.entity.id != null) {//如果有ID
            serviceObject = itemCatService.update($scope.entity); //修改
        } else {
            $scope.entity.pid = $scope.searchEntity.pid;//赋予上级ID
            serviceObject = itemCatService.add($scope.entity);//增加
        }
        serviceObject.success(
            function (response) {
                if (response.success) {
                    //重新查询
                    // $scope.findByParentId($scope.pid);
                    console.log("添加分类成功！");
                    $scope.reloadList();
                } else {
                    alert(response.message);
                }
            }
        );
    }


    //批量删除
    $scope.dele = function () {
        if (confirm('确定要删除吗？')) {
            //获取选中的复选框
            itemCatService.dele($scope.selectIds).success(
                function (response) {
                    if (response.success) {
                        //重新查询（刷新列表）
                        $scope.reloadList();
                    } else {
                        alert(response.message);
                    }
                }
            );
        }
    }

    $scope.searchEntity = {
        pid: '0'
    };//定义搜索对象

    //搜索
    $scope.search = function (page, rows) {
        itemCatService.search(page, rows, $scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    //记录上级ID
    $scope.pid = 0;

    //根据上级分类ID查询商品分类列表
    // $scope.findByParentId = function (parentId) {
    //     $scope.pid = parentId;
    //     itemCatService.findByParentId(parentId).success(
    //         function (response) {
    //             $scope.list = response;
    //         }
    //     );
    // }

    $scope.grade = 1;//当前级别

    //设置级别
    $scope.setGrade = function (value,entity) {
        $scope.grade = value;
        $scope.searchEntity = {
            pid: entity.id
        };
        if ($scope.grade === 2) {
            $scope.entity_1 = entity;
        }
    }

    $scope.selectList = function (p_entity) {
        if ($scope.grade === 1) {
            $scope.entity_1 = null;
        }
        if ($scope.grade === 2) {
            $scope.entity_1 = p_entity;
        }
        $scope.reloadList();
        // $scope.findByParentId(p_entity.id);
    }


    $scope.type_template = {data: []};

    //读取商品类型模板列表
    $scope.findTypeTemplateList = function () {
        typeTemplateService.selectOptionList().success(
            function (response) {
                $scope.type_template = {data: response};
            }
        );
    }

});	
