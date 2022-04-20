package com.abnamro.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPageElements extends PageObject {

    @FindBy(id = "aab-cookie-consent-agree")
    public WebElement acceptCookieButton;

    public void acceptCookies() {
        try{
            acceptCookieButton.click();}
        catch(Exception ex)
        {

        }
    }

    public void maximizeWindow() {
        getDriver().manage().window().maximize();
    }
}
