package BaseTests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	protected WebDriver driver;
	protected Properties prop;

	private static final String HUB_URL = "http://selenium-hub:4444/wd/hub";
	

	@BeforeClass
	public void setUp() {
		loadProperties();

		// 👉 CHANGE ONLY THIS LINE to switch browser
//		startChrome(); 
		// startFirefox();
		 startGrid("chrome");
		 startGrid("firefox");

		openApplication();
	}

	/* ================= PROPERTY LOADER ================= */

	private void loadProperties() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("src/test/resources/One.properties");
			prop.load(file);
			file.close();
		} catch (IOException e) {
			Assert.fail("❌ Unable to load properties file: " + e.getMessage());
		}
	}

	/* ================= BROWSER METHODS ================= */

	// ✅ Chrome – Local
	protected void startChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		applyCommonSettings();
		System.out.println("✅ Chrome started locally");
	}

	// ✅ Firefox – Local
	protected void startFirefox() {
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		applyCommonSettings();
		System.out.println("✅ Firefox started locally");
	}

	// ✅ Selenium Grid – Chrome / Firefox
	protected void startGrid(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				driver = new RemoteWebDriver(new URL(HUB_URL), options);
			} else if (browser.equalsIgnoreCase("firefox")) {
				FirefoxOptions options = new FirefoxOptions();
				driver = new RemoteWebDriver(new URL(HUB_URL), options);
			} else {
				throw new RuntimeException("Unsupported browser for Grid: " + browser);
			}

			applyCommonSettings();
			System.out.println("✅ Grid started with browser: " + browser);

		} catch (MalformedURLException e) {
			Assert.fail("❌ Grid URL is invalid: " + e.getMessage());
		}
	}

	/* ================= COMMON SETTINGS ================= */

	private void applyCommonSettings() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	/* ================= APP LAUNCH ================= */

	private void openApplication() {
		String url = prop.getProperty("Url");
		String getStartXpath = prop.getProperty("GetStart");

		Assert.assertNotNull(url, "❌ Url missing in properties");
		Assert.assertNotNull(getStartXpath, "❌ GetStart xpath missing in properties");

		driver.get(url);
		System.out.println("✅ Navigated to URL: " + url);

		driver.findElement(By.xpath(getStartXpath)).click();
		System.out.println("✅ Clicked Get Started");
	}

	/* ================= TEARDOWN ================= */		

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			System.out.println("✅ Browser closed successfully");
		}
	}
}
