Feature: QA demo tools

  Scenario: Text box
    Given Open text box page
    When I will enter values in fields and click on Submit button
    Then I verify result

  Scenario: Check box
    Given Open check box page
    When I will check some values from check box
    Then I will check if the check is selected

  Scenario: Web tables
    Given Open web tables page
    When I will enter values in form
    Then I check if the data is entered in the table

  Scenario: Buttons
    Given Open buttons page
    When I will click on all buttons
    Then Validation

  Scenario: Links
    Given Open links page
    When I will click on links
    Then Links validation

  Scenario: Forms
    Given Open forms page
    When I will enter values in form fields
    Then Submit