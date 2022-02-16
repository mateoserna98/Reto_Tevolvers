package com.tevolvers.certification.challenge.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalCategories {
    public static final Target BTN_HOME = Target.the("Home button").
            located(By.xpath("//*[@id=\"nava\"]"));

    public static final Target BTN_PHONES = Target.the("Phones categories button").
            located(By.xpath("//*[@id=\"itemc\"]"));

    public static final Target BTN_LAPTOPS = Target.the("Laptops categories button").
    located(By.xpath("//a[contains(text(),'Laptops')]"));

    public static final Target BTN_MONITORS = Target.the("Monitors categories button").
            located(By.xpath("//a[contains(text(),'Monitors')]"));

    public static final Target ADD_CART = Target.the("This is the add cart button").
            located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    public static final Target BTN_CART = Target.the("This is the cart button").
            located(By.xpath("//*[@id=\"cartur\"]"));

    public static final Target BTN_ORDER = Target.the("This is the order button").
            located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
}