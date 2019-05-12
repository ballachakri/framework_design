package com.cath.project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src/test",
        tags={"@login"},
        dryRun = false,
        plugin = {"json:src/test/java/cathExercise.json"},
        format={"html:src/test/java/cucumberReport"})

public class TestRunner {
}

