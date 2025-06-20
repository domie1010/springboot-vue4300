package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinxinxiView;


/**
 * 产品信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public interface ChanpinxinxiService extends IService<ChanpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinxinxiVO> selectListVO(Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	ChanpinxinxiVO selectVO(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	List<ChanpinxinxiView> selectListView(Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	ChanpinxinxiView selectView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChanpinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChanpinxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChanpinxinxiEntity> wrapper);
}

