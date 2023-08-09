package com.stepDefinition;

import org.openqa.selenium.Keys;

import com.utility.PageObjectManager;
import com.utility.TestBase;

import io.cucumber.java.en.*;

public class StepAmazon extends TestBase {

	PageObjectManager pom = new PageObjectManager();


	@Given("user can able to launch the amazon homepage")
	public void user_can_able_to_launch_the_amazon_homepage() {
		System.out.println(driver.getCurrentUrl());	
	}

	@When("user can pass the data in input field")
	public void user_can_pass_the_data_in_input_field() {
		passAData(pom.getLop().getAmazonSearch(), "Books");
		clickOnWebelem(pom.getLop().getClickSearch());
	}

	@When("user can select a random product in present page")
	public void user_can_select_a_random_product_in_present_page() {
		System.out.println("productClick");
	}

	@Then("user can get a title and validate")
	public void user_can_get_a_title_and_validate() {
		getTitle();
	}
	@Given("user can take a snap at every scenario")
	public void user_can_take_a_snap_at_every_scenario() {
		getUrl("https://www.amazon.in");
		screenShot("snapDone");
	}
	
	@When("user can pass the data  in {string}")
	public void user_can_pass_the_data_in(String string) {
		passAData(pom.getLop().getAmazonSearch(), string);
		clickOnWebelem(pom.getLop().getClickSearch());
	}

}
