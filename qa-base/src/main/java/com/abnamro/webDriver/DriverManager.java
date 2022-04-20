package com.abnamro.webDriver;

import com.abnamro.enums.FrameworkEnums;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class DriverManager implements FrameworkEnums {
    public static void setupDriver(String browser) {
        if (browser.equalsIgnoreCase(Browser.CHROME.toString())) {
            ChromeDriverManager.getInstance().setup();
        } else if (browser.equalsIgnoreCase(Browser.FIREFOX.toString())) {
            FirefoxDriverManager.getInstance().setup();
        } else if (browser.equalsIgnoreCase(Browser.EDGE.toString())) {
            EdgeDriverManager.getInstance().setup();
        }
    }
}
