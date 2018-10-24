Feature: Division

  Scenario: cas passant :  division de 4 par 2
    Given numerateur : 4 et denominateur : 2
    When  divise
    Then  resultat attendu : 2

  Scenario: cas passant :  division de 10 par 5
    Given numerateur : 10
    And denominateur : 5
    When  divise
    Then  resultat attendu : 2

  Scenario: cas passant :  division de 6 par 2
    Given  numerateur : 6 et denominateur : 2
    When  divise
    Then  resultat attendu : 3

  Scenario: cas qui devrait passer :  division de 8 par 2
    Given numerateur : 8 et denominateur : 2
    When  divise
    Then  resultat attendu : 4

  Scenario: cas non passant :  division de 8 par 0
    Given numerateur : 8 et denominateur : 0
    When  divise
    Then  resultat attendu exception
