package com.cath.project.StepDefinition;

import com.cath.project.ResultsPage;
import com.cath.project.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
String searchedItem;
private SearchPage searchPage =new SearchPage ();
private ResultsPage resultsPage =new ResultsPage ();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() {
       String homepageURL= resultsPage.getCurrentURL ();
       assertThat("wrong home page ",homepageURL.contains ("cath"));

    }

    @When("^i have search for a \"([^\"]*)\"$")
    public void i_have_search_for_a(String item) {
     searchedItem=item;
        searchPage.searchItem (item);
     }


    @Then("^i should view all the relevant products$")
    public void i_should_view_all_the_relevant_products()  {
   String item=resultsPage.itemsDisplayed ();
         assertThat ("wrong item displayed",item.contains (searchedItem));
    }


}
