package cn.edu.uestc.weibo.service;

import cn.edu.uestc.weibo.entity.UserInfo;

public interface UserInfoService
{
	UserInfo login(String account,String password);
	
	
	boolean register(UserInfo userInfo);
}
