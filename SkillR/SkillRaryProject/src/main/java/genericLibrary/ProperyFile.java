package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class ProperyFile {
	
	public String getPropertyData(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertiesFilePath);
		p.load(fis);
		return p.getProperty(key);
	}

}
