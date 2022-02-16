package com.tevolvers.certification.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LaptopsProducts {
    public static final Target LAPTOP_MAC = Target.the("This is the MacBook laptop").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));

    public static final Target LAPTOP_DELL = Target.the("This is the Dell laptop").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
}