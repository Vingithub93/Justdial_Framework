package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;

public class Genrics {
	
	public static String getConfigProperties(String key)
	{
		String sValue="";
		Properties properties= new Properties();
		try
		{
			FileInputStream fis= new FileInputStream(Auto_constant.CONFIG_PATH);
			properties.load(fis);
			sValue=properties.getProperty(key);
			
			
		}
		catch (Exception e) {

		}
		
		
		return sValue;
	}

}
