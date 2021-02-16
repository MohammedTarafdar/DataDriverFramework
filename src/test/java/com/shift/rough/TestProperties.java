package com.shift.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		
		//System.out.println(System.getProperty("user.dir"));
		//full path: /Users/ashik/eclipse-workspace/DataDrivenFramework/src/test/resources/properties/Config.properties
		//FileInputStream fis = new FileInputStream("/Users/ashik/eclipse-workspace/DataDrivenFramework/src/test/resources/properties/Config.properties");
		
		Properties configProp = new Properties();
		Properties orProp = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Config.properties");
		configProp.load(fis);
		
		
		fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/Or.properties");
		orProp.load(fis);
		
		
		
		System.out.println(configProp.getProperty("browser"));
		System.out.println(orProp.getProperty("signInLink"));
	}

}
