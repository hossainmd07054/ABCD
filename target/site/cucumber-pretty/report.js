$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user can login",
  "description": "",
  "id": "home-page;verify-user-can-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open Application \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 18
    }
  ],
  "location": "homePageStepDef.open_Application(String)"
});
formatter.result({
  "duration": 1430110100,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDef.click_on_Login_Button()"
});
formatter.result({
  "duration": 8365970400,
  "status": "passed"
});
});