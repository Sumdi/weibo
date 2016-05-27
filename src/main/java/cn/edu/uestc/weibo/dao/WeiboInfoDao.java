/**
 * 版权声明。。。。。。。2016年5月24日
 * ╭(╯^╰)╮	
 */
package cn.edu.uestc.weibo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.uestc.weibo.entity.WeiboInfo;

/**
 * @author 徐阳 2016年5月24日 上午11:16:08
 * @email xuyang8512@foxmail.com
 */
public interface WeiboInfoDao
{
	List<WeiboInfo> selectWeibo(@Param("id") int id, @Param("start")int start, @Param("size")int size);
}
