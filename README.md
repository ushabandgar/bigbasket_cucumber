# bigbasket_cucumber
This is a Selenium-based automation project for web testing. The project uses Java, Maven, and Cucumber, and follows the Page Object Model (POM) design pattern. It also includes a keyword-driven framework for better reusability and test maintainability.

Features:
1. Selenium WebDriver for automated browser interaction.
2. Cucumber for behavior-driven development (BDD) style testing with Gherkin syntax.
3. Page Object Model (POM) to maintain the code clean, reusable, and scalable.
4. Keyword-driven framework for easy test creation and management.
5. Maven as the build tool for dependency management and project structure.
6. Cross-Browser Testing – Supports Chrome, Firefox, Edge, etc.
7. Test Reporting & Logging – Integrated with Extent Reports and Log4j for better debugging.
8. Continuous Integration (CI/CD) Support – Compatible with Jenkins and GitHub Actions for automated test execution.

Runner Class: The Runner Class is used to execute Cucumber test cases. It integrates with JUnit and specifies the location of feature files and step definitions.
Explanation:
@RunWith(Cucumber.class) – Executes tests with Cucumber.
features – Specifies the path of feature files.
glue – Defines the step definition package.
plugin – Generates test execution reports.

