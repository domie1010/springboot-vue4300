package com.dao;

import com.entity.WuliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliaoxinxiVO;
import com.entity.view.WuliaoxinxiView;


/**
 * 物料信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface WuliaoxinxiDao extends BaseMapper<WuliaoxinxiEntity> {
	
	List<WuliaoxinxiVO> selectListVO(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
	
	WuliaoxinxiVO selectVO(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
	
	List<WuliaoxinxiView> selectListView(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);

	List<WuliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
	
	WuliaoxinxiView selectView(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
	

}
