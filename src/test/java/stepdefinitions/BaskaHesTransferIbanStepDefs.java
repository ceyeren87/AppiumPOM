package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BaskaHesTransferIbanPage;
import pages.LoginPage;
import pages.OrtakPage;
import static utilities.ReusableMethods.*;

import java.awt.*;

public class BaskaHesTransferIbanStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    LoginPage loginPage = new LoginPage();
    BaskaHesTransferIbanPage baskaHesTransferIbanPage = new BaskaHesTransferIbanPage();

    @Given("Login olunur")
    public void login_olunur() throws InterruptedException, AWTException {
       LoginStepDefs.Login(LoginStepDefs.mobileAndroidUser);
    }

    @When("İşlemler butonuna tıklanır")
    public void işlemler_butonuna_tıklanır() {
       clickJS(ortakPage.islemler);
    }

    @When("Para Transferleri butonuna tıklanır")
    public void para_transferleri_butonuna_tıklanır() {
        clickJS(ortakPage.paraTransferleri);
    }

    @When("Başka Hesaba Transfer butonuna tıklanır")
    public void başka_hesaba_transfer_butonuna_tıklanır() {
         clickJS(ortakPage.baskaHesabaTransfer);
         popUp(loginPage.popUpHayir);
    }

    @When("Tutar{string}girilir")
    public void tutar_girilir(String string) {
        waitFor(4);
       sendKeys(ortakPage.tutarGiris,string);
    }

    @When("Iban girilir")
    public void ıban_girilir() {
        sendKeys(baskaHesTransferIbanPage.ibanGiris,"TR190004601283888000008495");
    }

    @When("Ad Soyad girilir")
    public void ad_soyad_girilir() {
        waitFor(2);
        sendKeys(baskaHesTransferIbanPage.adSoyad,"ALİ AĞARDAN");
    }

    @When("Devam butonuna basılır")
    public void devam_butonuna_basılır() {
        clickJS(ortakPage.devamBtn);
        popUp(loginPage.popUpHayir);
    }

    @When("Onay butonuna basılır")
    public void onay_butonuna_basılır() {
        clickJS(ortakPage.onayBtn);
    }

    @Then("İşlemin başarıyla tamamlandığı doğrulanır")
    public void işlemin_başarıyla_tamamlandığı_doğrulanır() {
        assertTrue(ortakPage.paraTransferiGerçekleşti);
    }
}
