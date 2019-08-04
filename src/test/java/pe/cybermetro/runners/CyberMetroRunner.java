package pe.cybermetro.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/cyber_metro.feature",
		glue = {"pe.cybermetro.stepdefinitions"}
)

public class CyberMetroRunner {
			
}
