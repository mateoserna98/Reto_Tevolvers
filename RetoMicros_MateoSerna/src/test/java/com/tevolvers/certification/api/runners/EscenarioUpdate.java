package com.tevolvers.certification.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/escenarioUpdate.feature",
        glue = "com.tevolvers.certification.api.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class EscenarioUpdate {
}