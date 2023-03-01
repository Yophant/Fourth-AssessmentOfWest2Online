package com.entity.view;

import com.entity.DiscusszhongchouxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 众筹项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
@TableName("discusszhongchouxiangmu")
public class DiscusszhongchouxiangmuView  extends DiscusszhongchouxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhongchouxiangmuView(){
	}
 
 	public DiscusszhongchouxiangmuView(DiscusszhongchouxiangmuEntity discusszhongchouxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhongchouxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
