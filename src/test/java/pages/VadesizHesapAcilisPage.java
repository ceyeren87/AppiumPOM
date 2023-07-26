package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VadesizHesapAcilisPage {

    public VadesizHesapAcilisPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Vadesiz mevduat hesabıyla bankacılık işlemlerinizi kolaylıkla gerçekleştirin.")
    public WebElement vadesizAcilis;

    @AndroidFindBy(uiAutomator = "text(\"Merkez Şube\")")
    public WebElement merkezSubeSec;

    @AndroidFindBy(uiAutomator = "text(\"TL - Türk Lirası\")")
    public WebElement turkLirasiSec;

    @AndroidFindBy(uiAutomator = "text(\"Bankacılık İşlemleri Komisyon ve Ücret Bilgi Formunu okudum, onaylıyorum.\")")
    public WebElement bankislemleriBilgiFormuOnaylama;

    @AndroidFindBy(accessibility = "Fibabanka Şubesi'nden teslim almak istiyorum.")
    public WebElement fibabankaSubesindenTeslimAlmakistiyorum;

    @AndroidFindBy(uiAutomator = "text(\"Hesap Cüzdanı Bilgilendirmesi'ni okudum, onaylıyorum.\")")
    public WebElement hesapCuzdaniBilgilendirmesiniOkudum;

    @AndroidFindBy(uiAutomator = "text(\"Hesaplarım\")")
    public WebElement vadesizHesapAcilisGerceklesti;
}
