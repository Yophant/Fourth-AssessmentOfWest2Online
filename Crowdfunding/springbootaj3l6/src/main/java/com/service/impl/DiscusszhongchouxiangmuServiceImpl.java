package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszhongchouxiangmuDao;
import com.entity.DiscusszhongchouxiangmuEntity;
import com.service.DiscusszhongchouxiangmuService;
import com.entity.vo.DiscusszhongchouxiangmuVO;
import com.entity.view.DiscusszhongchouxiangmuView;

@Service("discusszhongchouxiangmuService")
public class DiscusszhongchouxiangmuServiceImpl extends ServiceImpl<DiscusszhongchouxiangmuDao, DiscusszhongchouxiangmuEntity> implements DiscusszhongchouxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhongchouxiangmuEntity> page = this.selectPage(
                new Query<DiscusszhongchouxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhongchouxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhongchouxiangmuEntity> wrapper) {
		  Page<DiscusszhongchouxiangmuView> page =new Query<DiscusszhongchouxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhongchouxiangmuVO> selectListVO(Wrapper<DiscusszhongchouxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhongchouxiangmuVO selectVO(Wrapper<DiscusszhongchouxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhongchouxiangmuView> selectListView(Wrapper<DiscusszhongchouxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhongchouxiangmuView selectView(Wrapper<DiscusszhongchouxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
