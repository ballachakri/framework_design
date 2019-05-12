package com.cath.project.StepDefinition;

import com.cath.project.LoginPage;
import com.cath.project.LoginResults;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDef {

    private LoginPage loginPage=new LoginPage ();
    private LoginResults loginResults=new LoginResults ();


    @Given("^i am on the home page$")
    public void i_am_on_the_home_page() {

    }

    @When("^i click on the login button$")
    public void i_click_on_the_login_button() {
loginPage.goToLoginPage ();
    }

    @Then("^i should redirect to login page$")
    public void i_should_redirect_to_login_page() {
String lUrl=loginResults.getLoginURL ();

assertThat("wrong redirection",lUrl.contains  ("ManageAccount"));

    }

    @When("^i enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_my_and(String userid, String password) {
        loginPage.enterEmailId (userid,password);
    }

    @Then("^i should be able to see my account details$")
    public void i_should_be_able_to_see_my_account_details() {

    }

}
