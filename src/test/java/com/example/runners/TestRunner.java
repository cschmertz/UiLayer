package com.example.runners;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestRunner {
}
