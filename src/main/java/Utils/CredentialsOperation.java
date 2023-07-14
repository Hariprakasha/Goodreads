package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class CredentialsOperation {
	 public static String GetCredentialValueByKey(String key) throws IOException
	 {
		//FileInputStream fis = new FileInputStream("C:\\Users\\harih\\eclipse-workspace\\hari\\UiAutomationTest\\src\\test\\resources\\Credentials.txt");
		File f =new File("./src/test/resources/Credentials.txt");
		File path=f.getAbsoluteFile();
		FileInputStream fis = new FileInputStream(path);
		
		Properties p = new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
 }

}
