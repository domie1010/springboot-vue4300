package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongxuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongxuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongxuxinxiView;


/**
 * 工序信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface GongxuxinxiService extends IService<GongxuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongxuxinxiVO> selectListVO(Wrapper<GongxuxinxiEntity> wrapper);
   	
   	GongxuxinxiVO selectVO(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
   	
   	List<GongxuxinxiView> selectListView(Wrapper<GongxuxinxiEntity> wrapper);
   	
   	GongxuxinxiView selectView(@Param("ew") Wrapper<GongxuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongxuxinxiEntity> wrapper);
   	

}

