Feature: Create campaign
Scenario:Login create campaign with mandatory feature
Given Launch the browser
And Navigate to NinzaCRM application
When enter username and password for login
And click on login button for ninzaCRM
And click on create campaign
When enter campaign name and target size
And click on submit button
Then verify campaign name
When  click on user profile
When  click on Logout button
