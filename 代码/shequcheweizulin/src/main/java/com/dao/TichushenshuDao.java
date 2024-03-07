package com.dao;

import com.entity.TichushenshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TichushenshuView;

/**
 * 提出申述 Dao 接口
 *
 * @author 
 */
public interface TichushenshuDao extends BaseMapper<TichushenshuEntity> {

   List<TichushenshuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
