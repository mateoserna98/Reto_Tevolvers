package com.tevolvers.certification.api.stepdefinitions;

import com.tevolvers.certification.api.models.UpdateData;
import com.tevolvers.certification.api.tasks.UpdateBooking;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

import static com.tevolvers.certification.api.utils.EndPoint.BASE_URL;

public class EscenarioUpdateStepDefinitions {
    @Before
    public void Start(){
        OnStage.setTheStage(Cast.whereEveryoneCan(CallAnApi.at(BASE_URL)));
        OnStage.theActorCalled("User");
    }


    @When("^The user send the booking request$")
    public void theUserSendTheBookingRequest(List<UpdateData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateBooking.toUpdate(data));
    }


    @Then("^The user should see a status code (.*)")
    public void theUserShouldSeeAStatusCode(String arg1) {

    }

    @Then("^The user will se the following data$")
    public void theUserWillSeTheFollowingData(DataTable arg1) {

    }
}
