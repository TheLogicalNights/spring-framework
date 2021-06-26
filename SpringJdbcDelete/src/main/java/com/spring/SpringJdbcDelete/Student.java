package com.spring.SpringJdbcDelete;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student 
{
	public int rollNumber;
	private JdbcTemplate connection;
	
	public void setConnection(JdbcTemplate connection) 
	{
		this.connection = connection;
	}
	
	public int delete()
	{
		String querry = "delete from student where id=?";
		int iRet = connection.update(querry,this.rollNumber);
		return iRet;
	}
}
