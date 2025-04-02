package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jsAlert {

	protected WebDriver driver;

	public jsAlert(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[@class='content'])[2]")
	private WebElement startAlertElement;

	@FindBy(xpath = "//button[@id='simple']")
	private WebElement simpleAlertElement;

	@FindBy(css = "#confirm")
	private WebElement confirtAlertElement;

	@FindBy(css = "#prompt")
	private WebElement promptAlertElement;

	public WebElement getstartAlertElement() {
		return startAlertElement;
	}

	public WebElement getsimpleAlertElement() {
		return simpleAlertElement;
	}

	public WebElement getconfirtAlertElement() {
		return confirtAlertElement;
	}

	public WebElement getpromptAlertElement() {
		return promptAlertElement;
	}

	public void Alert1() {

		startAlertElement.click();
		simpleAlertElement.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		System.out.println("+-+-+-+-+-Simple Alert+-+-+-+-+-");

	}

	public void Alert2() {

		confirtAlertElement.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		System.out.println("+-+-+-+-+-Conformation Alert+-+-+-+-+-");

	}

	public void Alert3() {

		promptAlertElement.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hey Buddy");
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		System.out.println("+-+-+-+-+-Prompt Alert+-+-+-+-+-");

	}

}
