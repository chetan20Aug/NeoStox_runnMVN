package neoRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature"},
		glue= {"stepDefination"},
		
		monochrome =true,
		tags="@NeoRun",
	    plugin= {"pretty","html:targets/Report.html"}
		
		)
public class RunnerClass
{

}
