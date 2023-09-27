package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement; 
import java.util.Set;

import java.util.*;

public class windowhandleeg {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/?gclid=Cj0KCQjw9MCnBhCYARIsAB1WQVXAzik8SDsChn8L7UxLu0CMcNgoRs7iwNRTQsWpVb8HAGwPYFzqdOAaAmLaEALw_wcB");
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[2]/a")).click();
		String parentwindow=driver.getWindowHandle();
		Set<String> winhandles=driver.getWindowHandles();
		Iterator<String> ite=winhandles.iterator();
		while(ite.hasNext()) {
			String childwin=ite.next();
			if (!parentwindow.equalsIgnoreCase(childwin)) {
                driver.switchTo().window(childwin);
                WebElement text = driver.findElement(By.xpath("//*[@id=\"third\"]/div[2]/span[1]/a"));
                text.click();
                System.out.println("Heading of child window is " + text.getText());
                driver.switchTo().window(childwin);
                driver.close();
			}
		}
    }
}
