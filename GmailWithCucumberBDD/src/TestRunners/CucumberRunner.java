package TestRunners;

import org.junit.runner.RunWith;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/LoginGmail.feature",".//Features/ComposeEmail.feature"},format= {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue= {"Tests"},
dryRun=false
//plugin="pretty",
//monochrome= true
)


public class CucumberRunner extends AbstractTestNGCucumberTests{

}
