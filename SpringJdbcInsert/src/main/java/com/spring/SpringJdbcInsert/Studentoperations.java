package com.spring.SpringJdbcInsert;

import org.springframework.jdbc.core.JdbcTemplate;

public class Studentoperations implements Operations
{
	private JdbcTemplate connection;
	
	public Studentoperations(JdbcTemplate connection) 
	{
		this.connection = connection;
	}

	public int insert(Student student) 
	{
		String querry = "insert into student(id,name,divison) values(?,?,?)";
		int iRet = this.connection.update(querry,student.rollNumber,student.Name,student.division);
		return iRet;
	}
	
}
