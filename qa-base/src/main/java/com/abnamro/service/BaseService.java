package com.abnamro.service;

import com.abnamro.service.ui.BaseServiceUI;
import com.abnamro.service.ui.OpenAccountServiceUI;
import com.abnamro.webDriver.DriverManager;
import com.abnamro.webDriver.WebDriverFactory;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.configuration.WebDriverConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;




public class BaseService extends WebDriverFactory {
    public static String browser;
    public EnvironmentVariables environmentVariables;

    @Steps
    public BaseServiceUI baseServiceUI;
    @Steps
    public OpenAccountServiceUI openAccountServiceUI;

    @Before
    public void browser_set_up() {
        baseServiceUI.set_up();
        WebDriverConfiguration webDriverConfiguration = new WebDriverConfiguration(environmentVariables);
        browser = webDriverConfiguration.getDriverType().toString();
        DriverManager.setupDriver(browser);
    }
}
