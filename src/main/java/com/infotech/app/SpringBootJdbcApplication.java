package com.infotech.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import com.demo.example.IAColumnInfo;
import com.demo.example.IAMigrate;
import com.demo.example.IATableInfo;
import com.demo.example.MigrationInfo;
import com.infotech.app.dao.UserDAO;
import com.infotech.app.model.User;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner{

	@Autowired
	private UserDAO userDAO;
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
			}

	@Override
	public void run(String... args) throws Exception {
		IAColumnInfo ia = new IAColumnInfo();
		IAMigrate im = new IAMigrate();
		List<IATableInfo> myTables = im.migratexml();
		System.out.println("hiileo"+myTables);
		MigrationInfo migrationInfo = new MigrationInfo();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(int temp =0; temp <im.value1;temp++ )
			{migrationInfo.MigrateTable(myTables.get(temp));
		
		
		System.out.println("getselect:**"+MigrationInfo.mySelectString);
		System.out.println("getinsert:**"+MigrationInfo.myInsertString);
		String finalquery1=MigrationInfo.mySelectString;
		System.out.println("now_wat-i_want"+finalquery1);
		String finalquery2=MigrationInfo.myInsertString;
		System.out.println("now_wat-i_want"+finalquery2);
		System.out.println("checkin query "+migrationInfo.query);
		list=getUser(finalquery1);
			Insert_table(list,finalquery2);

			}
		
	
	}

	private List<Map<String, Object>> getUser(String finalquery1) {
		List<Map<String, Object>> li  = userDAO.getdata(finalquery1);
		//System.out.println("elements"+li);
		return li;
	}

	private void Insert_table(List<Map<String, Object>> list,String finalquery2) {
			userDAO.Insert_table(list,finalquery2);
	}
}
