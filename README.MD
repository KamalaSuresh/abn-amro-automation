# **ABN AMRO UI Functionality Autotests** #

**Implemented with:**

- Java 11.0.1
- JUnit 4.13.2
- Apache Maven 3.8.1
- Serenity BDD framework v2.5.8 (`Thucydides` in past, docs: http://www.thucydides.info/docs/serenity/)
- Page Object Design pattern

## Chromedriver Config
- WebDriverManager is implemented - The latest driver will be downloaded temporarily everytime when the run is initiated.

## Running Tests 
- To build without Running the tests: "mvn clean install -Dskiptests"
- To build and run tests from qa-abn-amro-web : cd qa-abn-amro-web/ && mvn clean verify

## Project Structure Details 
- qa-base : The base module for all the modules(currently web module) where webdriver manager is initiated, the service layer and the page objects are present. Test data for all the modules are present . WebDriverManager is implemented .
- qa-abn-amro-web : Web Application testing module where the tests and the assertions only exist.

## Reporting Feature
- This framework uses the inbuilt serenity reports feature where the report is generated and present in the target/site/serenity folder. The reports link will be available at the end of tests run in the terminal.  