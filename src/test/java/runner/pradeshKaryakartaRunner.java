package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features = "src/src/test/features/Pradesh/pradesh.feature", glue = { "stepdefinations",
        "hooks" }, publish = true, plugin = {"pretty", "html:target/CucumberReports/CucumberPradeshRepor.html" } ,

        tags="@Test_with_few_data"
)

public class pradeshKaryakartaRunner extends AbstractTestNGCucumberTests {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}

}
