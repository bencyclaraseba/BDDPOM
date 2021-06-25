package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.JavaBase;

public class LoginPage extends JavaBase{

//WebElement username=driver.findElement(By.name("email"));
//username.sendKeys("bencyclarasebastian@gmail.com");

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
		
	@FindBy(linkText="For(got your password?")
	WebElement forgotPwd;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void login(String username1, String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
		login.click();
		
	}
	public void forgotPassword()
	{
		forgotPwd.click();
	
	}
}
