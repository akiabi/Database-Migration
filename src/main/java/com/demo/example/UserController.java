/*package com.demo.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/IATableInfo")


public class UserController {

	Migration mi;
	
	@Autowired 
	IATableInfo iATableInfoRepository;
	
	@GetMapping
	public String check() {
		
		return "welcome";
}
	
	@GetMapping(path="/getfirstnames")
	public List<String> getAllNames()
	{
		return mi.getAllNames();
		
	}

	@Override
	public String toString() {
		return "UserController [mi=" + mi + ", iATableInfoRepository=" + iATableInfoRepository + "]";
	}
	
}
*/