Feature: Addition

  Scenario Outline: addition, c est a tester
    Given first parameter <add1>
    And second parameter <add2>
    When appel ws : pension retraite
    Then I should have <result>

    Examples:
      | add1 | add2 | result |
      |    2 |   2 |    4 |
      |    6 |   8 |   14 |
      |    24  |   18  |   42 |
