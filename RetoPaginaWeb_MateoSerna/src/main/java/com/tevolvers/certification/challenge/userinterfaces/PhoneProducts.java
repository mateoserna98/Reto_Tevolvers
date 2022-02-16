package com.tevolvers.certification.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhoneProducts {
    public static final Target PHONE_NOKIA = Target.the("This is the phone Nokia Lumia").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));

    public static final Target PHONE_SAMSUNG = Target.the("This is the phone Samsung S7").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
}