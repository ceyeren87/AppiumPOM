package stepdefinitions;

import io.cucumber.java.en.When;
import pages.OrtakPage;
import pages.VadesizHesabiKirazaDonusturPage;
import static utilities.ReusableMethods.*;

public class VadesizHesabiKirazaDonusturStepDefs {

    VadesizHesabiKirazaDonusturPage vadesizHesabiKirazaDonusturPage = new VadesizHesabiKirazaDonusturPage();

    @When("Hesap seçilir")
    public void hesap_seçilir() {
        clickJS(vadesizHesabiKirazaDonusturPage.hesapSecilir);
    }

    @When("Kiraz hesaba dönüştür butonuna basılır")
    public void kiraz_hesaba_dönüştür_butonuna_basılır() {
        clickJS(vadesizHesabiKirazaDonusturPage.kirazHesabaDonustur);
        waitFor(10);
    }

    @When("Kiraz hesap sözleşmesini okudum onaylıyorum")
    public void kiraz_hesap_sözleşmesini_okudum_onaylıyorum() {
        clickJS(vadesizHesabiKirazaDonusturPage.kirazHesapSozlesmesiniOkudum);
    }
}
