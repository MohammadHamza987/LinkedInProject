package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("^User launches the application$")
	public void user_launches_the_application()  {
	   Base.driver.get("https://tutorialsninja.com/demo/");
	}

	@Given("^User Navigates to Registration page$")
	public void user_Navigates_to_Registration_page() {
	   
	}

	@When("^User fills the below details$")
	public void user_fills_the_below_details(DataTable arg1)  {
	    
	}

	@When("^User clicks on the privacy policy$")
	public void user_clicks_on_the_privacy_policy()  {
	   
	}

	@When("^User clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {
	    
	}

	@Then("^User should see that Account has been created successfully$")
	public void user_should_see_that_Account_has_been_created_successfully() throws Throwable {
	  
	}

}
