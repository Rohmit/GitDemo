package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/java/features/Tags.feature",
    glue="stepDefinations",
    plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml",
    		"html:target/cucumber-reports",
    		"json:target/cucumber-reports/Cucumber.json"},
    monochrome=true,
    strict=true,
    dryRun=true,
   tags= {"~@smoke,@Regression"}   //Ignore smoke tags
    //tags= {"@smoke,@Regression"}  //OR Conditions  (Execute all the test test cases having smoke OR Regression tags )
   // tags= {"@smoke","@Regression"}  // AND Conditions  (Execute  the test cases having smoke AND Regression tags)
    
    
   )

public class TestRunner {

}

//Running with TestNG

/*public class TestRunner extends AbstractTestNGCucumberTests {

}

*/