Feature: Clear Error Messages

  Scenario: Display clear error messages for invalid document format
    Given the user is on the "Renewal Request" section
    When the user attempts to upload a document in an invalid format
    Then a clear error message "Invalid format" is displayed