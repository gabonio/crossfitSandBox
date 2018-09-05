Feature: Generate a new WOD

  Scenario: Create a basic WOD
    Given that I want a new WOD
    And the name of the new WOD is "RandomWodName"
    And is NOT a Hero WOD
    And the WOD is 60 minutes long

    Then the new wod must be named "RandomWodName"
    And the new wod must be 60 minutes long
    And it must NOT be a hero WOD