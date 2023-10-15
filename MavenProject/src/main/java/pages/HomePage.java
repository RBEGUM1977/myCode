package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumHelper.Shared;

public class HomePage {
	
	WebDriver dr;
	
	@FindBy(xpath = "Xpath of Men Menu") WebElement menMenuBar;
	@FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;
	
	public HomePage(WebDriver x) {
		dr = x;	
		PageFactory.initElements(dr, this);  //this means the class Name
	}
	public void hoverOverOnMainMenu() {
		
		Shared.hoverOver(menMenuBar);
	}
	public ShirtPage clickAllShirtSubMenu() {
		
		Shared.clickOnElement(allShirtSubMenu);
		
		return new ShirtPage(dr);
	}

}
