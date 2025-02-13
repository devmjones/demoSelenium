package com.example.demo.PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchSection extends MainPage {
    // Elements that need to be interacted with or verified defined here via CSS selector.
    // Can also find elements with https://selenide.gitbooks.io/user-guide/content/en/selenide-api/selectors.html

    public SelenideElement searchInputField = $("[data-test-id='search-input']");
    public SelenideElement searchButton = $("[data-test='site-header-mobile-search-action']");

    // These are page object methods, which interact with or query the elements defined above
    public void enterTextIntoSearchField(String text, Keys enter) {
       searchInputField.shouldBe(visible);
       searchInputField.setValue(text);
    }

    public void clickSearchButton() {
        searchButton.shouldBe(visible);
        searchButton.click();
    }

    public void verifySearchFieldText(String expectedText){
        searchInputField.shouldBe(visible);
        searchInputField.shouldHave(attribute("value", "Selenium"));
    }
}
