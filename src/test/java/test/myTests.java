package test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class myTests {
	public String baseUrl="http://test.wendellsystems.com/";
	public WebDriver driver ;
	

	
  @Test
  public void f() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();

		
		driver.get(baseUrl);
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[4]/a/span[2]")).click();
		TimeUnit.SECONDS.sleep(1);
		//No.of Columns
        List  col = driver.findElements(By.xpath(".//*//*[@id=\"vets\"]/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = driver.findElements(By.xpath(".//*\r\n" + "//*[@id=\"vets\"]/tbody/tr/td")); 
        System.out.println("No of rows are : " + rows.size());
        driver.close();

         }
  
	
	@Test
	 public void f1() throws InterruptedException, IOException {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(baseUrl);
		AssertJUnit.assertTrue(true);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\Lilit\\screenshot.png"));
		driver.close();
	}
}
