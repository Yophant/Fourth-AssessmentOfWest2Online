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


import com.dao.ZhongchouxiangmuDao;
import com.entity.ZhongchouxiangmuEntity;
import com.service.ZhongchouxiangmuService;
import com.entity.vo.ZhongchouxiangmuVO;
import com.entity.view.ZhongchouxiangmuView;

@Service("zhongchouxiangmuService")
public class ZhongchouxiangmuServiceImpl extends ServiceImpl<ZhongchouxiangmuDao, ZhongchouxiangmuEntity> implements ZhongchouxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongchouxiangmuEntity> page = this.selectPage(
                new Query<ZhongchouxiangmuEntity>(params).getPage(),
                new EntityWrapper<ZhongchouxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongchouxiangmuEntity> wrapper) {
		  Page<ZhongchouxiangmuView> page =new Query<ZhongchouxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongchouxiangmuVO> selectListVO(Wrapper<ZhongchouxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongchouxiangmuVO selectVO(Wrapper<ZhongchouxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongchouxiangmuView> selectListView(Wrapper<ZhongchouxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongchouxiangmuView selectView(Wrapper<ZhongchouxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
