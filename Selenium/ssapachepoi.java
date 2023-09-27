package test3;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

public class ssapachepoi {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/kavi1/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--remote-allow-origins=*");
		//creating obj for web driver
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//creating reference is the first step
		TakesScreenshot tk=(TakesScreenshot)driver;
		//taking screenshot and storing it in the temporary file
		File source=tk.getScreenshotAs(OutputType.FILE);
		//creating destination file
		File des=new File("D://Pic/fb.png");
		//moving the file from source to destination
		FileUtils.copyFile(source, des);
		
		System.out.println("See you Folder");	
		
		driver.quit();

	}

}

