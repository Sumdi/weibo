/**
 * 版权声明。。。。。。。2016年5月23日
 * ╭(╯^╰)╮	
 */
package weibo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.UserInfo;
import cn.edu.uestc.weibo.entity.WeiboInfo;
import cn.edu.uestc.weibo.service.UserInfoService;
import cn.edu.uestc.weibo.service.WeiboInfoService;

/**
 * @author 徐阳 2016年5月23日 下午7:55:07
 * @email xuyang8512@foxmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
{ "classpath:spring-dao.xml" })
public class WeiboTest
{
	@Autowired
	private UserInfoService userService;

	@Autowired
	private WeiboInfoService weiboInfoService;

	@Test
	public void testRegister()
	{
		UserInfo userInfo = new UserInfo(1, "xy123456", "Sumdi", "123456", "暂无", 12, 14, 16);

		boolean result = userService.register(userInfo);
		System.out.println(result);

	}

	@Test
	public void testLogin()
	{
		UserInfo userInfo = userService.login("xy123456", "123456");
		System.out.println(userInfo.toString());
	}

	@Test
	public void testFindWeibo()
	{
		PageInfo<WeiboInfo> pageInfo = weiboInfoService.findWeibo(1,1,2);

		for (WeiboInfo weiboInfo : pageInfo.getList())
		{
			System.out.println(weiboInfo.toString());
		}

	}

}
