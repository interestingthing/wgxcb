package personal.bs.service;


import personal.bs.domain.po.SpecTemplatePO;
import personal.bs.domain.vo.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface SpecTemplateService {

    /**
     * 返回全部列表
     *
     * @return
     */
    public List<SpecTemplatePO> findAll();


    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(SpecTemplatePO typeTemplate);


    /**
     * 修改
     */
    public void update(SpecTemplatePO typeTemplate);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    public SpecTemplatePO findOne(Integer id);


    /**
     * 批量删除
     *
     * @param ids
     */
    public void delete(Integer[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(SpecTemplatePO typeTemplate, int pageNum, int pageSize);

    //根据模板ID查询规格列表
    public List<Map> findSpecList(Integer id);
}
