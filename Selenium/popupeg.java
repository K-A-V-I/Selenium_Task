package test3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupeg {
    public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
    	
         driver.get("https://demo.guru99.com/test/delete_customer.php");			
         driver.findElement(By.name("cusid")).sendKeys("53920");					
         driver.findElement(By.name("submit")).submit();			     
         Alert alert = driver.switchTo().alert();		    
         String alertMessage= driver.switchTo().alert().getText();				
         System.out.println(alertMessage);	
         Thread.sleep(3000);	
         alert.accept();		
     }	
}
