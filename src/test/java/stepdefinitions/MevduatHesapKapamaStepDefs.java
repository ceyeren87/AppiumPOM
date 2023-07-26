package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MevduatHesapKapamaPage;
import pages.OrtakPage;
import pages.VadesizHesapKapamaPage;

import static utilities.ReusableMethods.*;

public class MevduatHesapKapamaStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    MevduatHesapKapamaPage mevduatHesapKapamaPage = new MevduatHesapKapamaPage();

    @When("Kapatılacak mevduat hesap seçilir")
    public void kapatılacak_mevduat_hesap_seçilir() {
        waitFor(5);
        clickJS(mevduatHesapKapamaPage.vadeliHesapSec);
    }

    @When("Vadeli mevduat vadesinden önce kapatma")
    public void vadeli_mevduat_vadesinden_önce_kapatma() {
        waitFor(4);
        clickJS(mevduatHesapKapamaPage.vadeliHesapVadesindenOnceKapatma);
    }
}
