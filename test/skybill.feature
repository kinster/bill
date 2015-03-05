Feature: Viewing a Sky Bill
	
  Scenario: View Bill
    Given JSON data is available from an endpoint http://safe-plains-5453.herokuapp.com/bill.json
    When I go to the bill page
    Then I should see my sky bill with title "Sky Bill"
    And the section heading one be "Subscriptions"
    And the subscriptions should have a total of "£71.40"
    And the section heading two be "Call Charges"
	And the section heading three be "Sky Store"
	And the complete total is "£136.03"
