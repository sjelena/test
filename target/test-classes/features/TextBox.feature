Feature: QA demo tools

  Scenario: Text box
    When I will enter values in fields and click on Submit button
    Then I verify result

  Scenario: Check box
    Given Open check box page
    When I will check some values from check box
    Then I will check if the check is selected
