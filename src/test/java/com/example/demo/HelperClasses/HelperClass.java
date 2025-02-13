package com.example.demo.HelperClasses;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class HelperClass {
    public void elementWithTextVisible(String textContains){
        SelenideElement acceptAllBtn =$(withText(textContains));
        acceptAllBtn.shouldBe(visible);
    }
}
