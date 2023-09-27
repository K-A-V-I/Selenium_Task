package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement; 

// isSelected() checks that if an element is selected on the web page or not
//isEnabled() check if the web element is enabled or disabled within the web page
// isDisplayed() check whether an element is displayed on a web page or not

public class methoddemo {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver1 = new ChromeDriver();
	driver.get("https://softwaretestingo.blogspot.com/2020/08/checkbox-radio-button.html");
		
	    WebElement radio1 = driver.findElement(By.id("java"));
        System.out.println("Radio Button 1:");
        if (!radio1.isSelected()) {
            radio1.click();
            System.out.println("Clicked the java radio button.");
        }
       System.out.println("Selected: " + radio1.isSelected());
        System.out.println("Displayed: " + radio1.isDisplayed());
        System.out.println("Enabled: " + radio1.isEnabled());
        System.out.println();
        
        WebElement radio2 = driver.findElement(By.id("checkbox"));
        System.out.println("Radio Button 2:");
       System.out.println("Selected: " + radio2.isSelected());
       System.out.println("Displayed: " + radio2.isDisplayed());
        System.out.println("Enabled: " + radio2.isEnabled());
        System.out.println();
        
          
        WebElement checkbox1 = driver.findElement(By.id("sing"));
        System.out.println("Checkbox 1:");
        System.out.println("Selected: " + checkbox1.isSelected());
        System.out.println("Displayed: " + checkbox1.isDisplayed());
        System.out.println("Enabled: " + checkbox1.isEnabled());
        System.out.println();
        
        WebElement checkbox2 = driver.findElement(By.id("code"));
        System.out.println("Checkbox 2:");
        if (!checkbox2.isSelected()) {
            checkbox2.click();
            System.out.println("Clicked the coding checkbox.");
        }
        System.out.println("Selected: " + checkbox2.isSelected());
        System.out.println("Displayed: " + checkbox2.isDisplayed());
        System.out.println("Enabled: " + checkbox2.isEnabled());
		
//		
//		driver1.get("file:///C:/Users/kavi1/OneDrive/Desktop/Edubridge%20Activities/form/reg_form.html");
//		
//		 WebElement dropdown = driver.findElement(By.name("country"));
//	        Select dd = new Select(dropdown);
//
//	        boolean isSelected = dropdown.isSelected();
//	        System.out.println("Is dropdown selected? " + isSelected);
//	        boolean isEnabled = dropdown.isEnabled();
//	        System.out.println("Is dropdown enabled? " + isEnabled);
//	        boolean isDisplayed = dropdown.isDisplayed();
//	        System.out.println("Is dropdown displayed? " + isDisplayed);
//	        
//	        if (!dropdown.isSelected()) {
//	            dd.selectByIndex(3);  
//	            WebElement selectedOption = dd.getFirstSelectedOption();
//	            System.out.println("Selected option: " + selectedOption.getText());
	//        } 
		
		
	}

}
