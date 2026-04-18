Feature: add product to cart
Background:
Given load the browser
And load the url "https://www.saucedemo.com/"

Scenario:add single product
When enter username "standard_user" and password "secret_sauce"
And Click on login button
When inventory is displayed click on product "Sauce Labs Backpack"
And click on add-to-cart button and click on cart-icon
Then validate the product name "Sauce Labs Backpack" in cart
@smoke
Scenario Outline: Scenario:add multiple products
When enter username "<username>" and password "secret_sauce"
And Click on login button
When inventory is displayed click on product "<productName>"
And click on add-to-cart button and click on cart-icon
Then validate the product name "<productName>" in cart

Examples:
|productName|username|
|Sauce Labs Bike Light|visual_user|
|Sauce Labs Bolt T-Shirt|problem_user|
|Sauce Labs Fleece Jacket|error_user|