package com.tevolvers.certification.challenge.tasks;

import com.tevolvers.certification.challenge.userinterfaces.MonitorsProducts;
import com.tevolvers.certification.challenge.userinterfaces.PrincipalCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddMonitors implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PrincipalCategories.BTN_HOME, isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_HOME),
                Click.on(PrincipalCategories.BTN_MONITORS),
                Click.on(MonitorsProducts.MONITOR_APPLE),
                AddCart.withAdd(),
                WaitUntil.the(PrincipalCategories.BTN_HOME, isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PrincipalCategories.BTN_HOME),
                Click.on(PrincipalCategories.BTN_MONITORS),
                Click.on(MonitorsProducts.MONITOR_ASUS),
                AddCart.withAdd()
        );
    }

    public static AddMonitors withMonitor(){
        return Tasks.instrumented(AddMonitors.class);
    }
}