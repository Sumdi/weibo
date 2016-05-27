/**
 * 版权声明。。。。。。。2016年5月24日
 * ╭(╯^╰)╮	
 */
package cn.edu.uestc.weibo.entity;

import java.util.Date;

/**
 * @author 徐阳 2016年5月24日 上午11:09:12
 * @email xuyang8512@foxmail.com
 */
public class WeiboInfo
{
	private String weiboContent;
	private Date time;
	private Integer cal;
	private Integer commentNum;
	private UserInfo userInfo;

	public String getWeiboContent()
	{
		return weiboContent;
	}

	public void setWeiboContent(String weiboContent)
	{
		this.weiboContent = weiboContent;
	}

	public Date getTime()
	{
		return time;
	}

	public void setTime(Date time)
	{
		this.time = time;
	}

	public Integer getCal()
	{
		return cal;
	}

	public void setCal(Integer cal)
	{
		this.cal = cal;
	}

	public Integer getCommentNum()
	{
		return commentNum;
	}

	public void setCommentNum(Integer commentNum)
	{
		this.commentNum = commentNum;
	}

	public UserInfo getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;
	}

	@Override
	public String toString()
	{
		return "WeiboInfo [weiboContent=" + weiboContent + ", time=" + time + ", cal=" + cal + ", commentNum="
				+ commentNum + ", userInfo=" + userInfo + "]";
	}

}
