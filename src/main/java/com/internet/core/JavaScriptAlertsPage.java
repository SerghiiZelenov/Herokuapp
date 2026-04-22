package com.internet.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement jsAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement jsConfirmButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement jsPromptButton;

    @FindBy(id = "result")
    WebElement result;

    public JavaScriptAlertsPage clickJsAlertButton() {
        clickWithJS(jsAlertButton);
        return this;
    }

    public JavaScriptAlertsPage clickJsConfirmButton() {
        clickWithJS(jsConfirmButton);
        return this;
    }

    public JavaScriptAlertsPage clickJsPromptButton() {
        clickWithJS(jsPromptButton);
        return this;
    }

    public JavaScriptAlertsPage acceptAlertMessage() {
        super.acceptAlert();
        return this;
    }

    public JavaScriptAlertsPage dismissAlertMessage() {
        super.dismissAlert();
        return this;
    }

    public JavaScriptAlertsPage sendMessageToAlert(String text) {
        sendTextToAlert(text);
        return this;
    }

    public String getResultText() {
        return result.getText();
    }
}