package Generics;

import org.testng.annotations.Test;

import BaseTests.BaseTest;
import Pages.Iframes;
import Pages.NavBack;
import Pages.TabOpener;
import Pages.jsAlert;

public class Tests extends BaseTest {
	jsAlert jAlert;
	NavBack navBack;
	TabOpener tabOpener;
	Iframes iframes;

	@Test(priority = 1)
	public void test() {

		jAlert = new jsAlert(driver);
		navBack = new NavBack(driver);

		jAlert.Alert1();
		jAlert.Alert2();
		jAlert.Alert3();
		navBack.backMain();

	}

	@Test(priority = 2)
	public void tab() throws InterruptedException {

		tabOpener = new TabOpener(driver);
		navBack = new NavBack(driver);

		tabOpener.tabNav();
		navBack.backMain();

	}

	@Test(priority = 3)
	public void iframe() {

		iframes = new Iframes(driver);
		navBack = new NavBack(driver);

		iframes.iframe1();
		navBack.backMain();

	}

}