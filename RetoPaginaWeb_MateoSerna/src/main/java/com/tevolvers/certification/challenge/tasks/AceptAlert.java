package com.tevolvers.certification.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.rules.Timeout;

public class AceptAlert implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Timeout.seconds(5);
        BrowseTheWeb.as(actor).getAlert().accept();
    }

    public static AceptAlert toAcept(){
        return Tasks.instrumented(AceptAlert.class);
    }
}