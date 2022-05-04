$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature_file/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking The Hotel Booking Functionality Of An Adaction Application",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cusername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 12,
      "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;2"
    },
    {
      "cells": [
        "xyz",
        "456"
      ],
      "line": 13,
      "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;3"
    },
    {
      "cells": [
        "Revathi1905",
        "Chennai@123"
      ],
      "line": 14,
      "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3469618,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"abc\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 3577657796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 421936544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 206389687,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 671903920,
  "status": "passed"
});
formatter.after({
  "duration": 442805,
  "status": "passed"
});
formatter.before({
  "duration": 228734,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"xyz\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"456\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 333271914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 260385514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 183918063,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 394021741,
  "status": "passed"
});
formatter.after({
  "duration": 273699,
  "status": "passed"
});
formatter.before({
  "duration": 219448,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Revathi1905\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Chennai@123\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 333511400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Revathi1905",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 287268572,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai@123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 197145031,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1026438787,
  "status": "passed"
});
formatter.after({
  "duration": 286895,
  "status": "passed"
});
formatter.before({
  "duration": 236553,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "user Choose The \"New York\" In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Choose The \"Hotel Hervey\" In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Choose The \"Double\" In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Choose The \"1-One\" In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Choose The \"2-Two\" In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Choose The \"1-One\" In The Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click Search Button And It Navigates To The Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Location_Field(String)"
});
formatter.result({
  "duration": 391404498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Hervey",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Hotels_Field(String)"
});
formatter.result({
  "duration": 302733026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Room_Type_Field(String)"
});
formatter.result({
  "duration": 289043702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1-One",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Number_Of_Rooms_Field(String)"
});
formatter.result({
  "duration": 228352525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2-Two",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Adults_Per_Room_Field(String)"
});
formatter.result({
  "duration": 299235061,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1-One",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Choose_The_In_The_Children_Per_Room_Field(String)"
});
formatter.result({
  "duration": 212182809,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Search_Button_And_It_Navigates_To_The_Select_Hotel()"
});
formatter.result({
  "duration": 632238165,
  "status": "passed"
});
formatter.after({
  "duration": 160798,
  "status": "passed"
});
formatter.before({
  "duration": 198431,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user Click The Checkbox To Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Click The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Checkbox_To_Select_The_Hotel()"
});
formatter.result({
  "duration": 211030343,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 695701516,
  "status": "passed"
});
formatter.after({
  "duration": 195988,
  "status": "passed"
});
formatter.before({
  "duration": 217492,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Book Hotel Functionality",
  "description": "",
  "id": "checking-the-hotel-booking-functionality-of-an-adaction-application;book-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user Enter The \"Revathi\" In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Enter The \"Rajendran\" In The Last Name Filed",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The \"61,MA Nagar,Avadi\" In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The \"8549 5748 3564 2756\" In The Credit Card NO Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The \"VISA\" In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The \"4\" In The Expiry Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The \"2022\" In The Expiry Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The \"175\" In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Revathi",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_First_Name_Field(String)"
});
formatter.result({
  "duration": 290661456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajendran",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Last_Name_Filed(String)"
});
formatter.result({
  "duration": 212971158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "61,MA Nagar,Avadi",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Billing_Address_Field(String)"
});
formatter.result({
  "duration": 266533955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8549 5748 3564 2756",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Credit_Card_NO_Field(String)"
});
formatter.result({
  "duration": 245618992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Credit_Card_Type_Field(String)"
});
formatter.result({
  "duration": 289170288,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Expiry_Month_Field(String)"
});
formatter.result({
  "duration": 298759510,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_The_Expiry_Year_Field(String)"
});
formatter.result({
  "duration": 278898285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "175",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_CVV_Number_Field(String)"
});
formatter.result({
  "duration": 178613688,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 174278988,
  "status": "passed"
});
formatter.after({
  "duration": 204296,
  "status": "passed"
});
});