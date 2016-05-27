/**
 * 版权声明。。。。。。。2016年5月23日
 * ╭(╯^╰)╮	
 */
package cn.edu.uestc.weibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.UserInfoDao;
import cn.edu.uestc.weibo.entity.UserInfo;

/**
 * @author 徐阳 2016年5月23日 下午7:44:51
 * @email xuyang8512@foxmail.com
 */
@Service("userService")
public class UserInfoServiceImpl implements UserInfoService
{
	@Autowired
	private UserInfoDao userInfoDao;

	public UserInfo login(String account, String password)
	{

		if (password.equals(userInfoDao.selectByAccount(account).getPassword()))
		{
			return userInfoDao.selectByAccount(account);
		} else
		{
			return null;
		}
	}

	public boolean register(UserInfo userInfo)
	{
		boolean flag = userInfoDao.add(userInfo);
		return flag;
	}


}
