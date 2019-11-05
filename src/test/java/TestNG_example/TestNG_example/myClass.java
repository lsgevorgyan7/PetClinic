package TestNG_example.TestNG_example;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class myClass {

	
	public String baseUrl="http://ec2-35-168-10-165.compute-1.amazonaws.com:8080/shop/category/handbags.html";
	public WebDriver driver ;
	

	
  @Test
  public void f() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();

		
		driver.get(baseUrl);
		TimeUnit.SECONDS.sleep(1);
		//driver.findElement(By.className("current")).click();
		TimeUnit.SECONDS.sleep(1);
		try {
	    driver.findElement(By.className("shop-cart")).click();                   
	    Assert.assertTrue(true);
	    }
	    catch (Throwable t){
		    Assert.assertTrue(false);
	    }
  }
  
  @Test
  public void f2() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();

		
		driver.get(baseUrl);
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.className("current")).click();
		TimeUnit.SECONDS.sleep(1);
		try {
	    driver.findElement(By.className("shop-cart")).click();                   
	    Assert.assertTrue(true);
	    }
	    catch (Throwable t){
		    Assert.assertTrue(false);
	    }	1
  }
  
  
  @AfterTest
  public void closedriver() {
	  driver.quit();
  }
}