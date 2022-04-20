package com.abnamro.webDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.annotations.ClearCookiesPolicy.Never;

public class WebDriverFactory {

    @ManagedPages()
    public Pages pages;
    @Managed(uniqueSession = true, clearCookies = Never)
    protected WebDriver driver;
}