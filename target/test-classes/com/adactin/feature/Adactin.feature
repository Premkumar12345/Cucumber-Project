Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Web Application
Given user Launch The Url In The Adactin Application
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then User click On The Login Button And It Navigates To Search Hotel Page

Scenario: User Select And Search The Room And Details In The Select Hotel Page
When User Select The Location
And User Select The Hotel
And User Select The Room Type
And User Select The Number Of Rooms
And User Select The Check In Date 
And User Select The Check Out Date
And User Select The Adults Per Room
And User Select The Children Per Room
Then User Click On The Search Button And It Navigates To Select Hotel

Scenario: User Select The Hotel
When User Click The Select Button
Then User Click On The Continue Button It Navigates To Book A Hotel

Scenario: User Book A Hotel And Details In The Book A Hotel
When User Enter The FirstName In The FirstName Field
And User Enter The LastName In The LastName Field
And User Enter The Billing Address In The Billing Address Field
And User Enter The Card No In The Card No Field
And User Select The Credit Card Type
And User Select The Expiry Date And Select Month
And User Select The Expiry Date And Select Year
And User Enter The Cvv Number In The Cvv Number Field
Then User Click On The Book Now Button And It Navigates To Booking Conformation Page 


