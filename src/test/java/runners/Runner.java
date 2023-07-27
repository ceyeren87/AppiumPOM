package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        features = "./src/test/resources/features/hesaplar/MevduatHesapKapama.feature",
        glue = {"stepdefinitions", "hooks"},
        //tags = "@deneme",
        dryRun = false
)

public class Runner{
}
