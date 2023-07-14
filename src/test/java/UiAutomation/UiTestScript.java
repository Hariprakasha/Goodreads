package UiAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObjectsPOM;
import PageObjectModel.LoginPagePOM;
import PageObjectModel.SignUpPOM;
import TestBase.BaseClass;
import Utils.CredentialsOperation;

public class UiTestScript extends BaseClass
{
	@Test
	public void UiAutomationScript() throws InterruptedException, IOException
	{
//		LoginPagePOM log=new LoginPagePOM(driver);
//		log.setlogin();
//		
		SignUpPOM signup = new SignUpPOM(driver);
	  String Email = CredentialsOperation.GetCredentialValueByKey("Email");
	  String Password = CredentialsOperation.GetCredentialValueByKey("Password");
	  signup.SignUp(Email, Password);
	  Thread.sleep(1000);
	  
	  HomePageObjectsPOM Homepage = new HomePageObjectsPOM(driver);
	  String Book = CredentialsOperation.GetCredentialValueByKey("Book");
	  Homepage.searchbook(Book);
	  Homepage.AcceptPopup();
	  Homepage.Logout();
	}
}
