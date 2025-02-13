# Learn to Selenide

## Documentation

[TestNg](https://testng.org/#_testng_xml)

[Selenide API](https://selenide.org/documentation.html)

[Selenide Gitbook](https://selenide.gitbooks.io/user-guide/content/en/selenide-api/selenide.html)

[Selenium Webdriver](https://www.selenium.dev/documentation/webdriver/)

[CSS Selector Cheatsheet](https://www.lambdatest.com/blog/locators-in-selenium-webdriver-with-examples/)

## TODO

### Test Navigation
* Define a new Page Object file called TopNav
    * Define all top nav links (Developer Tools, Team Tools, Education, Solutions, Support, Store)
* Create a page class for each page the links redirect to
    * Define one element on each page to define
    * Write one page object method in each page object file to verify the element is visible.
* Write a test that clicks on each item in the top nav and verifies the correct page loads


### Test a Product Page
* Define the IntelliJ option in the Product Page
* Create a new Page Object Class called IntelliJPage
    * Define the logo image (black square with white IJ in it) and the download button
    * Write a page object method that states that the logo and download buttons should be present
* Write a test that navigates to the product page, clicks on IntelliJ ,  and verifies that the logo and download button are present


### Test Filter
* Create a new Page Object Class called FiltersSidebar
    * Have it extend the Product Page
    * Define the search field in the Filter Sidebar (create SelenideElement variable with CSS selector)
    * Write a page object method to enter text into the field
        * (But make sure to check that the element is visible first)
    * Define the list of filter results (use $$ and SelenideElements to define a list of elements that share a selector)
    * Write a method returning the length of the results
* Write a test that navigates to the Product Page, searches for JavaScript, and asserts that the list of result elements is 1, and asserts that the element with text “JavaScript” is visible (there’s a helper method in the helper class, you just need to import it and call it



