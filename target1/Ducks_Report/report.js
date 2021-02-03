$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anand/Documents/Saru/GitSample/GitDemo/CucumberDucks_Project/src/main/resources/Features/ducks.feature");
formatter.feature({
  "line": 1,
  "name": "Search ducks in Google",
  "description": "",
  "id": "search-ducks-in-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify ducks were properly searched",
  "description": "",
  "id": "search-ducks-in-google;verify-ducks-were-properly-searched",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User in Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters ducks in search field and press enter key",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should able to see ducks page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify ducks were properly searched",
  "keyword": "Then "
});
formatter.match({
  "location": "ducksStepDef.user_in_Google_page()"
});
formatter.result({
  "duration": 4341314700,
  "status": "passed"
});
formatter.match({
  "location": "ducksStepDef.user_enters_in_search_field_and_press_enter_key()"
});
formatter.result({
  "duration": 4295795200,
  "status": "passed"
});
formatter.match({
  "location": "ducksStepDef.user_should_able_to_see_duchs_page()"
});
formatter.result({
  "duration": 16711200,
  "status": "passed"
});
formatter.match({
  "location": "ducksStepDef.verify_ducks_were_properly_searched()"
});
formatter.result({
  "duration": 1155063300,
  "status": "passed"
});
});