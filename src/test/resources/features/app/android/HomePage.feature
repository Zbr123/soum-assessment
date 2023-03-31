Feature: Home Page Testing App

  @homePage @android @final
  Scenario: Verify the version code and version name display on home page
    Given [Home Page] App should open successfully
   # And  [Home Page] User is on Home Page title Testing App
    Then [Home Page] Verify the Version Code 106
    And  [Home Page] Verify the Version Name 12.0

#  @homePage @android @final
#  Scenario: Verify the Immediate Update button is working
#    Given [Home Page] App should open successfully
#    Then [Home Page] Verify the Immediate Update button is visible
#    When [Home Page] User tap on Immediate Update Button
##    Then [Home Page] Verify the three button options
##      | Button1  | Button2  | Button3  |
##      | BUTTON 1 | BUTTON 2 | BUTTON 3 |
#    When [Home Page] User tap on Button 1
#    Then [Home Page] Verify that Result 1 is displayed
#    When [Home Page] User tap on Button 2
#    Then [Home Page] Verify that Result 2 is displayed
#    When [Home Page] User tap on Button 3
#    Then [Home Page] Verify that Result 3 is displayed

#
#  @homePage @android
#  Scenario: Verify the Flexible Update button is working
#    Given [Home Page] App should open successfully
#    And  [Home Page] User is on Home Page
#    Then [Home Page] Verify the Flexible Update button is visible
#    When [Home Page] User tap on Flexible Update Button
#    Then [Update Page] Verify the three button options
#    When [Update Page] User tap on Button '1'
#    Then [Update Page] Verify the Result '1'
#    And  [Common Page] User tap on Back button
#    When [Update Page] User tap on Button '2'
#    Then [Update Page] Verify the Result '2'
#    And  [Common Page] User tap on Back button
#    When [Update Page] User tap on Button '3'
#    Then [Update Page] Verify the Result '3'
