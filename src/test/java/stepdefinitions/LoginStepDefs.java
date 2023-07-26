package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import static utilities.ReusableMethods.*;

public class LoginStepDefs {

    static String mobileAndroidUser = "3410305";

    public static void Login (String userName) throws AWTException, InterruptedException {
        LoginPage loginPage =  new LoginPage();

        clickJS(loginPage.tanitimiGec);
        sendKeys(loginPage.musteriNumarasiGiris,userName);
        clickJS(loginPage.sifreClick);
        waitFor(2);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_9);
        r.keyPress(KeyEvent.VK_6);
        r.keyPress(KeyEvent.VK_3);
        r.keyPress(KeyEvent.VK_8);
        r.keyPress(KeyEvent.VK_5);
        r.keyPress(KeyEvent.VK_2);
        sendKeys(loginPage.smsDogrulamaKodu,"123456");
        waitFor(3);
        doubleClick(loginPage.gonder);
        popUp(loginPage.popUpilgilenmiyorum);
    }
}
