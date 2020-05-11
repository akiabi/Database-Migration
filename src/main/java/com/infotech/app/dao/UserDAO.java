package com.infotech.app.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.demo.example.IAColumnInfo;
import com.infotech.app.model.User;

public interface UserDAO {
	public abstract void Insert_table(List<Map<String, Object>> list, String finalquery1);
	public abstract List<Map<String, Object>> getdata(String finalquery2) ;

}
