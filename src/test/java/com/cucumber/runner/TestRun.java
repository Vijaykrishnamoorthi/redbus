package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "C:\\Users\\91637\\eclipse-workspace1\\redbus\\src\\test\\resources\\FeatureFiles",
                   glue = {"in.cucumber.StepDefinition","in.redbus.Hooks"},
                   tags = "@sanity or @smoke",
                   dryRun = false,
                   monochrome = true,
                   plugin = {"html:target//cucumber//report.html","json:target//cucumber//report1.html"}
                   )
public class TestRun {

}


