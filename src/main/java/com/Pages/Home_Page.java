package com.Pages;

import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Package.BaseClass;

import dev.failsafe.internal.util.Assert;

public class Home_Page extends BaseClass{


	@FindBy()
	WebElement pageTitle;

	@FindBy(id="search-input")
	WebElement txt_Search;

	@FindBy(xpath="//button[@type='submit'][@data-testid='form-input-button']")
	WebElement btn_Search;

	@FindBy(xpath="//button[contains(text(),'Add To Bag')]")
	WebElement btn_AddtoBag;

	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	WebElement btn_checkout_popup;

	@FindBy(xpath="//button[@aria-label='check out'][contains(text(),'Checkout')]")
	WebElement btn_Checkout;

	@FindBy(xpath="//button[@aria-label='Continue'][contains(text(),'Continue')]")
	WebElement btn_Continue;

	@FindBy(linkText="Caviar Quilted Small CC Bucket Bag Black")
	WebElement selectBag;


	@FindBy(linkText="Caviar Quilted Small CC Bucket Bag Black")
	WebElement blackBage_text;

	@FindBy(id="first-name-input-shipping")
	WebElement txt_First_Name;

	@FindBy(id="email")
	WebElement txt_Email_Address;

	@FindBy(xpath="//button[ @aria-label='Cookie Footer Accept Button']")
	WebElement btn_I_acccept;

	@FindBy(id="last-name-input-shipping")
	WebElement txt_Last_Name;

	@FindBy(id="phone-input-shipping")
	WebElement txt_Phone_Number;

	@FindBy(xpath="//button[@aria-label='manually type address']")
	WebElement link_Adress_Manual;

	@FindBy(id="address-input-shipping")
	WebElement txt_Adress;

	@FindBy(id="city-input-shipping")
	WebElement txt_City;

	@FindBy(id="state-selector-shipping")
	WebElement txt_Adress_State;

	@FindBy(id="postal-code-input-shipping")
	WebElement txt_Adress_PostalCode;


	public Home_Page(){

		PageFactory.initElements(driver, this);
	}


	public void enterSearchText(String txt) {

		 
		txt_Search.sendKeys(txt);


	}

	public void click_Search_btn() {

		btn_Search.click();
	}

	public void Verify_Title() {
	 
		String Title_of_page=driver.getTitle();
		}

	public void click_Continue_btn() {

		btn_Continue.click();
	}


	public void enter_FirstName() {

		txt_First_Name.sendKeys("Test First Name");
	}

	public void enter_LastName() {

		txt_Last_Name.sendKeys("Test Last Name");
	}


	public void enter_PhoneNumber() throws InterruptedException {
		Thread.sleep(5000);
		txt_Phone_Number.sendKeys("+923115515448");
	}

	public void enter_email() {

		txt_Email_Address.sendKeys("Email@test.com");
	}




	public void enter_Address() throws InterruptedException {
		
		Thread.sleep(10000);
        link_Adress_Manual.click();
		Thread.sleep(10000);
		txt_Adress.sendKeys("1 Poxabogue Ln");
		Thread.sleep(10000);
		txt_City.sendKeys("Sagaponack");
		Thread.sleep(10000);
		Select se=new Select(txt_Adress_State);
		se.selectByValue("NY");
		Thread.sleep(10000);
		txt_Adress_PostalCode.sendKeys("11962-2022");
		Thread.sleep(2000);
	}


	public void click_Checkout_btn() throws InterruptedException {

		Thread.sleep(3000);
		btn_checkout_popup.click();
		Thread.sleep(30000);
		btn_Checkout.click();
		Thread.sleep(3000);

	}

	public void click_AddTo_Bag() throws InterruptedException {

		Thread.sleep(3000);
		btn_AddtoBag.click();

	}

	public void click_btn_accept() {
		btn_I_acccept.click();
	}

	public void select_Bag() throws InterruptedException {
        
		List <WebElement> listOfElements = driver.findElements(By.xpath("//a[@class='productListingPage_linkHover__NQ54Q'][text()]"));

		for(WebElement element:listOfElements) {
			System.out.println("Text of the"+  element.getText());
			String LinkName=element.getText();
			if(LinkName.contains("Black")) {

				element.click();

			}





		}

		
		Thread.sleep(9000);
		selectBag.click();
		Thread.sleep(9000);

	}

	public void verify_Search() {

		List <WebElement> listOfElements = driver.findElements(By.xpath("//a[@class='productListingPage_linkHover__NQ54Q'][text()]"));

		for(WebElement element:listOfElements) {
			System.out.println("Text of the"+  element.getText());
			String LinkName=element.getText();
			if(LinkName.contains("Black")) {

				System.out.println("Black bag are present");

			}





		}

	}

}
