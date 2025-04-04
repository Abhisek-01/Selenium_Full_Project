package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabOpener {

	protected WebDriver driver;

	public TabOpener(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[@class='content'])[3]")
	private WebElement tabElement;

	@FindBy(css = "a[id='launcher']")
	private WebElement clickElement;

	@FindBy(css = "a[id='actionButton']")
	private WebElement clickElement2;

	public void tabNav() throws InterruptedException {

		tabElement.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickElement)).click();

		String OriginalTab = driver.getWindowHandle();
		Set<String> allTabs = driver.getWindowHandles();

		for (String newWind : allTabs) {
			if (!newWind.equals(OriginalTab)) {
				driver.switchTo().window(newWind);
				break;
			}
		}
		System.out.println("New tab title: " + driver.getTitle());

		wait.until(ExpectedConditions.elementToBeClickable(clickElement2)).click();

		Thread.sleep(1000);

		for (String newWind : allTabs) {
			if (!newWind.equals(OriginalTab)) {
				driver.switchTo().window(newWind);
				break;
			}
		}
		driver.switchTo().window(OriginalTab);
		System.out.println("New tab title: " + driver.getTitle());

	}

}
