#Author: mateoserna.35@gmail.com

Feature: I as a user i need to automate the proposed API

  Background: The user enters to the API

    @StepOne
    Scenario Outline: Create the Auth Token
      When The user send the booking request
        | username   | password   |
        | <username> | <password> |
      Then The user should see a status code 200
      And The user will se the following data
        | token   |
        | <token> |
      Examples:
        | username | password    |
        | admin    | password123 |

    @StepTwo
    Scenario Outline: Update the booking from the API
    When The user send the booking request
      | firstname   | lastname   | totalprice   | depositpaid   | checkin   | checkout   | additionalneeds   |
      | <firstname> | <lastname> | <totalprice> | <depositpaid> | <checkin> | <checkout> | <additionalneeds> |
    Then The user should see a status code 200
    And The user will se the following data
      | bookingid   | booking   | firstname   | lastname   | totalprice   | depositpaid   | bookingdates   | checkin   | checkout   | additionalneeds   |
      | <bookingid> | <booking> | <firstname> | <lastname> | <totalprice> | <depositpaid> | <bookingdates> | <checkin> | <checkout> | <additionalneeds> |
    Examples:
      | firstname   | lastname   | totalprice   | depositpaid   | checkin    | checkout   | additionalneeds   |
      | Jim         | Brown      | 111          | true          | 2018-01-01 | 2019-01-01 | Breakfast         |