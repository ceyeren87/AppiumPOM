package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    private static UiAutomator2Options options;
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("platformName")) {
                case "Android":
                    options = new UiAutomator2Options()
                            .setAppPackage("com.fibabanka.Fibabanka.preprod")
                            .setAppActivity("com.fibabanka.Fibabanka.preprod.MainActivitynormal")
                            .setUdid("emulator-5554")
                            .setAutomationName("uiautomator2")
                            .setNoReset(false)
                            .setAutoGrantPermissions(true)
                            .setNewCommandTimeout(Duration.ofMinutes(10));

                    try {
                        driver = new AndroidDriver(
                                new URL("http://127.0.0.1:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
            }
            switch (ConfigReader.getProperty("platformName")) {
                case "IOS":
                    //ios ile ilgili konfigurasyonlar buraya...
                case "MobileBrowser":
                    //Mobil içinden browser testi için
                    // driver.get(url) için yeni loginpage oluşturmak gerekiyor
                    options = new UiAutomator2Options()
                            .setUdid("emulator-5554")
                            .setAutomationName("uiautomator2")
                            .setAutoGrantPermissions(true)
                            .withBrowserName("chrome")
                            .setNewCommandTimeout(Duration.ofMinutes(10));

                    try {
                        driver = new AndroidDriver(
                                new URL("http://127.0.0.1:4723"), options
                        );
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
