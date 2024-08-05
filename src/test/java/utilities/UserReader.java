package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserReader {

	static Properties properties;

	static {
		String filePath = "user.properties";
		try {
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getUser(String key) {
		return (properties.getProperty(key));
	}
}
