package testcases;

import org.testng.annotations.Test;

import pages.FdCalculatorPage;
import pages.Home;
import utility.Wrapperclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class IciciTestCase extends Wrapperclass {
	WebDriver driver;
	
	FdCalculatorPage fdcalculator ;
	
	Home home;
 
  @BeforeClass
  @Parameters("browser")
  public void launchBrowser(String browser) throws InterruptedException {
	  
	  driver= launchBrowser(browser,"https://www.icicibank.com/calculators/fd-calculator.html");
  }
  
  
  
  @Test
  public void testCase() throws AWTException, InterruptedException {
	  fdcalculator = new  FdCalculatorPage(driver);
	  
	  home = new Home(driver);
	  //scrollDown();
	  
	  fdcalculator.selectTypeOfFixedDeposit();
	  //scrollDown();
	  
	  fdcalculator.amountOfDeposit();
	  
	  fdcalculator.clickAnywhere();
	  
	  String value= fdcalculator.getMaturityValue();
	  System.out.println(value);
	  
	  
	  String interest=fdcalculator.getAggregateInterest();
	  System.out.println(interest);
	  
	  
	  fdcalculator.selectTenure();
	  
	  fdcalculator.tenureDays();
	  Thread.sleep(3000);
	  
      fdcalculator.clickAnywhere();
	  
	  String value1= fdcalculator.getMaturityValue();
	  System.out.println(value1);
	  
	  
	  String interest1=fdcalculator.getAggregateInterest();
	
	  System.out.println(interest1);
	  
	  driver.switchTo().defaultContent();
	 // scrollUp();
	  
	  home.logoClick();
	  
	  takeScreenShot();	  
	  
  }
  
  
  @AfterClass
  public void closeBrowser() {
        //close current browser
        driver.close();
  }



}
