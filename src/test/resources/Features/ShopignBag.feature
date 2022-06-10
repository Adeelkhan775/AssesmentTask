Feature: Title of your feature
 
 Scenario Outline: Verify Bag is present
    Given User opens the browse
    When User enters the search <Search_text>
    When User click on search button
    Then verify result is according to the search
     
    Examples: 
   |Search_text|
   |black Chanel handbags|
    
  Scenario Outline: place the order of bag
   Given User opens the browse
    When User enters the search <Search_text>
    And User click on search button
    And User Selects the Third bag
    And Click on Add the Bag
    And Click on checkout
    And Enter Email Address
    And Enter Name and Address
    And Click on Continue
    And Select Ground
    And Click on Continue again
    Then verify result is bag order is placed 

   
   Examples: 
   |Search_text|
   |black Chanel handbags|