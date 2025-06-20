package com.entity.model;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public class BumenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门负责人
	 */
	
	private String bumenfuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 办公区域
	 */
	
	private String bangongquyu;
				
	
	/**
	 * 设置：部门负责人
	 */
	 
	public void setBumenfuzeren(String bumenfuzeren) {
		this.bumenfuzeren = bumenfuzeren;
	}
	
	/**
	 * 获取：部门负责人
	 */
	public String getBumenfuzeren() {
		return bumenfuzeren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：办公区域
	 */
	 
	public void setBangongquyu(String bangongquyu) {
		this.bangongquyu = bangongquyu;
	}
	
	/**
	 * 获取：办公区域
	 */
	public String getBangongquyu() {
		return bangongquyu;
	}
			
}
