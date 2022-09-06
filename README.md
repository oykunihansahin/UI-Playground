UI Playground Test Automation

Tech Stack: Java, Cucumber, TestNG, Maven

a) How to run the test locally;

Since 3 scenarios are tested, there are 3 separate features.To test these scenarios separately, the annotation on the feature pages is written in the tags section of the runner. After that, resources-testSuites-Parallel.xml files is opened. With right click, choosing run and the test are runned.To open the Postman api project, go to the Postman application and import the postman files in json format on github.

b) How to run the test in a CI/CD pipeline

Going to this url http://localhost:8080/user/oykunihansahin/my-views/view/all/ ,clicking the run button for both tests will be tested in the CI/CD pipeline.Conditions for how tests are run can be arranged.

c) https://app.calliope.pro/profiles/4468/reports

d)A dashboard can also be created for agile project management. With titles such as to do, in progress, done, companies can manage their projects.I think acceptable report formats can be diversified when adding reports

e-f)In web automation, I primarily chose the sample app scenario because nowadays almost every application is logged in with a username and password and I think it is an area that should definitely be tested. As the second, I chose the dynamic table scenario. Because there is no stability with constantly changing data, it is an area that needs to be tested to reach the right result. Finally, I chose the progress bar scenario.I thought it should be tested because it is an interface component that allows us to show the background progress of synchronous and asynchronous operations to the user and is used in almost every site and application.
In API automation, I wrote tests using 4 http requests: post, get, put, delete. I chose these tests to check whether the status code returns 200, whether the response time is below a certain time, and whether any element in the response body is returned.

g)The next step in the web automation project would be to test scenarios such as click, mouse over, scrollbars, which are widely used on websites.
