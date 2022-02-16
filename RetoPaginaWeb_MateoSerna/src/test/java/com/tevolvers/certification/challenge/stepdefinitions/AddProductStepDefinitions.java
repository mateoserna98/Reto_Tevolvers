package com.tevolvers.certification.challenge.stepdefinitions;

import com.tevolvers.certification.challenge.tasks.AddLaptops;
import com.tevolvers.certification.challenge.tasks.AddMonitors;
import com.tevolvers.certification.challenge.tasks.AddPhones;
import com.tevolvers.certification.challenge.tasks.CartProducts;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class AddProductStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void SetUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("user");
    }

    @Given("^The user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));
    }

    @When("^The user selects the categories to take a products$")
    public void theUserSelectsTheCategoriesToTakeAProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddPhones.withPhone());
        OnStage.theActorInTheSpotlight().attemptsTo(AddLaptops.withLaptop());
        OnStage.theActorInTheSpotlight().attemptsTo(AddMonitors.withMonitor());
        OnStage.theActorInTheSpotlight().attemptsTo(CartProducts.inTheCart());
    }

    @Then("^The user verify the products on the car market$")
    public void theUserVerifyTheProductsOnTheCarMarket() {

    }
}