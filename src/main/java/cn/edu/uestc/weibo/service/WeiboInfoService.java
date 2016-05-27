/**
 * 版权声明。。。。。。。2016年5月24日
 * ╭(╯^╰)╮	
 */
package cn.edu.uestc.weibo.service;

import java.util.List;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.WeiboInfo;

/**
 * @author 徐阳
 * 2016年5月24日 下午12:56:02	
 * @email xuyang8512@foxmail.com
 */
public interface WeiboInfoService
{
	PageInfo<WeiboInfo> findWeibo(Integer id,Integer start,Integer size);
}
