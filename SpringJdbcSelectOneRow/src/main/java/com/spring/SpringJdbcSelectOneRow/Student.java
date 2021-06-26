package com.spring.SpringJdbcSelectOneRow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Student 
{
	public int rollNumber;
	private String name;
	private String division;
	private JdbcTemplate connection;
	
	public void setConnection(JdbcTemplate connection) {
		this.connection = connection;
	}

	//*****************************************************************************
	//							IMPORTANT
	//*****************************************************************************
	public Student getStudent()
	{
		String query = "select * from student where id=?";
		Student student = this.connection.queryForObject(query, 
		new RowMapper<Student>() 
		{
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Student student = new Student();
				student.rollNumber = rs.getInt(1);
				student.name = rs.getString(2);
				student.division = rs.getString(3);
				return student;
			}
		},this.rollNumber);
		return student;
	}
	//*****************************************************************************
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", division=" + division + "]";
	}
	
	
}
