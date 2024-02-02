package collection15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		
		properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
		
		
		String driver = properties.getProperty("driver");
		
		System.out.println(driver);
	}

}
