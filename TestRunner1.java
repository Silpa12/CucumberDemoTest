package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"stepDefinitions"},
tags=("@hooks1"),
dryRun=false,monochrome=true)

public class TestRunner1 {

}
