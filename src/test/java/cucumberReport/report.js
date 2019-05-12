$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("java/resources/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As a end user\r\ni enter user my username and password\r\nthen i should  land in my home page",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login functionality",
  "description": "",
  "id": "login;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "i click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i should redirect to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "i enter my \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i should be able to see my account details",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "login;login-functionality;;1"
    },
    {
      "cells": [
        "ballachakri@yahoo.com",
        "Khalifa123."
      ],
      "line": 15,
      "id": "login;login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 49368396073,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login functionality",
  "description": "",
  "id": "login;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "i click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i should redirect to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "i enter my \"ballachakri@yahoo.com\" and \"Khalifa123.\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i should be able to see my account details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 6813167586,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 3027968130,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_redirect_to_login_page()"
});
formatter.result({
  "duration": 61762704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ballachakri@yahoo.com",
      "offset": 12
    },
    {
      "val": "Khalifa123.",
      "offset": 40
    }
  ],
  "location": "LoginStepDef.i_enter_my_and(String,String)"
});
formatter.result({
  "duration": 2225773030,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003cinput id\u003d\"j_password\" class\u003d\"text_large\" name\u003d\"j_password\" type\u003d\"password\"\u003e is not reachable by keyboard\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CHAKRA-PC\u0027, ip: \u0027192.168.99.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 66.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 49468, moz:profile: C:\\Users\\sball\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: da783737-90da-4ddc-a4b9-2dba56f33c3b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat com.cath.project.LoginPage.enterEmailId(LoginPage.java:48)\r\n\tat com.cath.project.StepDefinition.LoginStepDef.i_enter_my_and(LoginStepDef.java:37)\r\n\tat ✽.When i enter my \"ballachakri@yahoo.com\" and \"Khalifa123.\"(java/resources/login.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDef.i_should_be_able_to_see_my_account_details()"
});
formatter.result({
  "status": "skipped"
});
});