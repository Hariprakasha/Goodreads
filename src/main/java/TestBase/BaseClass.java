
package TestBase;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObjectModel.HomePageObjectsPOM;
import PageObjectModel.LoginPagePOM;
import PageObjectModel.SignUpPOM;
import Utils.CredentialsOperation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	
public static WebDriver driver;


	static 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("user-data-dir=/path/to/your/custom/profile");
		
		WebDriverManager.chromedriver().setup();
	}
	
 @BeforeClass
public void login() throws IOException, InterruptedException
{
	 ChromeOptions options = new ChromeOptions();
     driver=new ChromeDriver(options);
     driver.manage().window().maximize();
	String Url = CredentialsOperation.GetCredentialValueByKey("Url");
	String Email = CredentialsOperation.GetCredentialValueByKey("Email");
	String Password = CredentialsOperation.GetCredentialValueByKey("Password");
	String Book = CredentialsOperation.GetCredentialValueByKey("Book");
	driver.get(Url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	LoginPagePOM log=new LoginPagePOM(driver);
	log.setlogin();
	SignUpPOM signup = new SignUpPOM(driver);
//	signup.SignUp(Email, Password);
	

}
 
}
