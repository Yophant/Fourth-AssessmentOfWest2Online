package com.dao;

import com.entity.ZhongchouxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongchouxiangmuVO;
import com.entity.view.ZhongchouxiangmuView;


/**
 * 众筹项目
 * 
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
public interface ZhongchouxiangmuDao extends BaseMapper<ZhongchouxiangmuEntity> {
	
	List<ZhongchouxiangmuVO> selectListVO(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
	
	ZhongchouxiangmuVO selectVO(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
	
	List<ZhongchouxiangmuView> selectListView(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);

	List<ZhongchouxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
	
	ZhongchouxiangmuView selectView(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
	
}
