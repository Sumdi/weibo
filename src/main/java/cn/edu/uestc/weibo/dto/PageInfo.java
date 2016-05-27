package cn.edu.uestc.weibo.dto;

import java.util.List;

import cn.edu.uestc.weibo.entity.WeiboInfo;

public class PageInfo<T>
{
	private int page_count;

	private int column_count;

	private int size = 5;

	private int page_current;

	private List<T> list;

	public int getPage_count()
	{
		return page_count;
	}

	public void setPage_count(int page_count)
	{
		this.page_count = page_count;
	}

	public int getColumn_count()
	{
		return column_count;
	}

	public void setColumn_count(int column_count)
	{
		this.column_count = column_count;
		this.page_count = this.column_count / this.size + ((this.column_count % this.size > 0) ? 1 : 0);
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getPage_current()
	{
		return page_current;
	}

	public void setPage_current(int page_current)
	{
		this.page_current = page_current;
	}

	public List<T> getList()
	{
		return list;
	}

	public void setList(List<T> list)
	{
		this.list = list;
	}
}
