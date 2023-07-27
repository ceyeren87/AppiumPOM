package hooks;

import appiumserver.AppiumServer;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import stepdefinitions.LoginStepDefs;
import utilities.Driver;

public class Hooks {

    @BeforeAll
    public static void setUp() throws Exception {
        //Her testten once Appium server programatik olarak baslatiliyor...
        AppiumServer.start();
    }

    @After
    public void tearDownScenarios(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed-scenario-" + scenario.getName());
        }
        Driver.closeDriver();
    }

    @AfterAll
    public static void stopServer(){
        AppiumServer.stop();
    }

}
