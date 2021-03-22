package com.stepdef;

import com.common.Base;
import com.dd.page.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn extends Base {
	
	HomePage hp;
	
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		
		driver = getdriver();
		
	
	}

	@When("^I click on the menu bar$")
	public void i_click_on_the_menu_bar() throws Throwable {
		
		hp = new HomePage(driver);
		
		hp.getcbar_menu().click();
	    
	    
	}

	@When("^I click on the shop by department$")
	public void i_click_on_the_shop_by_department() throws Throwable {
		
		hp.getcbar_depart().click();
	    
	    
	}

	@When("^I click on the men$")
	public void i_click_on_the_men() throws Throwable {
		
		hp.getcbar_men().click();
	    
	    
	}

	@When("^I click on the men clothing$")
	public void i_click_on_the_men_clothing() throws Throwable {
		
		hp.getcbar_cloth().click();
		
		
	    
	    
	}

	@When("^I click on the see all men clothing$")
	public void i_click_on_the_see_all_men_clothing() throws Throwable {
		
		hp.getcbar_all().click();
	    
	    
	}

	@When("^I click on the T-shirt$")
	public void i_click_on_the_T_shirt() throws Throwable {
		
		hp.getcbar_s().click();
	    
	    
	}

	@Then("^I am successfully on the men T-shirt page$")
	public void i_am_successfully_on_the_men_T_shirt_page() throws Throwable {
		
		//make the change
	    
	    
	}


}
