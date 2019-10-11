$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/ecomm.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user shuold enter the paroduct name",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.user_shuold_enter_the_paroduct_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click sear button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_should_click_sear_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shuold click babygirl dress",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_shuold_click_babygirl_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shuld click the add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_shuld_click_the_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click chechout button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_should_click_chechout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter details",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_should_enter_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});