package com.dao;

import com.entity.ShengchanjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchanjihuaVO;
import com.entity.view.ShengchanjihuaView;


/**
 * 生产计划
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:25:39
 */
public interface ShengchanjihuaDao extends BaseMapper<ShengchanjihuaEntity> {
	
	List<ShengchanjihuaVO> selectListVO(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
	
	ShengchanjihuaVO selectVO(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
	
	List<ShengchanjihuaView> selectListView(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);

	List<ShengchanjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
	
	ShengchanjihuaView selectView(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
}
