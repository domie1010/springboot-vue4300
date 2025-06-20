package com.entity.view;

import com.entity.ShengchanjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生产计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:39
 */
@TableName("shengchanjihua")
public class ShengchanjihuaView  extends ShengchanjihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengchanjihuaView(){
	}
 
 	public ShengchanjihuaView(ShengchanjihuaEntity shengchanjihuaEntity){
 	try {
			BeanUtils.copyProperties(this, shengchanjihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
