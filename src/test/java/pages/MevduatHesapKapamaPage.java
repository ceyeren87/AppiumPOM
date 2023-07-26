package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MevduatHesapKapamaPage {

    public MevduatHesapKapamaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Vadeli Hesap TL")
    public WebElement vadeliHesapSec;

    @AndroidFindBy(uiAutomator = "text(\"Vadeli mevduat hesabınızı vadesinden önce kapatıyorsunuz. Bu nedenle, hesabınız faiz ödemesi yapılmadan kapatılacak ve sadece anaparanız, ilgili vadesiz hesabınıza aktarılacaktır.\")")
    public WebElement vadeliHesapVadesindenOnceKapatma;

}
