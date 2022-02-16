package com.tevolvers.certification.challenge.tasks;

import com.tevolvers.certification.challenge.userinterfaces.PhoneProducts;
import com.tevolvers.certification.challenge.userinterfaces.PrincipalCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddPhones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PrincipalCategories.BTN_PHONES, isVisible())
                .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_PHONES),
                Click.on(PhoneProducts.PHONE_NOKIA),
                AddCart.withAdd(),
                AceptAlert.toAcept(),
                WaitUntil.the(PrincipalCategories.BTN_HOME, isVisible())
                .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_HOME),
                Click.on(PrincipalCategories.BTN_PHONES),
                Click.on(PhoneProducts.PHONE_SAMSUNG),
                AddCart.withAdd(),
                AceptAlert.toAcept()
        );
    }

    public static AddPhones withPhone(){
        return Tasks.instrumented(AddPhones.class);
    }
}
