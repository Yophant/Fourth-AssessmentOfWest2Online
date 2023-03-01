package com.entity.view;

import com.entity.ZhongchouxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 众筹项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
@TableName("zhongchouxiangmu")
public class ZhongchouxiangmuView  extends ZhongchouxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongchouxiangmuView(){
	}
 
 	public ZhongchouxiangmuView(ZhongchouxiangmuEntity zhongchouxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, zhongchouxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
