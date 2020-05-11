package com.demo.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class IAMigrate {
	
	public static int value1 = 0;
	@Autowired
	Migration migrationRepo;
	
	 @Bean
     public DriverManagerDataSource dataSource() {
		 final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		 dataSource.setUrl("jdbc:mysql://localhost:3307/iamigration1?autoReconnect=true&useSSL=false");
		 dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
     }
	 
	public List<IATableInfo> migratexml() throws SAXException, IOException, ParserConfigurationException
	{
		
		//NEew n =new NEew();
		List<IATableInfo> dataTables = new ArrayList<IATableInfo>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	      DocumentBuilder builder = factory.newDocumentBuilder();
	      Document document = builder.parse(new File("MigrateXML.xml"));
	      document.getDocumentElement().normalize();
	      NodeList nList = document.getElementsByTagName("ia-table");
	      IATableInfo tableinfo1 = new IATableInfo();
	      	       value1=nList.getLength();
	      	      System.out.println("no of tables: "+value1);
	      for (int temp =0; temp < nList.getLength(); temp++)
	      {
	    	  IATableInfo tableinfo = new IATableInfo();
	    	  List<IAColumnInfo> datacolumns = new ArrayList<IAColumnInfo>();
	    	  System.out.println("1st"+temp);
	    	  
	         Node node = nList.item(temp);
	         
	        //if (node.getNodeType() == Node.ELEMENT_NODE)
	            Element eElement = (Element) node;
	            NodeList mList = eElement.getElementsByTagName("ia-column");
	                 System.out.println(eElement.getElementsByTagName("srcTblName").item(0).getTextContent());
	       
	            tableinfo.setSrcTblName(eElement.getElementsByTagName("srcTblName").item(0).getTextContent());
	            tableinfo.setTargetTbleName(eElement.getElementsByTagName("targetTbleName").item(0).getTextContent());
	            System.out.println("columns "+mList.getLength());
	            int temp1;
				for (temp1 = 0; temp1 < mList.getLength(); temp1++)
	  	      {          	
	             System.out.println("**************"+temp1);
	            IAColumnInfo colinfo1 = new IAColumnInfo();
	            colinfo1.setSrcColName(eElement.getElementsByTagName("srcColName").item(temp1).getTextContent());
	            colinfo1.setTargetColName(eElement.getElementsByTagName("targetColName").item(temp1).getTextContent());
	           
	            datacolumns.add(colinfo1);
	           }
	            temp1=0;
	            tableinfo.setIaColumns(datacolumns);
	            System.out.println("ileo"+tableinfo);
	           dataTables.add(tableinfo);
	  	      }
	    //  n.setIaTables(data);
	 
     return dataTables;
	}

	
}


