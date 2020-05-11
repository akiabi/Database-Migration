package com.demo.example;

import java.util.ArrayList;
import java.util.List;

public class MigrationInfo
{
	public static String mySelectString;
	public  static String myInsertString;
	public List<String> query;
	private String abcd; 
	
    @Override
	public String toString() {
		return "MigrationInfo " ;
	}

	public List<String> MigrateTable(IATableInfo iaTableInfo)
	{
		MigrationInfo migrationInfo = new MigrationInfo();
		IAMigrate iaMigrate = new IAMigrate();
		query= new ArrayList<String>(); 
	    
		//for(int tables = 0; tables <2; tables++)
		{
			migrationInfo.mySelectString = "SELECT ";
			for (int temp = 0; temp < iaTableInfo.iaColumns.size(); temp++) {
				migrationInfo.mySelectString += iaTableInfo.iaColumns.get(temp).getSrcColName();
				migrationInfo.mySelectString += ",";
			}
			migrationInfo.mySelectString = removeLastCharacter(migrationInfo.mySelectString);
			migrationInfo.mySelectString += " FROM " + iaTableInfo.getSrcTblName();
			query.add(mySelectString);

			
			migrationInfo.myInsertString = "INSERT INTO "+iaTableInfo.getTargetTbleName()+" (";
			for(int temp = 0; temp<iaTableInfo.iaColumns.size(); temp++)
			{
				migrationInfo.myInsertString += iaTableInfo.iaColumns.get(temp).getTargetColName();
				migrationInfo.myInsertString += ",";
			}
			migrationInfo.myInsertString = removeLastCharacter(migrationInfo.myInsertString);
			migrationInfo.myInsertString += ") VALUES (";
			for(int temp = 0; temp<iaTableInfo.iaColumns.size(); temp++)
			{
				migrationInfo.myInsertString += "?,";
			}
			migrationInfo.myInsertString = removeLastCharacter(migrationInfo.myInsertString);
			migrationInfo.myInsertString += ")";
			query.add(myInsertString);

		}
        System.out.println("664here"+query);
        return query;

		//System.out.println(migrationInfo.mySelectString);
		//System.out.println(migrationInfo.myInsertString);

	}

	public String removeLastCharacter(String str)
	{
		System.out.println("remove_last_char"+str);
		String result = null;
		if ((str != null) && (str.length() > 0))
		{
			result = str.substring(0, str.length() - 1);
		}
		System.out.println("returning..."+result);
		return result;
	}
}