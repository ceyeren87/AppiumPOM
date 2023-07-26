Feature: Para Transferleri

  Scenario: Kayıtlı Alıcı ile Iban Transfer
    Given Login olunur
    When İşlemler butonuna tıklanır
    And Para Transferleri butonuna tıklanır
    And Kayıtlı işlemler butonuna tıklanır
    And Kayıtlı işlemler Başka Hesaba Transfer butonuna tıklanır
    And Test butonuna tıklanır
    And Para Gönder butonuna tıklanır
    And Tutar"100"girilir
    And Devam butonuna basılır
    And Onay butonuna basılır
    Then İşlemin başarıyla tamamlandığı doğrulanır