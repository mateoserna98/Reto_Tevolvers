package com.tevolvers.certification.api.stepdefinitions;

import com.tevolvers.certification.api.tasks.GetBooking;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.tevolvers.certification.api.utils.EndPoint.BASE_URL;

public class EscenarioGetStepDefinitions {

    @Given("^The user enters to the API$")
    public void theUserEntersToTheAPI() {
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(BASE_URL)));
        OnStage.theActorCalled("User");
    }

    @When("^The user send the get booking request$")
    public void theUserSendTheGetBookingRequest() {
        OnStage.theActorInTheSpotlight().attemptsTo(GetBooking.toGet());
    }

    @Then("^The user should see a successful response$")
    public void theUserShouldSeeASuccessfulResponse() {

    }
}
