package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MevduatHesapAcilisPage {

    public MevduatHesapAcilisPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Tasarruflarınızı değerlendireceğiniz vadeli hesap ile sabit getiri avantajını hemen yakalayın.")
    public WebElement mevduatAcilis;

    @AndroidFindBy(uiAutomator = "text(\"1 Ay\")")
    public WebElement vadeSec;

    @AndroidFindBy(uiAutomator = "text(\"Anapara ve faiz yenilenmeden kapatılsın.\")")
    public WebElement anaParaVeFaizYenilenmedenKapatilsin;

    @AndroidFindBy(uiAutomator = "text(\"Hesapla\")")
    public WebElement hesaplaBtn;

    @AndroidFindBy(uiAutomator = "text(\"Hesaplarım\")")
    public WebElement mevduatHesapAcilisGerceklesti;

}
