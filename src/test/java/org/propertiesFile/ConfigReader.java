package org.propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public String getConfigData(String Key)  {
		try {
			FileInputStream fis = new FileInputStream("./propertiesFile/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(Key);	
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public Properties init_Prop() {
		try {
			FileInputStream fis = new FileInputStream("./propertiesFile/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop;
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
