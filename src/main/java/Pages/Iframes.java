package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iframes {

	protected WebDriver driver;

	public Iframes(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[@class='content'])[4]")
	private WebElement Iframe;

	@FindBy(css = "iframe[src='/selenium/frame1']")
	private WebElement Iframe1;

	@FindBy(css = "button[id='actionButton']")
	private WebElement clickme;

	@FindBy(css = "iframe[src='/selenium/frame2']")
	private WebElement Iframe2;

	public void iframe1() {

		Iframe.click();
		driver.switchTo().frame(Iframe1);
		clickme.click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Iframe2);
		clickme.click();
		driver.switchTo().defaultContent();

	}

}
