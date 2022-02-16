package com.tevolvers.certification.challenge.tasks;

import com.tevolvers.certification.challenge.userinterfaces.PrincipalCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CartProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PrincipalCategories.BTN_CART, isEnabled())
                        .forNoMoreThan(5).seconds(),
                         Click.on(PrincipalCategories.BTN_CART),
                WaitUntil.the(PrincipalCategories.BTN_ORDER, isEnabled())
                        .forNoMoreThan(5).seconds()
        );
    }

    public static CartProducts inTheCart(){
        return Tasks.instrumented(CartProducts.class);
    }
}