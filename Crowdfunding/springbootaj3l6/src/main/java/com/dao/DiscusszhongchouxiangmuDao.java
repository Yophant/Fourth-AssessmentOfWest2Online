package com.dao;

import com.entity.DiscusszhongchouxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhongchouxiangmuVO;
import com.entity.view.DiscusszhongchouxiangmuView;


/**
 * 众筹项目评论表
 * 
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
public interface DiscusszhongchouxiangmuDao extends BaseMapper<DiscusszhongchouxiangmuEntity> {
	
	List<DiscusszhongchouxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
	
	DiscusszhongchouxiangmuVO selectVO(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
	
	List<DiscusszhongchouxiangmuView> selectListView(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);

	List<DiscusszhongchouxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
	
	DiscusszhongchouxiangmuView selectView(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
	
}
