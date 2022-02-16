package com.tevolvers.certification.challenge.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_product.feature",
                glue = "com.tevolvers.certification.challenge.stepdefinitions",
                snippets = SnippetType.CAMELCASE
)

public class AddProduct {
}