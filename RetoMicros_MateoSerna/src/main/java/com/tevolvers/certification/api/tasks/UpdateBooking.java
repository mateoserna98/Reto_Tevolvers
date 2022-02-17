package com.tevolvers.certification.api.tasks;

import com.tevolvers.certification.api.models.UpdateData;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;

import static com.tevolvers.certification.api.utils.EndPoint.UPDATE_PATH;

public class UpdateBooking implements Task {

    private List<UpdateData> data;

    public UpdateBooking(List<UpdateData> data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Put.to(UPDATE_PATH)
                .with(requestSpecification -> requestSpecification
                .contentType(ContentType.JSON).body(data.get(0))
                .log().all()
                ));
    }

    public static UpdateBooking toUpdate(List<UpdateData> data){
        return Tasks.instrumented(UpdateBooking.class, data);
    }
}