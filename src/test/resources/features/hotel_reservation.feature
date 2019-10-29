#Author: usagilust@hotmail.com

Feature: Trivago booking
  As a web user
  I want to use trivago page
  to book a hotel
  
  Scenario: Successful search for a hotel reservation from the main trivago website
    Given that actor wants find lodging 
    When she insert the data of the reservation 
    |  city  |date arrived|date departure|
    |Medellin| 2019-10-27 |  2019-10-30  |
    Then She will see the cheapest booking information on the screen 
  


