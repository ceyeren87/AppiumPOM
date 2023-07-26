package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BaskaHesTransferKayitliAliciibanPage {

    public BaskaHesTransferKayitliAliciibanPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Para Gönder")
    public WebElement paraGonder;

    @AndroidFindBy(uiAutomator = "text(\"Test\")")
    public WebElement testBtn;

}
