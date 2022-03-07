package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GenericHelper {
	public static String getProperty(String env, String key)
	{
		String returnVal = null;
		try {
			FileReader freader = new FileReader("src/test/resources/"+env+".properties");
			Properties prop = new Properties();
			prop.load(freader);
			returnVal = prop.getProperty(key);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnVal;
	}
}
