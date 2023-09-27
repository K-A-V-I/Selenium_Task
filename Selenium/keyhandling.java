package test3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyhandling {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        // Find the search input element by its name attribute
        WebElement searchBox = driver.findElement(By.name("field-keywords"));

        // Create an Actions object to perform keyboard actions
        Actions actions = new Actions(driver);

        // Perform multiple key actions in sequence
        actions
            .sendKeys(searchBox, "laptops") // Type "laptops" in the search box
            .build().perform();
        System.out.println("Typed 'laptops'");

        actions
            .keyDown(Keys.CONTROL) // Hold down the Control key
            .sendKeys("a") // Press 'A' key (select all)
            .keyUp(Keys.CONTROL) // Release the Control key
            .build().perform();
        System.out.println("Selected all");

        actions
            .sendKeys(Keys.BACK_SPACE) // Press Backspace (clear the input)
            .build().perform();
        System.out.println("Cleared input");

        actions
            .sendKeys(Keys.RETURN) // Press Enter
            .build().perform();
        System.out.println("Pressed Enter");

        try {
            Thread.sleep(3000); // Sleep for 3 seconds to see the results
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the WebDriver
        driver.quit();
    }
}

