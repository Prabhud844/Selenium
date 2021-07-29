$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with Valid Credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user Lanuch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clik on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Page Titel should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Page Titel should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Lanuch_Chrome_browser()"
});
formatter.result({
  "duration": 7365318701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "duration": 3678128101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 294640200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clik_on_Login()"
});
formatter.result({
  "duration": 12201353100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "duration": 147615500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Log_out_link()"
});
formatter.result({
  "duration": 32096416400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "duration": 26650100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 1641585800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Successful login with Valid Credentials different input",
  "description": "",
  "id": "login;successful-login-with-valid-credentials-different-input",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Lanuch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter Email as \"\u003cemail\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "clik on Login",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Page Titel should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Page Titel should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "login;successful-login-with-valid-credentials-different-input;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 27,
      "id": "login;successful-login-with-valid-credentials-different-input;;1"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 28,
      "id": "login;successful-login-with-valid-credentials-different-input;;2"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin123"
      ],
      "line": 29,
      "id": "login;successful-login-with-valid-credentials-different-input;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Successful login with Valid Credentials different input",
  "description": "",
  "id": "login;successful-login-with-valid-credentials-different-input;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Lanuch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "clik on Login",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Page Titel should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Page Titel should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Lanuch_Chrome_browser()"
});
formatter.result({
  "duration": 2817210700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "duration": 2417155700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 457685900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clik_on_Login()"
});
formatter.result({
  "duration": 9156189800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "duration": 63385800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_Click_on_Log_out_link()"
});
formatter.result({
  "duration": 31897254800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "duration": 22980800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 1115296700,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Successful login with Valid Credentials different input",
  "description": "",
  "id": "login;successful-login-with-valid-credentials-different-input;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Lanuch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "clik on Login",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Page Titel should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Click on Log out link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Page Titel should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Lanuch_Chrome_browser()"
});
formatter.result({
  "duration": 1720522900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "duration": 1392736200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin123",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 254961900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clik_on_Login()"
});
formatter.result({
  "duration": 770513000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "duration": 412516800,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat StepDefintions.Steps.page_Titel_should_be(Steps.java:66)\r\n\tat ✽.Then Page Titel should be \"Dashboard / nopCommerce administration\"(./Features/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_Click_on_Log_out_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "Steps.page_Titel_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});