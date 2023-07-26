package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KirazHesabiVadesizHesabaDonusturPage {

    public KirazHesabiVadesizHesabaDonusturPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(uiAutomator = "text(\"Vadesiz Hesap'a Dönüştür\")")
    public WebElement vadesizHesabaDonustur;
}
