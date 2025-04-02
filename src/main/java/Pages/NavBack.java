package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBack {

	protected WebDriver driver;

	public NavBack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[onclick='goBack()']")
	private WebElement back;

	public WebElement getBack() {
		return back;
	}

	public void backMain() {

//		System.out.println("Element found? " + (back != null));
//
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(back)).click();

		System.out.println("+-+-+-+-+- Back +-+-+-+-+-");

//		driver.navigate().back();
	}

}
