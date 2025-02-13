package com.example.demo.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.demo.HelperClasses.HelperClass;
import com.example.demo.PageObjects.CookiePopUp;
import com.example.demo.PageObjects.MainPage;
import com.example.demo.PageObjects.ProductsPage;
import com.example.demo.PageObjects.SearchSection;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    // Here we are importing our page object files
    MainPage mainPage = new MainPage();
    SearchSection searchSection = new SearchSection();
    ProductsPage productsPage = new ProductsPage();
    CookiePopUp cookiePopUp = new CookiePopUp();

    @BeforeClass
    public static void setUpAll() {
        // Here we are setting the browser size and defining our test reporter
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        // This will open a new browser for each test
        open("https://www.jetbrains.com/");
        cookiePopUp.clickAcceptAllBtnIfPresent();
    }

    // These are our tests. They call the page object methods in the order of the test flow

    @Test
    public void search() {
        mainPage.clickSearchBtn();
        searchSection.enterTextIntoSearchField("Selenium", Keys.ENTER);
        searchSection.verifySearchFieldText("Selenium");
    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();
        mainPage.verifyMainSubmenuIsDisplayed();
    }

    @Test
    public void navigationToAllTools() {
        mainPage.seeDeveloperToolsButton.click();
        mainPage.findYourToolsButton.click();
        productsPage.verifyProductsPageIsDisplayed();
        assertEquals(Selenide.title(), "All Developer Tools and Products by JetBrains");
    }
}
