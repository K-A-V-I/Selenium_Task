package test3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoreg {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
//        WebElement searchInput = driver.findElement(By.name("field-keywords"));
//        searchInput.sendKeys("laptop");
//        WebElement searchButton = driver.findElement(By.cssSelector("input[value='Go']"));
//        searchButton.click();    
//        WebElement resultsMessage = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span"));
//        String message = resultsMessage.getText();
//        System.out.println(message);
//        if (message.contains("Results")) {
//            System.out.println("Search results were found");
//        } else {
//            System.out.println("No search results found");
//        }
//        
        WebElement searchInput = driver.findElement(By.className("nav-search-field"));

        System.out.println("Tag name : " + searchInput.getTagName());
        System.out.println("is the element displayed? " + searchInput.isDisplayed());

        WebElement bestSellersLink = driver.findElement(By.linkText("Best Sellers"));
        bestSellersLink.click();
        WebElement mobilesAccessoriesLink = driver.findElement(By.partialLinkText("Mobiles"));
        mobilesAccessoriesLink.click();
//        WebElement brandFilterCheckbox = driver.findElement(By.className("a-aui_72554-c a-aui_a11y_sr_678508-c a-aui_accordion_a11y_role_354025-t1 a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate"));
//        brandFilterCheckbox.click();
//        System.out.println("Checkbox clicked? " + brandFilterCheckbox.isDisplayed());
     

        driver.quit();
    }
}


