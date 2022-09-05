
@AllCode
Feature: SampleApp

  @EmptyLogin
  Scenario: Going Sample App Page and Leaving Username and Password Empty
    Given Controlling on the Home Page
    When click "Sample App" title
    Then should see "Sample App" Page
    When control the text under the Sample App title
    When control username and password input fields visible
    When control "User logged out." message
    When click login button
    Then should see "Invalid username/password" message

  @CorrectLogin
  Scenario Outline: Going Sample App Page and Typing Username and Correct Password
    Given Controlling on the Home Page
    When click "Sample App" title
    Then should see "Sample App" Page
    When control the text under the Sample App title
    When control username and password input fields visible
    When control "User logged out." message
    When typing "<username>" username
    When typing "pwd" password
    When click login button
    Then should see "Welcome," "<username>!" message
    Examples:
      | username|
      | oyku    |

  @WrongPassword
  Scenario Outline: Going Sample App Page and Typing Username and Wrong-Empty Password
    Given Controlling on the Home Page
    When click "Sample App" title
    Then should see "Sample App" Page
    When control the text under the Sample App title
    When control username and password input fields visible
    When control "User logged out." message
    When typing "<username>" username
    When typing "<password>" password
    When click login button
    Then should see "Invalid username/password" message
    Examples:
      | username|password|
      | oyku    |oyku    |

  @EmptyUsernameAndCorrectPassword
  Scenario Outline: Going Sample App Page and Empty Username and Correct Password
    Given Controlling on the Home Page
    When click "Sample App" title
    Then should see "Sample App" Page
    When control the text under the Sample App title
    When control username and password input fields visible
    When control "User logged out." message
    When typing "<username>" username
    When typing "pwd" password
    When click login button
    Then should see "Invalid username/password" message
    Examples:
      | username|
      |         |



