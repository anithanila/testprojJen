package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(

features = {"src/test/resources/testfea.feature"},
plugin={"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json"},
glue={"step"},

tags = {"@tag"}

)



public class runnerClass extends AbstractTestNGCucumberTests{

	
}

	

