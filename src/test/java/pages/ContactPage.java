package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.JavaBase;

public class ContactPage extends JavaBase{
	
	@FindBy(xpath="//button[contains(text(),'Show Filters')]")
	WebElement showFilters;


	@FindBy(xpath="//div[@class='field filter-button-container']/button[1]")
	WebElement addFilter;

	 public ContactPage() 
		// TODO Auto-generated constructor stub

	{
		PageFactory.initElements(driver, this);

	}

	public void contactFilter()
	{
		showFilters.click();
		addFilter.click();
		
	}


}
