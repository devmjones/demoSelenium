package com.example.demo.HelperClasses;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;

public class HelperClass {
    public void clickEnter(SelenideElement element){
        element.shouldBe(visible);
        element.sendKeys(Keys.ENTER);
    }
}
