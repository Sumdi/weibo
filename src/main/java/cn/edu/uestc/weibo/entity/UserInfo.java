package cn.edu.uestc.weibo.entity;

public class UserInfo
{
	private Integer id;
	private String account;
	private String nickname;
	private String password;
	private String image;
	private Integer follow;
	private Integer fans;
	private Integer weibo;
	
	

	
	public UserInfo()
	{
	}

	public UserInfo(Integer id, String account, String nickname, String password, String image, Integer follow,
			Integer fans, Integer weibo)
	{
		this.id = id;
		this.account = account;
		this.nickname = nickname;
		this.password = password;
		this.image = image;
		this.follow = follow;
		this.fans = fans;
		this.weibo = weibo;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	

	public Integer getFollow()
	{
		return follow;
	}

	public void setFollow(Integer follow)
	{
		this.follow = follow;
	}

	public Integer getFans()
	{
		return fans;
	}

	public void setFans(Integer fans)
	{
		this.fans = fans;
	}

	public Integer getWeibo()
	{
		return weibo;
	}

	public void setWeibo(Integer weibo)
	{
		this.weibo = weibo;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	@Override
	public String toString()
	{
		return "UserInfo [id=" + id + ", account=" + account + ", nickname=" + nickname + ", password=" + password
				+ ", image=" + image + ", follow=" + follow + ", fans=" + fans + ", weibo=" + weibo + "]";
	}
}
