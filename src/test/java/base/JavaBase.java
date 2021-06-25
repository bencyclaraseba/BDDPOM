package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaBase {
	public static Properties prop;
	public static WebDriver driver;
	
	
	public  JavaBase()
	{
	prop =new Properties();
	String path=System.getProperty("user.dir") + "//src//test//resources//configFiles//config.properties";
	
	FileInputStream fin;
	try {
		fin=new FileInputStream(path);
		prop.load(fin);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
	
	public void Initialize()
	{
	String browser=prop.getProperty("browser");
	System.out.println("browser is"+browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		System.out.print("chrome");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}

}
