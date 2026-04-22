package com.internet.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptAlerts;

    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindows;

    public JavaScriptAlertsPage getJavaScriptAlerts() {
        clickWithJS(javaScriptAlerts);
        return new JavaScriptAlertsPage(driver);
    }

    public MultipleWindowsPage getMultipleWindows() {
        clickWithJS(multipleWindows);
        return new MultipleWindowsPage(driver);
    }
}