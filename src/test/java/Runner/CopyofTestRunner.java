package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
                 glue={"stepDefination"},
                 plugin={"html:target/cucmber-html-report"}
) 
public class CopyofTestRunner {

}