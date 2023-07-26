package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VadesizHesabiKirazaDonusturPage {

    public VadesizHesabiKirazaDonusturPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "00100 - 32365515")
    public WebElement hesapSecilir;

    @AndroidFindBy(uiAutomator = "text(\"Kiraz Hesap'a Dönüştür\")")
    public WebElement kirazHesabaDonustur;

    @AndroidFindBy(uiAutomator = "text(\"Kiraz Hesap Sözleşmesini okudum, onaylıyorum.\")")
    public WebElement kirazHesapSozlesmesiniOkudum;


}
