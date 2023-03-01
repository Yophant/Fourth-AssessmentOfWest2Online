package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhongchouxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhongchouxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhongchouxiangmuView;


/**
 * 众筹项目评论表
 *
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
public interface DiscusszhongchouxiangmuService extends IService<DiscusszhongchouxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhongchouxiangmuVO> selectListVO(Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
   	
   	DiscusszhongchouxiangmuVO selectVO(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
   	
   	List<DiscusszhongchouxiangmuView> selectListView(Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
   	
   	DiscusszhongchouxiangmuView selectView(@Param("ew") Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhongchouxiangmuEntity> wrapper);
   	
}

