package stepDefination;


import java.util.List;

import javax.accessibility.AccessibleStateSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.Package.BaseClass;
import com.Pages.Home_Page;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class testShoping extends BaseClass{

	public Home_Page homePage;
	public BaseClass base;
	
	@Before public void setUp(){ 
		initialization();
		
		 
	   } 
	
 
	 
	
	
	@Given("User opens the browse")
	public void user_opens_the_browse() {
		
		homePage =new Home_Page();
		homePage.click_btn_accept();
	}
	 

	//Crumpled Lambskin Quilted Small Top Handle Flap Black

	@When("^User enters the search (.*)")
	public void user_enters_the_search_text(String Search_text) {
	    // Write code here that turns the phrase above into concrete actions
		homePage.enterSearchText(Search_text);
	}

	@When("User click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Search_btn();
		Thread.sleep(6000);
	}

	@Then("verify result is according to the search")
	public void verify_result_is_according_to_the_search() {
	    // Write code here that turns the phrase above into concrete actions
		
		homePage.verify_Search();
		
	}

	
	
	@When("User Selects the Third bag")
	public void user_selects_the_third_bag() throws InterruptedException {

		homePage.select_Bag();
	}

	@When("Click on Add the Bag")
	public void click_on_add_the_bag() throws InterruptedException {
		 Thread.sleep(10000);
		homePage.click_AddTo_Bag();
	   
	}

	@When("Click on checkout")
	public void click_on_checkout() throws InterruptedException {
		homePage.click_Checkout_btn();
	}

	@When("Enter Email Address")
	public void enter_email_address() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homePage.enter_email();
		homePage.click_Continue_btn();
	}

	@When("Enter Name and Address")
	public void enter_name_and_address() throws InterruptedException {
		homePage.enter_FirstName();
		homePage.enter_LastName();
		homePage.enter_Address();
		homePage.enter_PhoneNumber();
	}

	@When("Click on Continue")
	public void click_on_continue() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Continue_btn();
		Thread.sleep(3000);
		
	    	}

	@When("Select Ground")
	public void select_ground() {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Continue_btn();
	}
	@When("Click on Continue again")
	public void click_on_continue_again() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Continue_btn();
		Thread.sleep(3000);
		
	    	}
	@Then("verify result is bag order is placed")
	public void verify_result_is_bag_order_is_placed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
	
