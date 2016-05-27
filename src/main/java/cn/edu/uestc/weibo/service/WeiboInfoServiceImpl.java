/**
 * 版权声明。。。。。。。2016年5月24日
 * ╭(╯^╰)╮	
 */
package cn.edu.uestc.weibo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.WeiboInfoDao;
import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.WeiboInfo;

/**
 * @author 徐阳
 * 2016年5月24日 下午12:57:49	
 * @email xuyang8512@foxmail.com
 */
@Service
public class WeiboInfoServiceImpl implements WeiboInfoService
{
	@Autowired
	private WeiboInfoDao weiboInfoDao;
	
	public PageInfo<WeiboInfo> findWeibo(Integer id,Integer start,Integer size)
	{
		PageInfo<WeiboInfo> pageInfo = new PageInfo<WeiboInfo>();
		pageInfo.setList(weiboInfoDao.selectWeibo(id,start,size));
		return pageInfo;
	}

}
