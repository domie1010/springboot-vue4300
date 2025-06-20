package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongyixianluDao;
import com.entity.GongyixianluEntity;
import com.service.GongyixianluService;
import com.entity.vo.GongyixianluVO;
import com.entity.view.GongyixianluView;

@Service("gongyixianluService")
public class GongyixianluServiceImpl extends ServiceImpl<GongyixianluDao, GongyixianluEntity> implements GongyixianluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyixianluEntity> page = this.selectPage(
                new Query<GongyixianluEntity>(params).getPage(),
                new EntityWrapper<GongyixianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyixianluEntity> wrapper) {
		  Page<GongyixianluView> page =new Query<GongyixianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyixianluVO> selectListVO(Wrapper<GongyixianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyixianluVO selectVO(Wrapper<GongyixianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyixianluView> selectListView(Wrapper<GongyixianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyixianluView selectView(Wrapper<GongyixianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
