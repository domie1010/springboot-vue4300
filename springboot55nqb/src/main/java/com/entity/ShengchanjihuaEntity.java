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
 * 生产计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 11:25:39
 */
@TableName("shengchanjihua")
public class ShengchanjihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengchanjihuaEntity() {
		
	}
	
	public ShengchanjihuaEntity(T t) {
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
