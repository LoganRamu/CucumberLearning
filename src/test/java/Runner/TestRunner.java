package Runner;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = "rerun:target/rerun.txt",
        features = {"src//test//resources//features"},
        glue = "Step_Def",
        dryRun = false,
        monochrome = true,
        tags = "@Test1"
)
public class TestRunner {

}
