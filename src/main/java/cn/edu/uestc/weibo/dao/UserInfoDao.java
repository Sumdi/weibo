package cn.edu.uestc.weibo.dao;

import cn.edu.uestc.weibo.entity.UserInfo;

public interface UserInfoDao 
{
	boolean add(UserInfo userInfo);
	
	UserInfo selectByAccount(String account);
}
