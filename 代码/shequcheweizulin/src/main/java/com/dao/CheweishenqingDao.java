package com.dao;

import com.entity.CheweishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweishenqingView;

/**
 * 车位申请 Dao 接口
 *
 * @author 
 */
public interface CheweishenqingDao extends BaseMapper<CheweishenqingEntity> {

   List<CheweishenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
