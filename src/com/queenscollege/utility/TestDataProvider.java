package com.queenscollege.utility;

import org.testng.annotations.DataProvider;

public class TestDataProvider{
	@DataProvider(name="TestData")
	public static Object [][]data(){
		return new Object [][]{
				{"user@yahoo.com", "12234444"},
				{"name@gmail.com", "123456"}
		};		
	}
	
}
