package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Wrapperclass;

public class Home extends Wrapperclass{
	
	WebDriver driver;
	
	
	By logo=By.xpath("//a[1][@class='logo']//img[@alt='Logo']");
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void logoClick()
	{
		clickOnElement(driver,logo);
	}
	
	
}
