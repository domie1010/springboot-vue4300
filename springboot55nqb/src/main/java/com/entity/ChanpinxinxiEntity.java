package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 产品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:38
 */
@TableName("chanpinxinxi")
public class ChanpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChanpinxinxiEntity() {
		
	}
	
	public ChanpinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 产品编号
	 */
					
	private String chanpinbianhao;
	
	/**
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 产品类型
	 */
					
	private String chanpinleixing;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 产品说明
	 */
					
	private String chanpinshuoming;
	
	/**
	 * 产品特色
	 */
					
	private String chanpintese;
	
	/**
	 * 产品规格
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chanpinguige;
	
	/**
	 * 适用范围
	 */
					
	private String shiyongfanwei;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：产品编号
	 */
	public void setChanpinbianhao(String chanpinbianhao) {
		this.chanpinbianhao = chanpinbianhao;
	}
	/**
	 * 获取：产品编号
	 */
	public String getChanpinbianhao() {
		return chanpinbianhao;
	}
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
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：产品说明
	 */
	public void setChanpinshuoming(String chanpinshuoming) {
		this.chanpinshuoming = chanpinshuoming;
	}
	/**
	 * 获取：产品说明
	 */
	public String getChanpinshuoming() {
		return chanpinshuoming;
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
	public void setChanpinguige(Date chanpinguige) {
		this.chanpinguige = chanpinguige;
	}
	/**
	 * 获取：产品规格
	 */
	public Date getChanpinguige() {
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

}
