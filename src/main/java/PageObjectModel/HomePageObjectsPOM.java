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
	@FindBy(xpath="(//input[@aria-label='Search books'])[1]")
	WebElement SearchButtontxtbox;
	@FindBy(xpath="(//span[.='Want to Read'])[1]")
	WebElement WantToRead;
	@FindBy(xpath="(//a[.='My Books'])[1]")
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

	public void searchbook(String Book) throws InterruptedException
	{
		//SearchButtontxtbox.click();
		SearchButtontxtbox.sendKeys(Book);
		Thread.sleep(1000);
		SearchButton.click();
		Thread.sleep(1000);
		WantToRead.click();
		Thread.sleep(1000);
		Mybooks.click();
		Thread.sleep(1000);
		RemoveFromBooks.click();
	}
	
	public void AcceptPopup()
	{
        Alert alert = driver.switchTo().alert();
         alert.accept();
	}
	
	public void Logout() throws InterruptedException
	{
		Logouticon.click();
		Thread.sleep(1000);
		Logoutbtn.click();
		Thread.sleep(5000);
	}
	}
