package com.patpat.objectrepositary;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.Base;

public class EcomSearch extends Base {
	public EcomSearch() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='header-desktop-search-input']")
private WebElement search;
@FindBy(xpath="//button[@class='header-desktop-search-button']")
private WebElement enter;
@FindBy(xpath="(//span[@class='browse-grid-item-brand'])[1]")
private WebElement clickshirt;
@FindBy(xpath="//button[text()='Add to Cart']")
private WebElement addtocart;
@FindBy(xpath="//div[text()='M']")
private WebElement size;
@FindBy(xpath="//button[@class='checkout-button checkout-button-checkout']")
private WebElement chechout;
//@FindBy(id=("ShipAddress_FirstName"))
//private WebElement fname;





//public WebElement getFname() {
	//return fname;
//}
public WebElement getChechout() {
	return chechout;
}
public WebElement getSize() {
	return size;
}
public WebElement getAddtocart() {
	return addtocart;
}
public WebElement getClickshirt() {
	return clickshirt;
}
public WebElement getSearch() {
	return search;
}
public WebElement getEnter() {
	return enter;
}


}
