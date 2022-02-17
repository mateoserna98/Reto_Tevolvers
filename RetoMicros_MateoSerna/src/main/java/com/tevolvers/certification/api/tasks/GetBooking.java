package com.tevolvers.certification.api.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.tevolvers.certification.api.utils.EndPoint.GET_PATH;

public class GetBooking implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(GET_PATH)
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                ));
    }

    public static GetBooking toGet(){
        return Tasks.instrumented(GetBooking.class);
    }
}
