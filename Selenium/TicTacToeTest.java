package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicTacToeTest {

    public static void main(String[] args) {
   	 System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Task 1: Access the URL
            String url = "https://selenium-apps.doselect.in/tic-tac-toe/";
            driver.get(url);

            // Task 2: Find elements by path and click in the pattern
            // Using absolute XPath locations for demonstration purposes
            WebElement topLeft = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div"));
            WebElement topCenter = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div"));
            WebElement topRight = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div"));
            WebElement middleLeft = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div"));
            WebElement middleCenter = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div"));
            WebElement middleRight = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div"));
            WebElement bottomLeft = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div"));
            WebElement bottomCenter = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div"));
            WebElement bottomRight = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div"));

            // You can perform click actions on these elements as needed
            // For example: topLeft.click();

            // Task 3: Find the span text 'Player One Wins' explicitly using XPath
            WebElement playerOneWinsSpan = driver.findElement(By.xpath("//span[text()='Player One Wins']"));
            // You can perform assertions or further actions based on the element found

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
