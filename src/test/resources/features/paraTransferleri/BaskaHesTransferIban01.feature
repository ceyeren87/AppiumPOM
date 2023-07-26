Feature: Para Transferleri

  Scenario: Başka Hesaba Transfer Iban
    Given Login olunur
    When İşlemler butonuna tıklanır
    And Para Transferleri butonuna tıklanır
    And Başka Hesaba Transfer butonuna tıklanır
    And Tutar"100"girilir
    And Iban girilir
    And Ad Soyad girilir
    And Devam butonuna basılır
    And Onay butonuna basılır
    Then İşlemin başarıyla tamamlandığı doğrulanır