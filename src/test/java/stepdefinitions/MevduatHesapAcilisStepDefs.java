package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MevduatHesapAcilisPage;
import pages.OrtakPage;
import static utilities.ReusableMethods.*;

public class MevduatHesapAcilisStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    MevduatHesapAcilisPage mevduatHesapAcilisPage = new MevduatHesapAcilisPage();

    @When("EMevduat Hesap Aç seçilir")
    public void e_mevduat_hesap_aç_seçilir() {
        clickJS(mevduatHesapAcilisPage.mevduatAcilis);
        waitFor(3);
    }

    @When("Ana para ve faiz yenilenmeden kapatılsın")
    public void ana_para_ve_faiz_yenilenmeden_kapatılsın() {
        clickJS(mevduatHesapAcilisPage.anaParaVeFaizYenilenmedenKapatilsin);
    }

    @When("Hesapla butonuna tıklanır")
    public void hesapla_butonuna_tıklanır() {
        clickJS(mevduatHesapAcilisPage.hesaplaBtn);
        waitFor(3);
    }

    @When("Scroll Up yapılır")
    public void scroll_up_yapılır() {
        scrollUpUIAutomator("Devam");
    }

    @Then("Mevduat Hesap Açılışı gerçekleşir")
    public void mevduat_hesap_açılışı_gerçekleşir() {
        assertTrue(mevduatHesapAcilisPage.mevduatHesapAcilisGerceklesti);
    }


}
