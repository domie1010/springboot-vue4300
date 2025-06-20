package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchanjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchanjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchanjihuaView;


/**
 * 生产计划
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:25:39
 */
public interface ShengchanjihuaService extends IService<ShengchanjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchanjihuaVO> selectListVO(Wrapper<ShengchanjihuaEntity> wrapper);
   	
   	ShengchanjihuaVO selectVO(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
   	
   	List<ShengchanjihuaView> selectListView(Wrapper<ShengchanjihuaEntity> wrapper);
   	
   	ShengchanjihuaView selectView(@Param("ew") Wrapper<ShengchanjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchanjihuaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShengchanjihuaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShengchanjihuaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShengchanjihuaEntity> wrapper);
}

