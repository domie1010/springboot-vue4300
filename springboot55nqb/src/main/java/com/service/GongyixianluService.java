package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyixianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyixianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyixianluView;


/**
 * 工艺线路
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface GongyixianluService extends IService<GongyixianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyixianluVO> selectListVO(Wrapper<GongyixianluEntity> wrapper);
   	
   	GongyixianluVO selectVO(@Param("ew") Wrapper<GongyixianluEntity> wrapper);
   	
   	List<GongyixianluView> selectListView(Wrapper<GongyixianluEntity> wrapper);
   	
   	GongyixianluView selectView(@Param("ew") Wrapper<GongyixianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyixianluEntity> wrapper);
   	

}

