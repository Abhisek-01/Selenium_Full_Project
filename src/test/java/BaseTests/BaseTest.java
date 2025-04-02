package BaseTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass
	public void base() throws IOException {

		Properties prop = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Abhisek Baral\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Selenium_Full_Project\\src\\test\\resources\\One.properties");
		prop.load(file);

		String url = prop.getProperty("Url");
		System.out.println("URL from properties file: " + url);

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);

		String getstart = prop.getProperty("GetStart");

		driver.findElement(By.xpath(getstart)).click();

	}

	@AfterClass
	public void teardown() {

	}

}
