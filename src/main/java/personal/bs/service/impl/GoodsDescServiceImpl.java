package personal.bs.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import personal.bs.dao.mapper.TbGoodsDescMapper;
import personal.bs.domain.po.TbGoodsDesc;
import personal.bs.domain.po.TbGoodsDescExample;
import personal.bs.domain.vo.PageResult;
import personal.bs.service.GoodsDescService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class GoodsDescServiceImpl implements GoodsDescService {

    @Resource
    private TbGoodsDescMapper goodsDescMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbGoodsDesc> findAll() {
        return goodsDescMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbGoodsDesc> page = (Page<TbGoodsDesc>) goodsDescMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbGoodsDesc goodsDesc) {
        goodsDescMapper.insert(goodsDesc);
    }


    /**
     * 修改
     */
    @Override
    public void update(TbGoodsDesc goodsDesc) {
        goodsDescMapper.updateByPrimaryKey(goodsDesc);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbGoodsDesc findOne(Integer id) {
        return goodsDescMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Integer[] ids) {
        for (Integer id : ids) {
            goodsDescMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(TbGoodsDesc goodsDesc, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbGoodsDescExample example = new TbGoodsDescExample();
        TbGoodsDescExample.Criteria criteria = example.createCriteria();

        if (goodsDesc != null) {
            if (goodsDesc.getIntroduction() != null && goodsDesc.getIntroduction().length() > 0) {
                criteria.andIntroductionLike("%" + goodsDesc.getIntroduction() + "%");


                goodsDesc.getIntroduction();
            }
            if (goodsDesc.getSpecificationItems() != null && goodsDesc.getSpecificationItems().length() > 0) {
                criteria.andSpecificationItemsLike("%" + goodsDesc.getSpecificationItems() + "%");
            }
            if (goodsDesc.getCustomAttributeItems() != null && goodsDesc.getCustomAttributeItems().length() > 0) {
                criteria.andCustomAttributeItemsLike("%" + goodsDesc.getCustomAttributeItems() + "%");
            }
            if (goodsDesc.getItemImages() != null && goodsDesc.getItemImages().length() > 0) {
                criteria.andItemImagesLike("%" + goodsDesc.getItemImages() + "%");
            }
            if (goodsDesc.getPackageList() != null && goodsDesc.getPackageList().length() > 0) {
                criteria.andPackageListLike("%" + goodsDesc.getPackageList() + "%");
            }
            if (goodsDesc.getSaleService() != null && goodsDesc.getSaleService().length() > 0) {
                criteria.andSaleServiceLike("%" + goodsDesc.getSaleService() + "%");
            }

        }

        Page<TbGoodsDesc> page = (Page<TbGoodsDesc>) goodsDescMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
