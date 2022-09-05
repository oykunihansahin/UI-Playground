
Feature: Progress Bar

  @ProgressBar
  Scenario: Going Progress Bar Page and Making Progress Bar Reach 75%
    Given Controlling on the Home Page
    When click "Progress Bar" title
    Then should see "Progress Bar" Page
    When click start button
    When click stop button when progress bar reaches the value
    Then should see the result






