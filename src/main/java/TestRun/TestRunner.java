package TestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/FeatureFiles" ,publish = true,
glue = {"StepDefinitions"},
tags = "@Regression",
monochrome = true)

public class TestRunner {
}
