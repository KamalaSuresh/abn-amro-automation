package com.abnamro.pageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:account.page")
public class OpenAccountPage extends PageObject {

    @FindBy(css="button[value='Prive']")
    public WebElementFacade accountTypePrivateButton;

    @FindBy(css="section.bb-container:first-of-type bb-element:nth-child(3)")
    public WebElementFacade WhoTheAccountForSection;

    @FindBy(css="button[value='Mezelf']")
    public WebElementFacade WhoTheAccountForMyselfButton;

    @FindBy(css="section.bb-container > bb-element p")
    public WebElementFacade notificationMessageSection;

    @FindBy(css="button[value='true']")
    public WebElementFacade liveInNetherlandsButton;

    @FindBy(css="section.bb-container:nth-child(1) input:first-child")
    public  WebElementFacade postalCodeInput;

    @FindBy(xpath="//*[@id='P391-C2-C1-C0-C0-C2-C0-C3-C0-C1-F0']")
    public WebElementFacade houseNumberInput;

    @FindBy(css="ofm-button button[name='Next']")
    public WebElementFacade nextButton;

    @FindBy(css="section.bb-container:first-child button[value='m']")
    public  WebElementFacade salutationMrValue;

    @FindBy(css="section.bb-container:first-child bb-element:nth-child(4) input")
    public  WebElementFacade yourInitialsInput;

    @FindBy(css="section.bb-container:first-child bb-element:nth-child(5) input")
    public  WebElementFacade firstNameInput;

    @FindBy(css="section.bb-container:first-child bb-element:nth-child(7) input")
    public  WebElementFacade surNameInput;

    @FindBy(css="section.bb-container:first-child bb-element:nth-child(8) input")
    public  WebElementFacade dobInput;

    @FindBy(css="section.bb-container:first-child button[value='nee']")
    public  WebElementFacade usBornButton;

    @FindBy(css="section.bb-container:last-child > bb-element:nth-child(3) input")
    public WebElementFacade dutchPersonalIDInput;

    @FindBy(css="section.bb-container:last-child > bb-element:nth-child(4) button[value='ja']")
    public WebElementFacade dutchTaxPayerButton;

    @FindBy(css="ofm-select div.custom-radio:first-child label")
    public WebElementFacade verificationOfIdentityRadioButton;

    @FindBy(css="input[inputmode='email']")
    public WebElementFacade emailAddressInput;

    @FindBy(css="input[placeholder='+31612345678']")
    public WebElementFacade phoneNumberInput;

    @FindBy(css="ofm-select div.custom-radio:nth-child(3) label")
    public WebElementFacade sourceOfIncomeRadioButton;

    @FindBy(css="div.InteractionDefaultPage > bb-element:nth-child(3) bb-element:nth-child(3) " +
            "bb-element:nth-child(2) button[value='No']")
    public WebElementFacade ownerOrDirectorButton;

    @FindBy(css="div.InteractionDefaultPage > bb-element:nth-child(3) bb-element:nth-child(3) " +
            "bb-element:nth-child(3) button[value='No']")
    public WebElementFacade heftyAmountTransferButton;

    @FindBy(css="div.InteractionDefaultPage > bb-element:nth-child(3) bb-element:nth-child(3) bb-element:nth-child(4) " +
            "button[value='None']")
    public  WebElementFacade relationshipWithBankButton;

    @FindBy(css="ofm-button button[name='FormAction']")
    public WebElementFacade applyButton;

    @FindBy(css="section.bb-container > bb-element p")
    public WebElementFacade ThankYouNoteOnAccountCreation;

    @FindBy(css="div.alert[role='alert'] p.alert-body:last-child")
    public WebElementFacade businessAccountNotificationBlock;

    @FindBy(css="button[value='Zakelijk']")
    public WebElementFacade accountTypeBusinessButton;

    @FindBy(linkText="online")
    public WebElementFacade businessAccountOnlineLink;

    @FindBy(css="div.alert[role='alert'] p.alert-body:nth-child(2)")
    public WebElementFacade jointAccountNotificationBlock;

    @FindBy(css="section.bb-container > bb-element:last-child div.form-group")
    public WebElementFacade abAmroPersonalAccountDetailsBlock;

    @FindBy(css="div.alert[role='alert'] p.alert-body:last-child")
    public WebElementFacade liveInNetherlandsNoNotificationBlock;

    @FindBy(css="button[value='Gezamenlijke rekening']")
    public WebElementFacade WhoTheAccountForBothOfUsButton;

    @FindBy(css="button[value='false']")
    public WebElementFacade liveInNetherlandsNoButton;

    @FindBy(css="div.alert[role='alert'] p.alert-body:last-child")
    public WebElementFacade postalCodeNotRecognisedNotificationBlock;

    @FindBy(css="section.bb-container:first-child button[value='ja']")
    public  WebElementFacade usBornYesButton;

    @FindBy(css="div.alert[role='alert'] p.alert-body:last-child")
    public WebElementFacade usBornNotificationBlock;

    @FindBy(css="ofm-field-validation div.invalid-feedback > span > span:last-child")
    public WebElementFacade invalidBsnNotificationBlock;

    @FindBy(css="button[name='Previous']")
    public WebElementFacade backButton;
}
