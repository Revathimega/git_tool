Feature:Checking The Hotel Booking Functionality Of An Adaction Application

@SmokeTest
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigate To The Search Hotel Page  

Examples:
|username |password|
|abc|123|
|xyz|456|
|Revathi1905|Chennai@123|

Scenario: Search Hotel Functionality
When user Choose The "New York" In The Location Field
And user Choose The "Hotel Hervey" In The Hotels Field
And user Choose The "Double" In The Room Type Field
And user Choose The "1-One" In The Number Of Rooms Field
And user Choose The "2-Two" In The Adults Per Room Field
And user Choose The "1-One" In The Children Per Room Field
Then user Click Search Button And It Navigates To The Select Hotel

Scenario:Select Hotel Functionality
When user Click The Checkbox To Select The Hotel
Then user Click The Continue Button And It Navigates To The Book Hotel Page

Scenario:Book Hotel Functionality
When user Enter The "Revathi" In The First Name Field
And user Enter The "Rajendran" In The Last Name Filed
And user Enter The "61,MA Nagar,Avadi" In The Billing Address Field
And user Enter The "8549 5748 3564 2756" In The Credit Card NO Field
And user Select The "VISA" In The Credit Card Type Field
And user Select The "4" In The Expiry Month Field
And user Select The "2022" In The Expiry Year Field
And user Enter The "175" In The CVV Number Field
Then user Click The Book Now Button And It Navigates To The Booking Confirmation Page

@Logout
Scenario:Logout Functionality
When user Click The Logout Button Once The Booking was Confirmed
 