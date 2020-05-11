package com.infotech.app.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.example.IAColumnInfo;
import com.demo.example.IATableInfo;
import com.infotech.app.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setOrganizationId(rs.getInt("organization_id"));
		user.setFirstName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		user.setPhone_number(rs.getString("email"));
		
		/*
		 * IAColumnInfo ia = new IAColumnInfo();
		 * 
		 * IATableInfo iat = new IATableInfo();
		 * System.out.println("why error is coming?"+iat.iaColumns.size()); for(int
		 * temp=0; temp<iat.iaColumns.size();temp++) {
		 * ia.setTargetColName(rs.getString(iat.iaColumns.get(temp).getTargetColName()))
		 * ; }
		 */
		return user;
	}
}
