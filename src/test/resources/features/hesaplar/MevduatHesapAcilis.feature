Feature: Hesaplar

  Scenario: Kiraz Hesap Acilis
    Given MobileUser Kullanıcısı ile Login olunur.
    When İşlemler butonuna tıklanır
    And Hesaplar butonuna tıklanır
    And Yeni Hesap Aç butonuna tıklanır
    And EMevduat Hesap Aç seçilir
    And Tutar"3000"girilir
    And Lütfen seçiniz tıklanır
    And Ana para ve faiz yenilenmeden kapatılsın
    And Hesapla butonuna tıklanır
    And Scroll Up yapılır
    And Devam butonuna basılır
    And Fibabanka şubesinden teslim almak istiyorum işaretlenir
    And Hesap cüzdanı bilgilendirmesini okudum işaretlenir
    And Onay butonuna basılır
    Then Mevduat Hesap Açılışı gerçekleşir