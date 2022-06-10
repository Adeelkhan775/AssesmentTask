package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefination"},
monochrome=true,
//plugin={"pretty","html:target/Reports/HtmlReports.html"},
plugin={"pretty","junit:target/Reports/JsonReports.xml",
		"html:target/Reports/HtmlReports.html",
		"json:target/Reports/HtmlReports.json"
		}

		//tags="@smokeTest"
)

public class TestRunner {

}
