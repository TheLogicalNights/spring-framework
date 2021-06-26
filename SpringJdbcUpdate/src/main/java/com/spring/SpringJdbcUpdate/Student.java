package com.spring.SpringJdbcUpdate;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student 
{
	public int rollNumber;
	public String Name;
	public String division;
	private JdbcTemplate connection;
	
	public void setConnection(JdbcTemplate connection) 
	{
		this.connection = connection;
	}

	public int update()
	{
		String querry = "update student set name=? , divison=? where id=?";
		int iRet = connection.update(querry, this.Name,this.division,this.rollNumber);
		return iRet;
	}
}
