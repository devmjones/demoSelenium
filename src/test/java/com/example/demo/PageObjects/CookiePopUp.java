package com.example.demo.PageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CookiePopUp {
    public SelenideElement acceptAllBtn =$(byText("Accept All"));

    public void clickAcceptAllBtnIfPresent() throws InterruptedException {
        Thread.sleep(1000);
        if(acceptAllBtn.isDisplayed()){
            acceptAllBtn.click();
        }
    }
}
