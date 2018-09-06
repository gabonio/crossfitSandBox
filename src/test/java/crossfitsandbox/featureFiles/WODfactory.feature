Feature: Generate a new WOD

  Scenario: Create a basic WOD
    Given that I want a new WOD
    And the name of the new WOD is "BasicWod"
    And is NOT a Hero WOD
    And the WOD is 60 minutes long

    Then the new WOD must be named "BasicWod"
    And the new WOD must be 60 minutes long
    And the new WOD must NOT be a hero WOD