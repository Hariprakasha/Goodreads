package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class HomePageObjectsPOM extends BaseClass
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement SearchText;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement SearchButton;
	@FindBy(xpath="(//span[.='Want to read'])[1]")
	WebElement WantToRead;
	@FindBy(xpath="//a[.='My Books']")
	WebElement Mybooks;
	@FindBy(xpath="//img[@title='Remove from my books']")
	WebElement RemoveFromBooks;
	@FindBy(xpath="(//img[@src='https://s.gr-assets.com/assets/nophoto/user/u_60x60-267f0ca0ea48fd3acfd44b95afa64f01.png'])[1]")
	WebElement Logouticon;
	@FindBy(xpath="(//a[.='Sign out'])[1]")
	WebElement Logoutbtn;
	
	
	public HomePageObjectsPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public void searchbook(String Book)
	{
		SearchText.sendKeys(Book);
		SearchButton.click();
		WantToRead.click();
		Mybooks.click();
		RemoveFromBooks.click();
	}
	
	public void AcceptPopup()
	{
Alert alert = driver.switchTo().alert();
alert.accept();
	}
	
	public void Logout()
	{
		Logouticon.click();
		Logoutbtn.click();
	}
	}
