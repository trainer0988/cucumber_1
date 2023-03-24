package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = { "html:target/test/cucumber.html"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@Sanity"       
        )
public class CucumberRunner extends AbstractTestNGCucumberTests
{
	
	

}
