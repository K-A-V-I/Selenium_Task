package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtypes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
        

//        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
//        searchBox.sendKeys("Selenium WebDriver XPath example");
//        
//        WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
//        searchButton.click();
       
//        WebElement elementById = driver.findElement(By.xpath("//input[@id='username']"));
//        System.out.println("Element by ID: " + elementById.getAttribute("value"));
//
//        // Using Tag Name to locate elements
//        WebElement firstLink = driver.findElement(By.xpath("//a"));
//        System.out.println("First Link Text: " + firstLink.getText());
//
//        // Using "@" Attribute to locate an element
//        WebElement elementByAttribute = driver.findElement(By.xpath("//div[@class='example-class']"));
//        System.out.println("Element by Attribute: " + elementByAttribute.getText());
//
//        // Using "//" for Descendant Search
//        WebElement descendantElement = driver.findElement(By.xpath("//div//p"));
//        System.out.println("Descendant Element: " + descendantElement.getText());
        
        // Find the "Google Search" button using XPath
        WebElement searchButton = driver.findElement(By.xpath("//input[contains(@value, 'Google Search')]"));
        System.out.println("yes" + searchButton);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  
        driver.quit();
    }
}

