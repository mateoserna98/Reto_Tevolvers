package com.tevolvers.certification.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MonitorsProducts {
    public static final Target MONITOR_APPLE = Target.the("This is the Apple monitor").
            located(By.xpath("//a[contains(text(),'Apple monitor 24')]"));

    public static final Target MONITOR_ASUS = Target.the("This is the Asus monitor").
            located(By.xpath("//a[contains(text(),'ASUS Full HD')]"));
}
