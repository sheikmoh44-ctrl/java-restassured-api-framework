package com.sheik.api.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = "com.sheik.api.stepdefinitions",
		plugin = {"pretty","json:target\\output.json", "html:target\\output.html"}
		)
public class TestRunner {

}
