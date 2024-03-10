package UI_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ui_testing {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File a =ts.getScreenshotAs(OutputType.FILE);
		File b = new File("D:\\Screenshot MACHINE TEST\\hari.bmp");
		FileUtils.copyFile(a, b);
	    driver.navigate().back();
	    driver.get("https://www.getcalley.com/calley-call-from-browser/");
	    TakesScreenshot ts1 = (TakesScreenshot)driver;
		File x =ts.getScreenshotAs(OutputType.FILE);
		File y = new File("D:\\Screenshot MACHINE TEST\\krishna.bmp");
		FileUtils.copyFile(x, y);
		driver.navigate().back();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		 TakesScreenshot ts2 = (TakesScreenshot)driver;
			File x1 =ts.getScreenshotAs(OutputType.FILE);
			File y1 = new File("D:\\Screenshot MACHINE TEST\\krishnahari.bmp");
			FileUtils.copyFile(x1, y1);
			driver.navigate().back();
			 driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
			    TakesScreenshot ts3 = (TakesScreenshot)driver;
				File x2 =ts3.getScreenshotAs(OutputType.FILE);
				File y2= new File("D:\\Screenshot MACHINE TEST\\krishnaaa.bmp");
				FileUtils.copyFile(x2, y2);
				driver.navigate().back();

	}

}
