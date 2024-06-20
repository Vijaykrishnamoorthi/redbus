$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Facebook.feature");
formatter.feature({
  "name": "New Account in Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create New Accounts for Multiple Users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user click Create new account",
  "keyword": "Given "
});
formatter.step({
  "name": "user pass first name \"\u003cfirst name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user pass surname \"\u003clast name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass mobile number \"\u003cmobile number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass date \"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass month \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass year \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click gender",
  "keyword": "And "
});
formatter.step({
  "name": "user click signup \"\u003cscreenshot\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "date",
        "month",
        "year",
        "mobile number",
        "password",
        "screenshot"
      ]
    },
    {
      "cells": [
        "vijay",
        "R",
        "17",
        "Aug",
        "2001",
        "6379695997",
        "vijay2001",
        "s1"
      ]
    }
  ]
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Facebook Application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_Launch_Facebook_Application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Accounts for Multiple Users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user click Create new account",
  "keyword": "Given "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_click_Create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass first name \"vijay\"",
  "keyword": "When "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass surname \"R\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_surname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass mobile number \"6379695997\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_mobile_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass password \"vijay2001\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass date \"17\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass month \"Aug\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_month(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass year \"2001\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_pass_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click gender",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_click_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click signup \"s1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Fbaccount.user_click_signup(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/newflipkart.feature");
formatter.feature({
  "name": "BusBooking",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser and appilication \"https://www.flipkart.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Flipkart.launch_the_browser_and_appilication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login To Flipkart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click login button",
  "keyword": "When "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Flipkart.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter mobile number with one dim list",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Flipkart.enter_mobile_number_with_one_dim_list(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the request OTP button",
  "keyword": "And "
});
formatter.match({
  "location": "in.cucumber.StepDefinition.Flipkart.user_click_the_request_OTP_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});