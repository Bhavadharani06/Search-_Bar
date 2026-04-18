Feature: add product to cart in flipkart
Scenario:add iPhone to cart
Given launch the new browser
And navigate to flipkart using url "https://www.flipkart.com/" and Handle the popup
When search product "iPhone"
And Click on search button
When iphones are displayed click on product "Apple iPhone 16 (Black, 128 GB)"
And print the price of the product and click on add-to-cart and click on cart
Then verify the product name "Apple iPhone 16 (Black, 128 GB)" in cart
