package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( features= {"C:\\Users\\anand\\Documents\\Saru\\GitSample\\GitDemo\\CucumberDucks_Project\\src\\main\\resources\\Features\\ducks.feature"},
                  glue= {"stepDef"},
                  format= {"pretty","html:target1/Ducks_Report","json:target/Ducks_report.json"},
                  
                   monochrome=true,
                   strict=true,
                   dryRun=false)


public class runTest  extends AbstractTestNGCucumberTests{

}
