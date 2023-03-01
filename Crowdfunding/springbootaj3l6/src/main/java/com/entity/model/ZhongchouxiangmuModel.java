package com.entity.model;

import com.entity.ZhongchouxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 众筹项目
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
public class ZhongchouxiangmuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类别
	 */
	
	private String xiangmuleibie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 目标筹款
	 */
	
	private Integer mubiaochoukuan;
		
	/**
	 * 众筹资金
	 */
	
	private Integer zhongchouzijin;
		
	/**
	 * 回报方式
	 */
	
	private String huibaofangshi;
		
	/**
	 * 筹资天数
	 */
	
	private Integer chouzitianshu;
		
	/**
	 * 项目详情
	 */
	
	private String xiangmuxiangqing;
		
	/**
	 * 项目状态
	 */
	
	private String xiangmuzhuangtai;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 企业账号
	 */
	
	private String qiyezhanghao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：项目类别
	 */
	 
	public void setXiangmuleibie(String xiangmuleibie) {
		this.xiangmuleibie = xiangmuleibie;
	}
	
	/**
	 * 获取：项目类别
	 */
	public String getXiangmuleibie() {
		return xiangmuleibie;
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
	 * 设置：目标筹款
	 */
	 
	public void setMubiaochoukuan(Integer mubiaochoukuan) {
		this.mubiaochoukuan = mubiaochoukuan;
	}
	
	/**
	 * 获取：目标筹款
	 */
	public Integer getMubiaochoukuan() {
		return mubiaochoukuan;
	}
				
	
	/**
	 * 设置：众筹资金
	 */
	 
	public void setZhongchouzijin(Integer zhongchouzijin) {
		this.zhongchouzijin = zhongchouzijin;
	}
	
	/**
	 * 获取：众筹资金
	 */
	public Integer getZhongchouzijin() {
		return zhongchouzijin;
	}
				
	
	/**
	 * 设置：回报方式
	 */
	 
	public void setHuibaofangshi(String huibaofangshi) {
		this.huibaofangshi = huibaofangshi;
	}
	
	/**
	 * 获取：回报方式
	 */
	public String getHuibaofangshi() {
		return huibaofangshi;
	}
				
	
	/**
	 * 设置：筹资天数
	 */
	 
	public void setChouzitianshu(Integer chouzitianshu) {
		this.chouzitianshu = chouzitianshu;
	}
	
	/**
	 * 获取：筹资天数
	 */
	public Integer getChouzitianshu() {
		return chouzitianshu;
	}
				
	
	/**
	 * 设置：项目详情
	 */
	 
	public void setXiangmuxiangqing(String xiangmuxiangqing) {
		this.xiangmuxiangqing = xiangmuxiangqing;
	}
	
	/**
	 * 获取：项目详情
	 */
	public String getXiangmuxiangqing() {
		return xiangmuxiangqing;
	}
				
	
	/**
	 * 设置：项目状态
	 */
	 
	public void setXiangmuzhuangtai(String xiangmuzhuangtai) {
		this.xiangmuzhuangtai = xiangmuzhuangtai;
	}
	
	/**
	 * 获取：项目状态
	 */
	public String getXiangmuzhuangtai() {
		return xiangmuzhuangtai;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：企业账号
	 */
	 
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
