

Feature: Dynamic Table

  @DynamicTable
  Scenario Outline: Going Dynamic Table Page and Get Value of CPU Load for Chrome
    Given Controlling on the Home Page
    When click "Dynamic Table" title
    Then should see "Dynamic Table" Page
    When get "<Browser>" "<value>" value
    Then compare with value on the yellow label "<Browser>" "<value>"
    Examples:
      | Browser |value|
      | Chrome  |CPU  |






