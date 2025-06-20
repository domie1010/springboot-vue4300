package com.entity.model;

import com.entity.WuliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物料信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
public class WuliaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物料名称
	 */
	
	private String wuliaomingcheng;
		
	/**
	 * 物料类型
	 */
	
	private String wuliaoleixing;
		
	/**
	 * 物料规格
	 */
	
	private String wuliaoguige;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 物料详情
	 */
	
	private String wuliaoxiangqing;
				
	
	/**
	 * 设置：物料名称
	 */
	 
	public void setWuliaomingcheng(String wuliaomingcheng) {
		this.wuliaomingcheng = wuliaomingcheng;
	}
	
	/**
	 * 获取：物料名称
	 */
	public String getWuliaomingcheng() {
		return wuliaomingcheng;
	}
				
	
	/**
	 * 设置：物料类型
	 */
	 
	public void setWuliaoleixing(String wuliaoleixing) {
		this.wuliaoleixing = wuliaoleixing;
	}
	
	/**
	 * 获取：物料类型
	 */
	public String getWuliaoleixing() {
		return wuliaoleixing;
	}
				
	
	/**
	 * 设置：物料规格
	 */
	 
	public void setWuliaoguige(String wuliaoguige) {
		this.wuliaoguige = wuliaoguige;
	}
	
	/**
	 * 获取：物料规格
	 */
	public String getWuliaoguige() {
		return wuliaoguige;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：物料详情
	 */
	 
	public void setWuliaoxiangqing(String wuliaoxiangqing) {
		this.wuliaoxiangqing = wuliaoxiangqing;
	}
	
	/**
	 * 获取：物料详情
	 */
	public String getWuliaoxiangqing() {
		return wuliaoxiangqing;
	}
			
}
