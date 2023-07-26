package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrtakPage {

    public OrtakPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "İşlemler")
    public WebElement islemler;

    @AndroidFindBy(uiAutomator = "text(\"Para Transferleri\")")
    public WebElement paraTransferleri;

    @AndroidFindBy(uiAutomator = "text(\"Hesaplar\")")
    public WebElement hesaplar;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Yeni Hesap Aç\"]")
    public WebElement yeniHesapAc;

    @AndroidFindBy(uiAutomator = "text(\"Başka Hesaba Transfer (EFT , Havale , FAST)\")")
    public WebElement baskaHesabaTransfer;

    @AndroidFindBy(accessibility = "Para Transferi İşleminiz Başarıyla Gerçekleşti!")
    public WebElement paraTransferiGerçekleşti;

    @AndroidFindBy(accessibility = "İşleminiz başarıyla tamamlanmıştır.")
    public WebElement isleminizBasariylaTamamlanmistir;

    @AndroidFindBy(accessibility = "Amount")
    public WebElement tutarGiris;

    @AndroidFindBy(uiAutomator = "text(\"Devam\")")
    public WebElement devamBtn;

    @AndroidFindBy(uiAutomator = "text(\"Onay\")")
    public WebElement onayBtn;

    @AndroidFindBy(uiAutomator = "text(\"Kayıtlı İşlemler\")")
    public WebElement kayitliIslemler;

    @AndroidFindBy(uiAutomator = "text(\"Başka Hesaba Transfer\")")
    public WebElement kayitliIslemlerBaskaHesabaTransfer;

    @AndroidFindBy(uiAutomator = "text(\"Lütfen seçiniz\")")
    public WebElement lutfenSeciniz;
}
