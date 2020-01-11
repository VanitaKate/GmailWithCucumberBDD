$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/ComposeEmail.feature");
formatter.feature({
  "line": 1,
  "name": "Compose email",
  "description": "",
  "id": "compose-email",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User is able to compose new email and send it.",
  "description": "",
  "id": "compose-email;user-is-able-to-compose-new-email-and-send-it.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters valid username and password and clicks LoginButton",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Compose button opens new email window",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters subject of email",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters To email address of the email",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the Message Body",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Send button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "email send successfully and displays under Sent items",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_Gmail_login_page()"
});
formatter.result({
  "duration": 46805159100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 1584400,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat PageObjects.GmailLoginPage.setUserName(GmailLoginPage.java:51)\r\n\tat Tests.LoginStepDefinitions.user_enters_valid_username_and_password(LoginStepDefinitions.java:61)\r\n\tat ✽.When User enters valid username and password and clicks LoginButton(./Features/ComposeEmail.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_able_to_login_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_Compose_button_opens_new_email_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_subject_of_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_To_email_address_of_the_email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_the_Message_Body()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_Send_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinitions.email_send_successfully_and_displays_under_Sent_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("./Features/LoginGmail.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User is able to login to gmail.com with valid credentials",
  "description": "",
  "id": "login;user-is-able-to-login-to-gmail.com-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username and password and clicks LoginButton",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_Gmail_login_page()"
});
formatter.result({
  "duration": 50261912800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 13263727900,
  "error_message": "org.openqa.selenium.JavascriptException: TypeError: document.getElementByClassName is not a function\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027DESKTOP-NG79I8K\u0027, ip: \u0027192.168.225.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200107212822, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 1220, moz:profile: C:\\Users\\Administrator\\AppD..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 95534025-eace-466f-9ddb-cd2af0b91da4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat PageObjects.GmailLoginPage.setPassword(GmailLoginPage.java:65)\r\n\tat Tests.LoginStepDefinitions.user_enters_valid_username_and_password(LoginStepDefinitions.java:70)\r\n\tat ✽.When User enters valid username and password and clicks LoginButton(./Features/LoginGmail.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_able_to_login_successfully()"
});
formatter.result({
  "status": "skipped"
});
});