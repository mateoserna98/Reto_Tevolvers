package com.tevolvers.certification.api.tasks;

import com.tevolvers.certification.api.models.SendData;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

import static com.tevolvers.certification.api.utils.EndPoint.CREATE_PATH;

public class CreateBooking implements Task {

    private List<SendData> data;

    public CreateBooking(List<SendData> data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(CREATE_PATH)
                .with(requestSpecification -> requestSpecification
                .contentType(ContentType.JSON).body(data.get(0))
                        .log().all()
                ));
    }

    public static CreateBooking toCreate(List<SendData> data){
        return Tasks.instrumented(CreateBooking.class, data);
    }
}
