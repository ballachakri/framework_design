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
        "Khalifa123"
      ],
      "line": 15,
      "id": "login;login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21711191444,
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
  "name": "i enter my \"ballachakri@yahoo.com\" and \"Khalifa123\"",
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
  "duration": 368002257,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 3021560593,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_redirect_to_login_page()"
});
formatter.result({
  "duration": 14560630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ballachakri@yahoo.com",
      "offset": 12
    },
    {
      "val": "Khalifa123",
      "offset": 40
    }
  ],
  "location": "LoginStepDef.i_enter_my_and(String,String)"
});
formatter.result({
  "duration": 2258930247,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_be_able_to_see_my_account_details()"
});
formatter.result({
  "duration": 37380,
  "status": "passed"
});
});