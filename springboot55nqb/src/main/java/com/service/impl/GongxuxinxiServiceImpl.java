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


import com.dao.GongxuxinxiDao;
import com.entity.GongxuxinxiEntity;
import com.service.GongxuxinxiService;
import com.entity.vo.GongxuxinxiVO;
import com.entity.view.GongxuxinxiView;

@Service("gongxuxinxiService")
public class GongxuxinxiServiceImpl extends ServiceImpl<GongxuxinxiDao, GongxuxinxiEntity> implements GongxuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongxuxinxiEntity> page = this.selectPage(
                new Query<GongxuxinxiEntity>(params).getPage(),
                new EntityWrapper<GongxuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongxuxinxiEntity> wrapper) {
		  Page<GongxuxinxiView> page =new Query<GongxuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongxuxinxiVO> selectListVO(Wrapper<GongxuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongxuxinxiVO selectVO(Wrapper<GongxuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongxuxinxiView> selectListView(Wrapper<GongxuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongxuxinxiView selectView(Wrapper<GongxuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
