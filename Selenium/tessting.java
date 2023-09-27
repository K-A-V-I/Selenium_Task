package test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tessting {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
         System.out.println("Search Results Page Title: " + driver.getTitle());
         driver.navigate().refresh(); 
         driver.close();  
	}

}
