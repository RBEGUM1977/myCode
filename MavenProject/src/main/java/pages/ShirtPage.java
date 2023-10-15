package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumHelper.Shared;

public class ShirtPage {
	
	WebDriver dr; 
	@FindBy(xpath = "Xpath of First Shirt") WebElement firstShirt;
	
	public ShirtPage(WebDriver x) {
		dr = x;	
		PageFactory.initElements(dr, this);  //this means the class Name
	}
	public ProductDetailPage clickOnFirstShirt() {
		Shared.clickOnElement(null);
		
		return new ProductDetailPage();
	}

}
