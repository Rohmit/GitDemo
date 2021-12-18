$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Tags.feature");
formatter.feature({
  "line": 2,
  "name": "Login validation",
  "description": "",
  "id": "login-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Login to appliaction with invalid user",
  "description": "",
  "id": "login-validation;login-to-appliaction-with-invalid-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "login to application with invalid user name",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingSteps.login_to_application_with_invalid_user_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "Login with user name having numeric characters",
  "description": "",
  "id": "login-validation;login-with-user-name-having-numeric-characters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Login with user id having numeric characters",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingSteps.login_with_user_id_having_numeric_characters()"
});
formatter.result({
  "status": "skipped"
});
});