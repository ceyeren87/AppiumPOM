Feature: Hesaplar

  Scenario: Vadesiz Hesabı Kiraz Hesaba Dönüştür
    Given MobileUser Kullanıcısı ile Login olunur.
    When İşlemler butonuna tıklanır
    And Hesaplar butonuna tıklanır
    And Hesap seçilir
    And Kiraz hesaba dönüştür butonuna basılır
    And Bankacılık işlemleri bilgi formu onaylanır
    And Onay butonuna basılır
    And Kiraz hesap sözleşmesini okudum onaylıyorum
    And Onay butonuna basılır
    And Devam butonuna basılır
    And Onay butonuna basılır
    Then Vadesiz Hesap Açılışı gerçekleşir