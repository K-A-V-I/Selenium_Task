package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoiframe {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
    	
		 driver.get("https://demo.guru99.com/test/guru99home/");  
		//    driver.manage().window().maximize();
		    int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		for(int i=0; i<=size; i++){
		    driver.switchTo().frame(i);
		    int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
		    driver.switchTo().defaultContent(); 
		}       
		    driver.switchTo().frame(0); //Switching to the frame
			System.out.println("********We are switched to the iframe*******");
			driver.findElement(By.xpath("html/body/a/img")).click();
			
		    System.out.println("*********We are done***************");     

	}

}
