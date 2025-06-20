package com.entity.view;

import com.entity.WuliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物料信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
@TableName("wuliaoxinxi")
public class WuliaoxinxiView  extends WuliaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuliaoxinxiView(){
	}
 
 	public WuliaoxinxiView(WuliaoxinxiEntity wuliaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wuliaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
