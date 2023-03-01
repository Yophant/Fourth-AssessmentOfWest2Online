package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusszhongchouxiangmuEntity;
import com.entity.view.DiscusszhongchouxiangmuView;

import com.service.DiscusszhongchouxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 众筹项目评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-12-11 11:29:39
 */
@RestController
@RequestMapping("/discusszhongchouxiangmu")
public class DiscusszhongchouxiangmuController {
    @Autowired
    private DiscusszhongchouxiangmuService discusszhongchouxiangmuService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusszhongchouxiangmuEntity discusszhongchouxiangmu,
		HttpServletRequest request){
        EntityWrapper<DiscusszhongchouxiangmuEntity> ew = new EntityWrapper<DiscusszhongchouxiangmuEntity>();
		PageUtils page = discusszhongchouxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhongchouxiangmu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusszhongchouxiangmuEntity discusszhongchouxiangmu, 
		HttpServletRequest request){
        EntityWrapper<DiscusszhongchouxiangmuEntity> ew = new EntityWrapper<DiscusszhongchouxiangmuEntity>();
		PageUtils page = discusszhongchouxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszhongchouxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusszhongchouxiangmuEntity discusszhongchouxiangmu){
       	EntityWrapper<DiscusszhongchouxiangmuEntity> ew = new EntityWrapper<DiscusszhongchouxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusszhongchouxiangmu, "discusszhongchouxiangmu")); 
        return R.ok().put("data", discusszhongchouxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusszhongchouxiangmuEntity discusszhongchouxiangmu){
        EntityWrapper< DiscusszhongchouxiangmuEntity> ew = new EntityWrapper< DiscusszhongchouxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusszhongchouxiangmu, "discusszhongchouxiangmu")); 
		DiscusszhongchouxiangmuView discusszhongchouxiangmuView =  discusszhongchouxiangmuService.selectView(ew);
		return R.ok("查询众筹项目评论表成功").put("data", discusszhongchouxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusszhongchouxiangmuEntity discusszhongchouxiangmu = discusszhongchouxiangmuService.selectById(id);
        return R.ok().put("data", discusszhongchouxiangmu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusszhongchouxiangmuEntity discusszhongchouxiangmu = discusszhongchouxiangmuService.selectById(id);
        return R.ok().put("data", discusszhongchouxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusszhongchouxiangmuEntity discusszhongchouxiangmu, HttpServletRequest request){
    	discusszhongchouxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhongchouxiangmu);
        discusszhongchouxiangmuService.insert(discusszhongchouxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusszhongchouxiangmuEntity discusszhongchouxiangmu, HttpServletRequest request){
    	discusszhongchouxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszhongchouxiangmu);
        discusszhongchouxiangmuService.insert(discusszhongchouxiangmu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusszhongchouxiangmuEntity discusszhongchouxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusszhongchouxiangmu);
        discusszhongchouxiangmuService.updateById(discusszhongchouxiangmu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusszhongchouxiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusszhongchouxiangmuEntity> wrapper = new EntityWrapper<DiscusszhongchouxiangmuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusszhongchouxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	





}
