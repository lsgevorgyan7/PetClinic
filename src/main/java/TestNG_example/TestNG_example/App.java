package TestNG_example.TestNG_example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class App 
{

	 public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://ec2-3-86-30-221.compute-1.amazonaws.com:8080/");
		
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
			
			TimeUnit.SECONDS.sleep(2);
			//No.of cols 
			List  col = driver.findElements(By.xpath(".//*[@id=\"vets\"]/thead/tr/th"));
			System.out.println("No of cols are : " + col.size());
			//No.of rows 
	        List  rows = driver.findElements(By.xpath(".//*[@id='vets']/tbody/tr/td")); 
	        System.out.println("No of rows are : " + rows.size());
			
			driver.close();
	 
	 
	 }
	 
	 
}