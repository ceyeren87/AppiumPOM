Feature: Hesaplar

  Scenario: Vadesiz Hesap Kapama
    Given MobileUser Kullanıcısı ile Login olunur.
    When İşlemler butonuna tıklanır
    And Hesaplar butonuna tıklanır
    And Kapatılacak mevduat hesap seçilir
    And Diğer hesap işlemleri seçilir
    And Hesap kapama seçilir
    And Vadeli mevduat vadesinden önce kapatma
    And Onay butonuna basılır
    Then Hesap kapama gerçekleşir