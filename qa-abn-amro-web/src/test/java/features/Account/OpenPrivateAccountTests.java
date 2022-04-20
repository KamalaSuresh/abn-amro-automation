package features.Account;

import features.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static com.abnamro.testData.Constants.*;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OpenPrivateAccountTests extends BaseTest {


    @Test
    @WithTagValuesOf(POSITIVE_TEST)
    public void a_verify_open_private_account() {
        //Page1 Basic Details
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsButton();
        openAccountServiceUI.fillInAddressWith(CREATE_PERSONAL_ACCOUNT_POSTAL_CODE, CREATE_PERSONAL_ACCOUNT_HOUSE_NUMBER);
        openAccountServiceUI.clickNextButton();
        //Page2 Personal Details
        openAccountServiceUI.fillInYourDetailsWith(CREATE_PERSONAL_ACCOUNT_INITIALS, CREATE_PERSONAL_ACCOUNT_FIRST_NAME,
                CREATE_PERSONAL_ACCOUNT_SUR_NAME, CREATE_PERSONAL_ACCOUNT_DOB);
        openAccountServiceUI.clickUsBornNoOption();
        openAccountServiceUI.fillInYourTaxDetailsWith(CREATE_PERSONAL_ACCOUNT_BSN);
        openAccountServiceUI.clickNextButton();
        // Page 3 Identity & Contact Details
        openAccountServiceUI.fillInIdentityDetails();
        openAccountServiceUI.fillInContactDetailsWith(CREATE_PERSONAL_ACCOUNT_EMAIL, CREATE_PERSONAL_ACCOUNT_PHONE);
        openAccountServiceUI.clickNextButton();
        //Page 4 Closing Questions
        openAccountServiceUI.fillClosingQuestions();
        openAccountServiceUI.clickNextButton();
        //Page 5 Overview and apply
        openAccountServiceUI.clickApplyButton();
        //Page 6 Thanks You Note
        openPrivateAccountTestsSteps.AssertAccountCreation();
    }

    @Test
    @WithTagValuesOf(POSITIVE_TEST)
    public void b_verify_business_account_notification_block_appears_and_navigates_to_open_business_account_Page() {
        //Page1 Click business for account Type
        openAccountServiceUI.clickBusinessOption();
        openPrivateAccountTestsSteps.verifyBusinessAccountNotificationBlockOpens();
        openAccountServiceUI.clickOnlineLink();
        openPrivateAccountTestsSteps.verifyBusinessAccountPageOpens();
    }

    @Test
    @WithTagValuesOf(POSITIVE_TEST)
    public void c_verify_joint_account_notification_block_appears_onselecting_for_both_of_us_option() {
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickWhoTheAccountBothOfUsButton();
        openPrivateAccountTestsSteps.verifyAccountForBothOfSectionDetailsOpens();
    }

    @Test
    @WithTagValuesOf(NEGATIVE_TEST)
    public void d_verify_live_in_netherlands_no_option() {
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsNoButton();
        openPrivateAccountTestsSteps.verifyLiveInNetherlandsNoNotificationBlockWithNoNextButton();
    }

    @Test
    @WithTagValuesOf(NEGATIVE_TEST)
    public void e_verify_invalid_postal_code_entry() {
        //Page1 Basic Details
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsButton();
        openAccountServiceUI.fillInAddressWith(CREATE_PERSONAL_ACCOUNT_INVALID_POSTAL_CODE, CREATE_PERSONAL_ACCOUNT_INVALID_HOUSE_NUMBER);
        openPrivateAccountTestsSteps.verifyPostalCodeNotRecognizedMessageBlockWithNoNextButton();
    }

    @Test
    @WithTagValuesOf(NEGATIVE_TEST)
    public void f_verify_US_born_entry() {
        //Page1 Basic Details
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsButton();
        openAccountServiceUI.fillInAddressWith(CREATE_PERSONAL_ACCOUNT_POSTAL_CODE, CREATE_PERSONAL_ACCOUNT_HOUSE_NUMBER);
        openAccountServiceUI.clickNextButton();
        //Page2 Personal Details
        openAccountServiceUI.fillInYourDetailsWith(CREATE_PERSONAL_ACCOUNT_INITIALS, CREATE_PERSONAL_ACCOUNT_FIRST_NAME,
                CREATE_PERSONAL_ACCOUNT_SUR_NAME, CREATE_PERSONAL_ACCOUNT_DOB);
        openAccountServiceUI.clickUsBornYesOption();
        openPrivateAccountTestsSteps.verifyUSBornNotificationBlock();
    }

    @Test
    @WithTagValuesOf(POSITIVE_TEST)
    public void g_verify_ivalid_bsn_entry() {
        //Page1 Basic Details
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsButton();
        openAccountServiceUI.fillInAddressWith(CREATE_PERSONAL_ACCOUNT_POSTAL_CODE, CREATE_PERSONAL_ACCOUNT_HOUSE_NUMBER);
        openAccountServiceUI.clickNextButton();
        //Page2 Personal Details
        openAccountServiceUI.fillInYourDetailsWith(CREATE_PERSONAL_ACCOUNT_INITIALS, CREATE_PERSONAL_ACCOUNT_FIRST_NAME,
                CREATE_PERSONAL_ACCOUNT_SUR_NAME, CREATE_PERSONAL_ACCOUNT_DOB);
        openAccountServiceUI.clickUsBornNoOption();
        openAccountServiceUI.fillInYourTaxDetailsWith(CREATE_PERSONAL_ACCOUNT_INVALID_BSN);
        openPrivateAccountTestsSteps.verifyDisplayOfInvalidBsnNotificationBlock();
    }

    @Test
    @WithTagValuesOf(POSITIVE_TEST)
    public void h_verify_back_button_click() {
        //Page1 Basic Details
        openAccountServiceUI.clickAccountTypePrivate();
        openAccountServiceUI.clickAccountForMyselfButton();
        openAccountServiceUI.clickLiveInNetherlandsButton();
        openAccountServiceUI.fillInAddressWith(CREATE_PERSONAL_ACCOUNT_POSTAL_CODE, CREATE_PERSONAL_ACCOUNT_HOUSE_NUMBER);
        openAccountServiceUI.clickNextButton();
        //Page 2
        openAccountServiceUI.clickPreviousPageButton();
        openPrivateAccountTestsSteps.verifyAddressPageIsOpenedBack();
    }
}
