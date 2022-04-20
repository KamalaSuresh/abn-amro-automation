package com.abnamro.service.ui;

import com.abnamro.pageObjects.OpenAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class OpenAccountServiceUI extends ScenarioSteps {
    private OpenAccountPage openAccountPage;

    @Step
    public void clickAccountTypePrivate(){
        openAccountPage.accountTypePrivateButton.waitUntilEnabled().click();
    }

    @Step
    public void clickAccountForMyselfButton(){
        waitABit(1000);
        if (openAccountPage.WhoTheAccountForSection.isVisible())
            openAccountPage.WhoTheAccountForMyselfButton.click();
    }

    @Step
    public void clickLiveInNetherlandsButton() {

        waitABit(1000);
        if (openAccountPage.notificationMessageSection.isVisible())
            openAccountPage.liveInNetherlandsButton.click();
    }

    @Step
    public void fillInAddressWith(String postal_code, String house_number) {
        openAccountPage.postalCodeInput.waitUntilClickable().typeAndTab(postal_code);
        By by = By.xpath("//*[@id='P391-C2-C1-C0-C0-C2-C0-C3-C0-C1-F0']");
        openAccountPage.houseNumberInput = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.houseNumberInput.typeAndTab(house_number);

    }

    @Step
    public void fillInYourDetailsWith(String initials, String firstName, String surname, String dob) {
        openAccountPage.salutationMrValue.waitUntilPresent().click();
        By by = By.cssSelector("section.bb-container:first-child bb-element:nth-child(4) input");
        openAccountPage.yourInitialsInput = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.yourInitialsInput.waitUntilPresent().typeAndTab(initials);
        by = By.cssSelector("section.bb-container:first-child bb-element:nth-child(5) input");
        openAccountPage.firstNameInput = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.firstNameInput.waitUntilPresent().type(firstName);
        openAccountPage.surNameInput.waitUntilPresent().type(surname);
        by = By.cssSelector("section.bb-container:first-child bb-element:nth-child(8) input");
        openAccountPage.dobInput = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.dobInput.waitUntilPresent().type(dob);
    }

    @Step
    public void clickUsBornNoOption(){
        openAccountPage.usBornButton.waitUntilPresent().click();
    }

    @Step
    public void clickUsBornYesOption(){
        openAccountPage.usBornYesButton.waitUntilPresent().click();
    }

    @Step
    public void fillInYourTaxDetailsWith(String bsn) {
        By by = By.cssSelector("section.bb-container:last-child > bb-element:nth-child(3) input");
        openAccountPage.dutchPersonalIDInput = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.dutchPersonalIDInput.typeAndTab(bsn);
        by = By.cssSelector("section.bb-container:last-child > bb-element:nth-child(4) button[value='ja']");
        openAccountPage.dutchTaxPayerButton = openAccountPage.element(by);
        waitABit(1000);
        openAccountPage.dutchTaxPayerButton.click();
    }

    @Step
    public void clickNextButton() {
        waitABit(1000);
        By by = By.cssSelector("ofm-button button[name='Next']");
        openAccountPage.nextButton = openAccountPage.element(by);
        openAccountPage.nextButton.click();


    }

    @Step
    public void fillInIdentityDetails() {
        waitABit(1000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].click();", openAccountPage.verificationOfIdentityRadioButton);
    }

    @Step
    public void fillInContactDetailsWith(String email, String phoneNumber) {
        By by = By.cssSelector("input[inputmode='email']");
        openAccountPage.emailAddressInput = openAccountPage.find(by);
        waitABit(1000);
        openAccountPage.emailAddressInput.waitUntilPresent().type(email);
        openAccountPage.phoneNumberInput.waitUntilPresent().type(phoneNumber);
        by = By.cssSelector("input[placeholder='+31612345678']");
        openAccountPage.phoneNumberInput = openAccountPage.find(by);
        waitABit(1000);
        openAccountPage.phoneNumberInput.waitUntilPresent().type(phoneNumber);
    }

    @Step
    public void fillClosingQuestions() {

        waitABit(1000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        waitABit(1000);
        jsExecutor.executeScript("arguments[0].click();", openAccountPage.ownerOrDirectorButton);

        waitABit(1000);
        jsExecutor.executeScript("arguments[0].click();", openAccountPage.sourceOfIncomeRadioButton);

        waitABit(1000);
        jsExecutor.executeScript("arguments[0].click();", openAccountPage.heftyAmountTransferButton);

        openAccountPage.relationshipWithBankButton.waitUntilVisible().waitUntilEnabled().click();
    }

    @Step
    public void clickApplyButton() {
        openAccountPage.applyButton.waitUntilVisible().waitUntilClickable().click();
    }

    @Step
    public void clickBusinessOption(){
        openAccountPage.accountTypeBusinessButton.waitUntilEnabled().click();
    }

    @Step
    public void clickOnlineLink() {
        openAccountPage.businessAccountOnlineLink.click();
    }

    @Step
    public void clickWhoTheAccountBothOfUsButton() {
        openAccountPage.WhoTheAccountForBothOfUsButton.waitUntilEnabled().click();
    }

    @Step
    public void clickLiveInNetherlandsNoButton() {

        waitABit(1000);
        if (openAccountPage.notificationMessageSection.isVisible())
            openAccountPage.liveInNetherlandsNoButton.click();
    }

    @Step
    public void clickPreviousPageButton() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(openAccountPage.backButton));
        openAccountPage.backButton.click();
    }
}
