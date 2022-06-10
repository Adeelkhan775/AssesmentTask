package com.Base.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("src/main/java/org/config/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catcasdh block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			driver = WebDriverManager.chromedriver().create();

		} else if (browserName.equals("firefox")) {

			driver = WebDriverManager.firefoxdriver().create();

		}

		driver.manage().window().maximize();
		//new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));		
	}

	public static void WindowSwitch(String Title) throws InterruptedException {

		String parentWinHandle = driver.getWindowHandle();
		// Print the title to the console
		System.out.println("Title of Parent window: " + driver.getTitle());

		// Get the window handles of all open windows
		Set<String> Handles = driver.getWindowHandles();
		Iterator it= Handles.iterator();
		String Handle=null;	    
		while(it.hasNext() ){
			Handle=it.next().toString();
			driver.switchTo().window(Handle);
			if(driver.getTitle().equals(Title)) {
				System.out.println("Title of  window: " + driver.getTitle());
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.titleIs(Title));

			}
			System.out.println("Title all  window: " + driver.getTitle());
		}




	}
}
