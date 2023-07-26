package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrtakPage;
import pages.VadesizHesapAcilisPage;
import static utilities.ReusableMethods.*;

import java.awt.*;

public class VadesizHesapAcilisStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    VadesizHesapAcilisPage vadesizHesapAcilisPage = new VadesizHesapAcilisPage();

    @Given("MobileUser Kullanıcısı ile Login olunur.")
    public void kullanıcısı_ile_login_olunur() throws InterruptedException, AWTException {
        LoginStepDefs.Login(LoginStepDefs.mobileAndroidUser);
    }
    @When("Hesaplar butonuna tıklanır")
    public void hesaplar_butonuna_tıklanır() {
        clickJS(ortakPage.hesaplar);
        waitFor(6);
    }
    @When("Yeni Hesap Aç butonuna tıklanır")
    public void yeni_hesap_aç_butonuna_tıklanır() {
        clickJS(ortakPage.yeniHesapAc);
    }
    @When("Vadesiz Hesap Aç seçilir")
    public void vadesiz_hesap_aç_seçilir() {
        clickJS(vadesizHesapAcilisPage.vadesizAcilis);
    }

    @When("Lütfen seçiniz tıklanır")
    public void lütfen_seçiniz_tıklanır() {
        waitFor(5);
        clickJS(ortakPage.lutfenSeciniz);
    }
    @When("Merkez Şb seçilir")
    public void merkez_şb_seçilir() {
        scrollUpUIAutomator("Merkez Şube");
        clickJS(vadesizHesapAcilisPage.merkezSubeSec);
    }
    @When("Türk Lirası seçilir")
    public void türk_lirası_seçilir() {
        clickJS(vadesizHesapAcilisPage.turkLirasiSec);
    }

    @When("Bankacılık işlemleri bilgi formu onaylanır")
    public void bankacılık_işlemleri_bilgi_formu_onaylanır() {
        clickJS(vadesizHesapAcilisPage.bankislemleriBilgiFormuOnaylama);
    }
    @When("Fibabanka şubesinden teslim almak istiyorum işaretlenir")
    public void fibabanka_şubesinden_teslim_almak_istiyorum_işaretlenir() {
        clickJS(vadesizHesapAcilisPage.fibabankaSubesindenTeslimAlmakistiyorum);
    }
    @When("Hesap cüzdanı bilgilendirmesini okudum işaretlenir")
    public void hesap_cüzdanı_bilgilendirmesini_okudum_işaretlenir() {
        clickJS(vadesizHesapAcilisPage.hesapCuzdaniBilgilendirmesiniOkudum);
    }
    @Then("Vadesiz Hesap Açılışı gerçekleşir")
    public void vadesiz_hesap_açılışı_gerçekleşir() {
        assertTrue(vadesizHesapAcilisPage.vadesizHesapAcilisGerceklesti);
    }

}
