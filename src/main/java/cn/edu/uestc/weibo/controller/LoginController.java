/**
 * Copyright 2016 hwadee.com Co.,Ltd. All right reserved.
 *
 * weibo
 */
package cn.edu.uestc.weibo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.entity.UserInfo;
import cn.edu.uestc.weibo.service.UserInfoService;

/**
 * @author 张三
 * @email zs@163.com
 * @version v1.0
 * @2016年5月24日 下午3:51:50
 * TODO
 */
@Controller
public class LoginController {
	
	@Autowired
	private UserInfoService service;
	
	@RequestMapping("/login")
	public String login(UserInfo info, HttpSession session){
		
		
		try {
			
			
			info = service.login(info.getAccount(),info.getPassword());
			
			session.setAttribute("info", info);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//res.sendRedirect(arg0);
		return "redirect:/u/" + info.getId() + "/home";
	}

}
