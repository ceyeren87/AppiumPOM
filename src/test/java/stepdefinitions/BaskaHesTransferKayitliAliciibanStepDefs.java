package stepdefinitions;

import io.cucumber.java.en.When;
import pages.BaskaHesTransferKayitliAliciibanPage;
import pages.LoginPage;
import pages.OrtakPage;

import static utilities.ReusableMethods.*;

public class BaskaHesTransferKayitliAliciibanStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    LoginPage loginPage = new LoginPage();
    BaskaHesTransferKayitliAliciibanPage baskaHesTransferKayitliAliciiban = new BaskaHesTransferKayitliAliciibanPage();

    @When("Kayıtlı işlemler butonuna tıklanır")
    public void kayıtlı_işlemler_butonuna_tıklanır() {
        clickJS(ortakPage.kayitliIslemler);
    }

    @When("Kayıtlı işlemler Başka Hesaba Transfer butonuna tıklanır")
    public void kayıtlı_işlemler_başka_hesaba_transfer_butonuna_tıklanır() {
        clickJS(ortakPage.kayitliIslemlerBaskaHesabaTransfer);
    }

    @When("Test butonuna tıklanır")
    public void test_butonuna_tıklanır() {
        clickJS(baskaHesTransferKayitliAliciiban.testBtn);
    }

    @When("Para Gönder butonuna tıklanır")
    public void para_gönder_butonuna_tıklanır() {
        clickJS(baskaHesTransferKayitliAliciiban.paraGonder);
        popUp(loginPage.popUpHayir);
    }


}
