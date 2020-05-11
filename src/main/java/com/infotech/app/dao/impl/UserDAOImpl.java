package com.infotech.app.dao.impl;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;

import com.demo.example.IAColumnInfo;
import com.demo.example.IAMigrate;
import com.demo.example.IATableInfo;
import com.demo.example.MigrationInfo;
import com.infotech.app.dao.UserDAO;
import com.infotech.app.model.User;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	IAColumnInfo ia = new IAColumnInfo();
	IAMigrate im = new IAMigrate();
	List<String> li =new ArrayList<String>();
	List<Integer> data1 = new ArrayList<Integer>() ;
	List<String > data2 = new ArrayList<String >() ;
	List<String > data3 = new ArrayList<String >() ;
	List<String > data4 = new ArrayList<String >() ;
//***************************************************************************************************************
	@Override
	public void Insert_table(List<Map<String, Object>>li,String finalquery2) 
	{ 
		
		  int counter[] = new int[256]; 
	  	    int len = finalquery2.length();
	  	    int flag = 0;
	  	    System.out.println(len);
	        for (int j = 0; j < len; j++) { 
	  			if (finalquery2.charAt(j) =='?')  
	  				flag++;      
	  			
	  		   } 
	        System.out.println("flag"+flag);
		Object u = null;String e[][] = new String[650][650];
		 String  CREATE_User_SQL="";
		 int counter_val=li.size();
for (Map<String, Object> o : li) 
		{  	  
	  CREATE_User_SQL = finalquery2.substring(0, (finalquery2.indexOf("VALUES") + 6));
	  CREATE_User_SQL=CREATE_User_SQL+"(";
	  //CREATE_User_SQL="INSERT INTO app_user(client_id,name,pass,email) VALUES(";
  	       Map m = (Map) o;
  	      for(int i=0;i<flag;i++)
  	      {
  	    	u =m.values().stream().skip(i).findFirst().get();
  	    		e[i][0] = u.toString();
  	    		 	 CREATE_User_SQL=CREATE_User_SQL+'"'+e[i][0]+'"'+",";
  	    		 	 
	      }  	
  	    CREATE_User_SQL = removeLastCharacter(CREATE_User_SQL);
  	    CREATE_User_SQL=CREATE_User_SQL+")";
  	   	jdbcTemplate.execute(CREATE_User_SQL);
  	   	System.out.println(counter_val--);
  	   	
		}
	}
	public String removeLastCharacter(String str)
	{
		String result = null;
		if ((str != null) && (str.length() > 0))
		{
			result = str.substring(0, str.length() - 1);
		}
		
		return result;
	}
	@Override
	public  List<Map<String, Object>>  getdata(String finalquery1)  {
		String GET_User_SQL="SELECT organization_id,name,password,email FROM users";
		List<Map<String, Object>> list1 = new ArrayList<>();
		list1=jdbcTemplate.queryForList(finalquery1);
	System.out.println("22"+list1);
		return list1;
	  	}
}
	
	
	/*
	 * public List<String> columnname() throws SAXException, IOException,
	 * ParserConfigurationException { List<IATableInfo> s = im.migratexml();
	 * System.out.println("@.@.@"+s); List<String> s1 = new ArrayList<>(); for(int
	 * i=0;i<4;i++) s1.add(s.get(0).getIaColumns().get(i).getSrcColName());
	 * System.out.println("@."+s1); return s1;
	 * 
	 * }
	 */

