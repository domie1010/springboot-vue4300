package com.entity.vo;

import com.entity.ShengchanjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生产计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:39
 */
public class ShengchanjihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 产品类型
	 */
	
	private String chanpinleixing;
		
	/**
	 * 生产数量
	 */
	
	private Integer shengchanshuliang;
		
	/**
	 * 产品特色
	 */
	
	private String chanpintese;
		
	/**
	 * 产品规格
	 */
	
	private String chanpinguige;
		
	/**
	 * 适用范围
	 */
	
	private String shiyongfanwei;
		
	/**
	 * 生产计划
	 */
	
	private String shengchanjihua;
		
	/**
	 * 工艺名称
	 */
	
	private String gongyimingcheng;
		
	/**
	 * 工序名称
	 */
	
	private String gongxumingcheng;
		
	/**
	 * 登记时间
	 */
	
	private String dengjishijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：产品类型
	 */
	 
	public void setChanpinleixing(String chanpinleixing) {
		this.chanpinleixing = chanpinleixing;
	}
	
	/**
	 * 获取：产品类型
	 */
	public String getChanpinleixing() {
		return chanpinleixing;
	}
				
	
	/**
	 * 设置：生产数量
	 */
	 
	public void setShengchanshuliang(Integer shengchanshuliang) {
		this.shengchanshuliang = shengchanshuliang;
	}
	
	/**
	 * 获取：生产数量
	 */
	public Integer getShengchanshuliang() {
		return shengchanshuliang;
	}
				
	
	/**
	 * 设置：产品特色
	 */
	 
	public void setChanpintese(String chanpintese) {
		this.chanpintese = chanpintese;
	}
	
	/**
	 * 获取：产品特色
	 */
	public String getChanpintese() {
		return chanpintese;
	}
				
	
	/**
	 * 设置：产品规格
	 */
	 
	public void setChanpinguige(String chanpinguige) {
		this.chanpinguige = chanpinguige;
	}
	
	/**
	 * 获取：产品规格
	 */
	public String getChanpinguige() {
		return chanpinguige;
	}
				
	
	/**
	 * 设置：适用范围
	 */
	 
	public void setShiyongfanwei(String shiyongfanwei) {
		this.shiyongfanwei = shiyongfanwei;
	}
	
	/**
	 * 获取：适用范围
	 */
	public String getShiyongfanwei() {
		return shiyongfanwei;
	}
				
	
	/**
	 * 设置：生产计划
	 */
	 
	public void setShengchanjihua(String shengchanjihua) {
		this.shengchanjihua = shengchanjihua;
	}
	
	/**
	 * 获取：生产计划
	 */
	public String getShengchanjihua() {
		return shengchanjihua;
	}
				
	
	/**
	 * 设置：工艺名称
	 */
	 
	public void setGongyimingcheng(String gongyimingcheng) {
		this.gongyimingcheng = gongyimingcheng;
	}
	
	/**
	 * 获取：工艺名称
	 */
	public String getGongyimingcheng() {
		return gongyimingcheng;
	}
				
	
	/**
	 * 设置：工序名称
	 */
	 
	public void setGongxumingcheng(String gongxumingcheng) {
		this.gongxumingcheng = gongxumingcheng;
	}
	
	/**
	 * 获取：工序名称
	 */
	public String getGongxumingcheng() {
		return gongxumingcheng;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(String dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public String getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
