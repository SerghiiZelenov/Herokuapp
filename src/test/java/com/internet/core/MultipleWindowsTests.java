package com.internet.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleWindowsTests extends TestBase {

    @Test
    public void newWindowTest() {
        String text = new HomePage(driver).getMultipleWindows()
                .clickHereButton()
                .switchToNewWindow(1)
                .getNewWindowText();

        Assertions.assertEquals("New Window", text);
    }
}