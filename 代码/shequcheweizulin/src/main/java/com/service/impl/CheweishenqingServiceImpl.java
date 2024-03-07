package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.CheweishenqingDao;
import com.entity.CheweishenqingEntity;
import com.service.CheweishenqingService;
import com.entity.view.CheweishenqingView;

/**
 * 车位申请 服务实现类
 */
@Service("cheweishenqingService")
@Transactional
public class CheweishenqingServiceImpl extends ServiceImpl<CheweishenqingDao, CheweishenqingEntity> implements CheweishenqingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CheweishenqingView> page =new Query<CheweishenqingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
