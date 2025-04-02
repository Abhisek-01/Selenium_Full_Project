package Generics;

import org.testng.annotations.Test;

import BaseTests.BaseTest;
import Pages.NavBack;
import Pages.jsAlert;

public class Tests extends BaseTest {
	jsAlert jAlert;
	NavBack navBack;

	@Test(priority = 1)
	public void test() {

		jAlert = new jsAlert(driver);
		jAlert.Alert1();
		jAlert.Alert2();
		jAlert.Alert3();

	}

	@Test(priority = 2)
	public void back() throws InterruptedException {

		navBack = new NavBack(driver);

		navBack.backMain();

	}

}