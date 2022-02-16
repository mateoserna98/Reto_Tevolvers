package com.tevolvers.certification.challenge.tasks;

import com.tevolvers.certification.challenge.userinterfaces.LaptopsProducts;
import com.tevolvers.certification.challenge.userinterfaces.PrincipalCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddLaptops implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PrincipalCategories.BTN_HOME, isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_HOME),
                Click.on(PrincipalCategories.BTN_LAPTOPS),
                Click.on(LaptopsProducts.LAPTOP_DELL),
                AddCart.withAdd(),
                WaitUntil.the(PrincipalCategories.BTN_HOME, isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_HOME),
                Click.on(PrincipalCategories.BTN_LAPTOPS),
                Click.on(LaptopsProducts.LAPTOP_MAC),
                AddCart.withAdd()
        );
    }

    public static AddLaptops withLaptop(){
        return Tasks.instrumented(AddLaptops.class);
    }
}