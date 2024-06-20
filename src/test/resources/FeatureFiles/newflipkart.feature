Feature: BusBooking

  Background: Application Launch
    Given Launch the browser and appilication "https://www.flipkart.com/"
   @smoke
  Scenario: Login To Flipkart
    When user click login button
    And enter mobile number with one dim list
      | 981234567 | 1345134 | 098772235345 |
    And user click the request OTP button
    
  #Scenario: Become a seller Login
    #When user Become a seller button
    #And enter Username with one dim list
      #| vijay@123 | ela@456 | mahesh@123 |
    #And user click the Next button

  #Scenario: flipkart  search
    #When user seaching products
    #And user enter mobile  with one dim map
      #| mobile1 | i phone13   |
      #| mobile2 | mobile 3G |
    #And user click search button
    

  #Scenario: Validating mobile purchase
    #When user searching the mobile
      #| Samsung S24 | Iphone | Oneplus | Redmi |
    #And user click on add to cart
    #Then user should go to home page
    #And navigate into cart and check order updated
