package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navdemo {
    public static void main(String[] args) throws InterruptedException{
          System.setProperty("webdriver.chrome.driver","C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
    driver.get("https://www.amazon.in/");
     
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
       WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        System.out.println("search results page Title: " + driver.getTitle());
        int titlelen = driver.getTitle().length();
        System.out.println("length "+titlelen);
        driver.navigate().back();
        System.out.println("Homepage Title: " + driver.getTitle());
        driver.navigate().forward();
        if (driver.getCurrentUrl().contains("/s?k=laptop")) {
            System.out.println("Forward nav successful: URL contains search results");
        } else {
            System.out.println("Forward nav failed : URL does not contain search results");
        }
        System.out.println("search results page Title (after nav frwd): " + driver.getTitle());    
        
              
     
        
        
        driver1.get("https://testkru.com/Elements/RadioButtons");
   
        WebElement firstSelect1RadioButton = driver1.findElement(By.id("firstSelect1"));
         boolean isSelected = firstSelect1RadioButton.isSelected();
         System.out.println(isSelected);
        if (isSelected) {
            System.out.println(" ID 'firstSelect1' is selected.");
        } else {
            System.out.println("ID 'firstSelect1' is not selected.");
        }         
        driver.quit();
    }
}

