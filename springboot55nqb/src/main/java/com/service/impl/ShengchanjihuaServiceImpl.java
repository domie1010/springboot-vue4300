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


import com.dao.ShengchanjihuaDao;
import com.entity.ShengchanjihuaEntity;
import com.service.ShengchanjihuaService;
import com.entity.vo.ShengchanjihuaVO;
import com.entity.view.ShengchanjihuaView;

@Service("shengchanjihuaService")
public class ShengchanjihuaServiceImpl extends ServiceImpl<ShengchanjihuaDao, ShengchanjihuaEntity> implements ShengchanjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchanjihuaEntity> page = this.selectPage(
                new Query<ShengchanjihuaEntity>(params).getPage(),
                new EntityWrapper<ShengchanjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchanjihuaEntity> wrapper) {
		  Page<ShengchanjihuaView> page =new Query<ShengchanjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengchanjihuaVO> selectListVO(Wrapper<ShengchanjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchanjihuaVO selectVO(Wrapper<ShengchanjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchanjihuaView> selectListView(Wrapper<ShengchanjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchanjihuaView selectView(Wrapper<ShengchanjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShengchanjihuaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShengchanjihuaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShengchanjihuaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
