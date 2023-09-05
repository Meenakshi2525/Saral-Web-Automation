package ParallelPackege;

//import org.junit.runner.RunWith;
import org.testng. annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\src\\test\\resurces\\ParallelPackege"},
		glue = {"ParallelPackege"},
//      glue= {"src\\test\\java\\ParallelPackege"}, //
        plugin = {"pretty","html:target/CucumberReports/CucumberReport.html", "timeline:test-output-thread/"},
        dryRun = false
        )

public class parallelRunner extends  AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
	
	

}
