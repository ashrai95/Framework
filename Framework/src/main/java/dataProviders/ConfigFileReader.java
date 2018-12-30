package dataProviders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader 
{
	
	private Properties properties;
	private final String propertyFilePath= "config//config.properties";

	
	public ConfigFileReader()
	{
		BufferedReader reader;
		try 
		{
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			
			properties.load(reader);
			reader.close();
		}
		catch (Exception e) 
		{
			System.out.println("BufferedReader"+e.getMessage());
		}
	} 
	   //	throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			
		
	public String getDriverPath()
	{
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() 
	{		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() 
	{
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

}


// propertyFilePath : This is just a String variable which holds the information of the config file path.
// new FileReader(propertyFilePath) : Creates a new FileReader, given the name of the file to read from.
// new BufferedReader(new FileReader(propertyFilePath)) : Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
// new Properties() : The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream. Each key and its corresponding value in the property list is a string.
// properties.load(reader) : Reads a property list (key and element pairs) from the input character stream in a simple line-oriented format.
 
//properties.getProperty(“driverPath”) :Properties object gives us a .getProperty method which takes the Key of the property as a parameter and return the Value of the matched key from the .properties file.
//If the properties file does not have the specified key, it returns the null. This is why we have put the null check and in case of null we like to throw an exception to stop the test with the stack trace information. 
