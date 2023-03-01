package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongchouxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongchouxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongchouxiangmuView;


/**
 * 众筹项目
 *
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
public interface ZhongchouxiangmuService extends IService<ZhongchouxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongchouxiangmuVO> selectListVO(Wrapper<ZhongchouxiangmuEntity> wrapper);
   	
   	ZhongchouxiangmuVO selectVO(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
   	
   	List<ZhongchouxiangmuView> selectListView(Wrapper<ZhongchouxiangmuEntity> wrapper);
   	
   	ZhongchouxiangmuView selectView(@Param("ew") Wrapper<ZhongchouxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongchouxiangmuEntity> wrapper);
   	
}

