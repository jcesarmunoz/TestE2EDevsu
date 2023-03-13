Feature: Buy Products

    Scenario: User wants to make a buy in Source Demo
      Given Ana has an account to make purchases
      And Ana can log in with their credentials
      When Ana chooses her products
      And Ana completed the formulary
      Then Ana sees a purchase confirmation

