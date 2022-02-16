#Author: maeoserna.35@gmail.com

  Feature: I as a user i require adding several products from different categories

    @SuccesfulProduct
    Scenario: The user take a product from different categories
      Given The user is on the page
      When The user selects the categories to take a products
      Then The user verify the products on the car market