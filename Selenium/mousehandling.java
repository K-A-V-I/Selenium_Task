package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        try {
            Actions actions = new Actions(driver);

            //  search bar
            WebElement element = driver.findElement(By.id("twotabsearchtextbox")); 
      
            // Right-click (Context Click)
            actions.contextClick(element).build().perform();
            System.out.println("Performed Context Click");

            Thread.sleep(2000);

            actions.click(element).build().perform();
            System.out.println("Performed Left Click");

            Thread.sleep(2000);

            // Double-click
            actions.doubleClick(element).build().perform();
            System.out.println("Performed Double Click");

            Thread.sleep(2000);

          
       
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
