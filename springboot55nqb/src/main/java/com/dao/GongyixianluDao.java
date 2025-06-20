package com.dao;

import com.entity.GongyixianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyixianluVO;
import com.entity.view.GongyixianluView;


/**
 * 工艺线路
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface GongyixianluDao extends BaseMapper<GongyixianluEntity> {
	
	List<GongyixianluVO> selectListVO(@Param("ew") Wrapper<GongyixianluEntity> wrapper);
	
	GongyixianluVO selectVO(@Param("ew") Wrapper<GongyixianluEntity> wrapper);
	
	List<GongyixianluView> selectListView(@Param("ew") Wrapper<GongyixianluEntity> wrapper);

	List<GongyixianluView> selectListView(Pagination page,@Param("ew") Wrapper<GongyixianluEntity> wrapper);
	
	GongyixianluView selectView(@Param("ew") Wrapper<GongyixianluEntity> wrapper);
	

}
