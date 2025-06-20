package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliaoxinxiView;


/**
 * 物料信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface WuliaoxinxiService extends IService<WuliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliaoxinxiVO> selectListVO(Wrapper<WuliaoxinxiEntity> wrapper);
   	
   	WuliaoxinxiVO selectVO(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
   	
   	List<WuliaoxinxiView> selectListView(Wrapper<WuliaoxinxiEntity> wrapper);
   	
   	WuliaoxinxiView selectView(@Param("ew") Wrapper<WuliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliaoxinxiEntity> wrapper);
   	

}

