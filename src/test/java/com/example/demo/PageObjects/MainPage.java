package com.example.demo.PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
    public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
    public SelenideElement toolsMenu = $("[data-test='main-menu-item-action']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
    public SelenideElement mainSubMenu = $("[data-test='main-submenu']");

    public void verifyMainSubmenuIsDisplayed() {
        mainSubMenu.shouldBe(visible);
    }

    public void clickSearchBtn(){
        searchButton.shouldBe(visible);
        searchButton.click();
    }
}
