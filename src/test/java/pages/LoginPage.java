package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "text(\"Tanıtımı Geç\")")
    public WebElement tanitimiGec;

    @AndroidFindBy(accessibility = "Müşteri Numarası Veya TC Kimlik Numarası")
    public WebElement musteriNumarasiGiris;

    @AndroidFindBy(accessibility = "Şifre")
    public WebElement sifreClick;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"SMS Doğrulama Kodu\"])[2]")
    public WebElement smsDogrulamaKodu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Gönder\"]")
    public WebElement gonder;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"İlgilenmiyorum\"]")
    public WebElement popUpilgilenmiyorum;

    // x Basmak için
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView\n")
    public WebElement popUpClose;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Hayır\"]")
    public WebElement popUpHayir;

}


