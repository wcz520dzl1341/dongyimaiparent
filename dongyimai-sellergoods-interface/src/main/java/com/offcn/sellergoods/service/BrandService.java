package com.offcn.sellergoods.service;

import com.offcn.entity.PageResult;
import com.offcn.pojo.TbBrand;

import java.util.List;
import java.util.Map;

/**
 * @author wcz
 * @create 2020-10-10 19:32
 */
public interface BrandService {
    public PageResult findPage(int pageNum, int pageSize);
    public List<TbBrand> findAll();
    public void add(TbBrand brand);
    public void update(TbBrand brand);
    public TbBrand findOne(Long id);
    public void delete(Long [] ids);
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
    List<Map> selectOptionList();
}
