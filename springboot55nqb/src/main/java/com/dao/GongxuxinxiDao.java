package com.dao;

import com.entity.GongxuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongxuxinxiVO;
import com.entity.view.GongxuxinxiView;


/**
 * 工序信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface GongxuxinxiDao extends BaseMapper<GongxuxinxiEntity> {
	
	List<GongxuxinxiVO> selectListVO(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
	
	GongxuxinxiVO selectVO(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
	
	List<GongxuxinxiView> selectListView(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);

	List<GongxuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
	
	GongxuxinxiView selectView(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
	

}
