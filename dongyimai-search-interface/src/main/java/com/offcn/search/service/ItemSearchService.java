package com.offcn.search.service;

import com.offcn.pojo.TbItem;
import com.offcn.pojo.TbItemCat;

import java.util.List;
import java.util.Map;

/**
 * @author wcz
 * @create 2020-10-26 21:24
 */
public interface ItemSearchService {
    /**
     * 搜索
     * @param keywords
     * @return
     */
    public Map<String,Object> search(Map searchMap);

    /**
     * 导入数据
     * @param list
     */
    public void importList(List<TbItem> list);

    /**
     * 删除数据
     * @param ids
     */
    public void deleteByGoodsIds(List goodsIdList);




}
