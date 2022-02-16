package com.tevolvers.certification.challenge.tasks;

import com.tevolvers.certification.challenge.userinterfaces.PrincipalCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AddCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PrincipalCategories.ADD_CART, isEnabled())
                .forNoMoreThan(10).seconds(),
                Click.on(PrincipalCategories.ADD_CART)
        );
    }

    public static AddCart withAdd(){
        return Tasks.instrumented(AddCart.class);
    }
}