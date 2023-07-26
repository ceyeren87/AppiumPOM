package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrtakPage;
import pages.VadesizHesapAcilisPage;
import pages.VadesizHesapKapamaPage;

import static utilities.ReusableMethods.*;

public class VadesizHesapKapamaStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    VadesizHesapKapamaPage vadesizHesapKapamaPage = new VadesizHesapKapamaPage();

    @When("Kapatılacak hesap seçilir")
    public void kapatılacak_hesap_seçilir() {
        waitFor(4);
        clickJS(vadesizHesapKapamaPage.vadesizHesapSec);
    }

    @When("Diğer hesap işlemleri seçilir")
    public void diğer_hesap_işlemleri_seçilir() {
        clickJS(vadesizHesapKapamaPage.digerHesapislemleri);
    }

    @When("Hesap kapama seçilir")
    public void hesap_kapama_seçilir() {
        clickJS(vadesizHesapKapamaPage.hesapKapama);
    }

    @Then("Hesap kapama gerçekleşir")
    public void hesap_kapama_gerçekleşir() {
        assertTrue(vadesizHesapKapamaPage.hesapKapamaGerceklesti);
    }
}
