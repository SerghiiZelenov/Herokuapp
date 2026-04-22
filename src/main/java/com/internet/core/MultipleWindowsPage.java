package com.internet.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Click Here")
    WebElement clickHere;

    @FindBy(tagName = "h3")
    WebElement newWindowText;

    public MultipleWindowsPage clickHereButton() {
        clickWithJS(clickHere); // открыть новое окно
        return this;
    }

    public MultipleWindowsPage switchToNewWindow(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles()); // список всех окон
        driver.switchTo().window(windows.get(index)); // переход в окно по индексу
        return this;
    }

    public String getNewWindowText() {
        return newWindowText.getText(); // вернуть текст из нового окна
    }
}