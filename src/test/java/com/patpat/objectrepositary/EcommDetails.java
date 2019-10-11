package com.patpat.objectrepositary;


	

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.resources.Base;

	public class EcommDetails extends Base {
		public EcommDetails() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id=("ShipAddress_FirstName"))
		private WebElement fname;
		
		
		@FindBy(id=("ShipAddress_LastName"))
		private WebElement lname;
		
		@FindBy(id=("ShipAddress_Company"))
		private WebElement details;
		
		@FindBy(id=("ShipAddress_StreetAddress"))
		private WebElement streetaddress;
		
		@FindBy(id=("ShipAddress_StreetAddress2"))
		private WebElement streetaddress2;
		
		
		
		
		
		
		
		
		
		
		
		
		public WebElement getLname() {
			return lname;
		}












		public WebElement getDetails() {
			return details;
		}












		public WebElement getStreetaddress() {
			return streetaddress;
		}












		public WebElement getStreetaddress2() {
			return streetaddress2;
		}












		public WebElement getFname() {
			return fname;
		}
		
		
		
		
				}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


