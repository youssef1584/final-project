package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "C:\\Users\\youss\\IdeaProjects\\final-project\\src\\test\\resources\\Features",
            glue = "bddFinal.StepDefinitions",
           tags = "@Smoke",
            dryRun = false,
            monochrome = true,
           snippets = CucumberOptions.SnippetType.CAMELCASE,
           plugin = {
                  "html:target/cucumber-report/report.html",
                    "pretty",
            }
    )
    public class TestRunner {
    }


