package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();


    @Given("^I enter on Google page$")
    public void navigateToHopping(){
        google.navigateToGoogle();
    }

    @When("^I click on JOIN TODAY button$")
    public void clickUserButton(){

    }

    @And("^I fill out the form$")
    public void clickRegisterButton(){

    }

    @Then("^validate the results$")
    public void validateResults(){
        BasePage.closeBrowser();
    }
    
}
