package com.internet.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaScriptAlertsTests extends TestBase {

    @Test
    public void jsAlertTest() {
        String result = new HomePage(driver).getJavaScriptAlerts()
                .clickJsAlertButton()
                .acceptAlertMessage()
                .getResultText();

        Assertions.assertTrue(result.contains("You successfully clicked an alert"));
    }

    @Test
    public void jsConfirmTest() {
        String result = new HomePage(driver).getJavaScriptAlerts()
                .clickJsConfirmButton()
                .dismissAlertMessage()
                .getResultText();

        Assertions.assertTrue(result.contains("You clicked: Cancel"));
    }

    @Test
    public void jsPromptTest() {
        String result = new HomePage(driver).getJavaScriptAlerts()
                .clickJsPromptButton()
                .sendMessageToAlert("Hello")
                .getResultText();

        Assertions.assertTrue(result.contains("You entered: Hello"));
    }
}