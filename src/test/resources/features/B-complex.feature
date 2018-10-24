Feature: Complexe Mockito



  Scenario: test simple sans mock
    When  complexe : milieu
    Then  resultat attendu : pretestpost

  Scenario: test simple avec mock prefixe
  Given mock prefixe : prepre
  When  complexe : milieu
  Then  resultat attendu : mockpretestpost

  Scenario: test simple avec mock suffixe
  Given mock suffixe : fifixe
  When  complexe : milieu
  Then  resultat attendu : mockpretestpost


