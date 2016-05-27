/**
 * Copyright 2016 hwadee.com Co.,Ltd. All right reserved.
 *
 * weibo
 */
package cn.edu.uestc.weibo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.WeiboInfo;
import cn.edu.uestc.weibo.service.WeiboInfoService;

/**
 * @author 张三
 * @email zs@163.com
 * @version v1.0
 * @2016年5月24日 下午4:12:54
 * TODO
 */
@Controller
@RequestMapping("/u")
public class WeiboController {
	
	@Autowired
	private WeiboInfoService weiboInfoService;
	
	
	@RequestMapping("/{id}/home")
	public String home(@PathVariable("id") int id, Model model){
		
		try {
			PageInfo<WeiboInfo> pi = weiboInfoService.findWeibo(id, 0,5);
			
			model.addAttribute("pi", pi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home/index";
	}

}
