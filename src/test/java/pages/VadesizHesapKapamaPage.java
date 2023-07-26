package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VadesizHesapKapamaPage {

    public VadesizHesapKapamaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "0,00 TL")
    public WebElement vadesizHesapSec;

    @AndroidFindBy(uiAutomator = "text(\"Diğer Hesap İşlemleri\")")
    public WebElement digerHesapislemleri;

    @AndroidFindBy(uiAutomator = "text(\"Hesap Kapama\")")
    public WebElement hesapKapama;

    @AndroidFindBy(accessibility = "Hesap kapama işleminiz gerçekleşmiştir.")
    public WebElement hesapKapamaGerceklesti;
}
