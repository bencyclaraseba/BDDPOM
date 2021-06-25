package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.JavaBase;

public class HomePage extends JavaBase
{
@FindBy(xpath="//span[@class='user-display']")
WebElement userlogged;


@FindBy(xpath="//span[contains(text(),'Contacts')]")
WebElement contactLink;

 public HomePage() 
	// TODO Auto-generated constructor stub

{
	PageFactory.initElements(driver, this);

}

public boolean isUserloggedin()
{
	return userlogged.isDisplayed();
	
}
public void contactPageList()
{
	contactLink.click();

}


}
