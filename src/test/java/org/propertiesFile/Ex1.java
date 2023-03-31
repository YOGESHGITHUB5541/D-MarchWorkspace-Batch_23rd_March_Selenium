package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./propertiesFile/Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browserName"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}

}
