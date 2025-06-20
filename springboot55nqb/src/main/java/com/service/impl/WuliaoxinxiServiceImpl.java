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


import com.dao.WuliaoxinxiDao;
import com.entity.WuliaoxinxiEntity;
import com.service.WuliaoxinxiService;
import com.entity.vo.WuliaoxinxiVO;
import com.entity.view.WuliaoxinxiView;

@Service("wuliaoxinxiService")
public class WuliaoxinxiServiceImpl extends ServiceImpl<WuliaoxinxiDao, WuliaoxinxiEntity> implements WuliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliaoxinxiEntity> page = this.selectPage(
                new Query<WuliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<WuliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliaoxinxiEntity> wrapper) {
		  Page<WuliaoxinxiView> page =new Query<WuliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliaoxinxiVO> selectListVO(Wrapper<WuliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliaoxinxiVO selectVO(Wrapper<WuliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliaoxinxiView> selectListView(Wrapper<WuliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliaoxinxiView selectView(Wrapper<WuliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
