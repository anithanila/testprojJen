package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(

features = {"src/test/resources/testfea.feature"},
//plugin = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
glue={"step"},

tags = {"@tag"}

)



public class runnerClass extends AbstractTestNGCucumberTests{

	
}

	

