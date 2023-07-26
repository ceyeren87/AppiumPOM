package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KirazHesabiVadesizHesabaDonusturPage;
import pages.OrtakPage;

import static utilities.ReusableMethods.*;

public class KirazHesabiVadesizHesabaDonusturStepDefs {

    OrtakPage ortakPage = new OrtakPage();
    KirazHesabiVadesizHesabaDonusturPage kirazHesabiVadesizHesabaDonusturPage = new KirazHesabiVadesizHesabaDonusturPage();

    @When("Vadesiz hesaba dönüştür tıklanır")
    public void vadesiz_hesaba_dönüştür_tıklanır() {
       clickJS(kirazHesabiVadesizHesabaDonusturPage.vadesizHesabaDonustur);
    }

    @Then("İşleminiz başarıyla tamamlanmıştır")
    public void işleminiz_başarıyla_tamamlanmıştır() {
        assertTrue(ortakPage.isleminizBasariylaTamamlanmistir);
    }

}
