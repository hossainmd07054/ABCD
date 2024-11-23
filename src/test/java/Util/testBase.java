package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	public static Properties prop;
	public static WebDriver driver;

	public testBase() {
		try {
			FileInputStream fls = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Configuration\\config.properties");
			prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialize() {
		String browsername = prop.getProperty("ahmed");
		if (browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("masum"));
		} else if (browsername.equals("FF"))

			System.out.println("Browser not found");
	}

	public static void launch(String URL) {
		driver.get(prop.getProperty("masum"));
	}
}
