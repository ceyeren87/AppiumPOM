Feature: Hesaplar

  Scenario: Kiraz Hesabı Vadesiz Hesaba Dönüştür
    Given MobileUser Kullanıcısı ile Login olunur.
    When İşlemler butonuna tıklanır
    And Hesaplar butonuna tıklanır
    And Hesap seçilir
    And Diğer hesap işlemleri seçilir
    And Vadesiz hesaba dönüştür tıklanır
    And Onay butonuna basılır
    Then İşleminiz başarıyla tamamlanmıştır