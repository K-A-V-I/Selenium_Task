package test3;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshots {
	public static void main (String args[]) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome driver", "C:/Users/kavi1/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	dri.get("https://demoqa.com/buttons");
	
//Screenshot of a page 
	File PageScr = ((TakesScreenshot) dri).getScreenshotAs(OutputType.FILE);//take screescot
	File PageDest = new File("D://Pic/img1.png");
	FileHandler.copy(PageScr, PageDest);
	
	
//Screenshot of an Element
	WebElement Ele = dri.findElement(By.id("doubleClickBtn"));
	File EleScr = ((TakesScreenshot) Ele).getScreenshotAs(OutputType.FILE);
	File EleDest = new File("D://Pic/img2.png");
	FileHandler.copy(EleScr, EleDest);

//ScreenShot of a Section
	WebElement Eleme = dri.findElement(By.className("left-pannel"));
	File SecScr = ((TakesScreenshot) Eleme).getScreenshotAs(OutputType.FILE);
	File SecDest = new File("D://Pic/img3.png");
	FileHandler.copy(SecScr, SecDest);
	
	System.out.println("See your Folder");
	dri.quit();
}
}