package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import pages.ShirtPage;

public class SmokeTest extends BaseTest{
	
	HomePage hp;
	
	ShirtPage sp;
	
	@Test
	public void buyAShirt() {
		hp = new HomePage(dr);
		hp.hoverOverOnMainMenu();
		sp = hp.clickAllShirtSubMenu();
		sp.clickOnFirstShirt();
	}
}
