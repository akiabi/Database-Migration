package com.demo.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

 @Repository
 public class Migration{
	 String getMyInsertString="insert into app_user(client_id,name) values(?,?);";
	 String getMySelectString="select organization_id  from user;";
	/*
	 * MigrationInfo migrationinfo =new MigrationInfo();
	 * 
	 * @Autowired JdbcTemplate jdbctemplate ; public List<String> getAllNames() {
	 * List<String> list = new ArrayList<>();
	 * list.addAll(jdbctemplate.queryForList(getMySelectString,String.class));
	 * jdbctemplate.queryForList(getMyInsertString,String.class);
	 * 
	 * return list; }
	 */
	
	
	
}