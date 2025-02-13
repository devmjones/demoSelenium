package com.example.demo.PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    public SelenideElement productsPageHeader = $("#products-page");

    public void verifyProductsPageIsDisplayed() {
        productsPageHeader.shouldBe(visible);
    }
}
