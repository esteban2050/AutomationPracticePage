package com.automationpractice.steptostep.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/automation_practice.feature",
                 glue="com.automationpractice.steptostep.stepdefinitions",
                 snippets= SnippetType.CAMELCASE)
public class BuyDressRunner {

}
