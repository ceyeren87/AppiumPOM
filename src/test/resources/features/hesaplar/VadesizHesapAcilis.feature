Feature: Hesaplar

  Scenario: Vadesiz Hesap Acilis
    Given MobileUser Kullanıcısı ile Login olunur.
    When İşlemler butonuna tıklanır
    And Hesaplar butonuna tıklanır
    And Yeni Hesap Aç butonuna tıklanır
    And Vadesiz Hesap Aç seçilir
    And Lütfen seçiniz tıklanır
    And Merkez Şb seçilir
    And Lütfen seçiniz tıklanır
    And Türk Lirası seçilir
    And Bankacılık işlemleri bilgi formu onaylanır
    And Onay butonuna basılır
    And Devam butonuna basılır
    And Fibabanka şubesinden teslim almak istiyorum işaretlenir
    And Hesap cüzdanı bilgilendirmesini okudum işaretlenir
    And Onay butonuna basılır
    Then Vadesiz Hesap Açılışı gerçekleşir