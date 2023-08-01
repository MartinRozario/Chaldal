package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/001_Task1.feature"},
        glue = {"StepDefs"},   monochrome = true,
       dryRun = false,
        tags = "@Cookup",
      plugin = {"pretty","html:build/reports/feature.html"})
@Test
class CookupRunner extends AbstractTestNGCucumberTests{
}