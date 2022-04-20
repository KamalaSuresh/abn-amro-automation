package features.Account;

import com.abnamro.pageObjects.OpenAccountPage;
import com.abnamro.service.ui.BaseServiceUI;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class OpenPrivateAccountTestsSteps extends ScenarioSteps {
    OpenAccountPage openAccountPage;

    @Step
    public void AssertAccountCreation() {
        String thankYouNote = openAccountPage.ThankYouNoteOnAccountCreation.getText();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(thankYouNote.contains("Thank you for choosing ABN AMRO!"));
        softly.assertAll();
    }

    @Step
    public void verifyBusinessAccountNotificationBlockOpens() {
        waitABit(1000);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(openAccountPage.businessAccountNotificationBlock.isVisible());
        softly.assertThat(openAccountPage.businessAccountNotificationBlock.getText().contains("open a business account, you can do so easily online."));
        softly.assertAll();
    }

    @Step
    public void verifyBusinessAccountPageOpens() {

        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.urlToBe(BaseServiceUI.abnAmroBusinessAccountUrl));
    }

    @Step
    public void verifyAccountForBothOfSectionDetailsOpens() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.jointAccountNotificationBlock));
        Assert.assertTrue(openAccountPage.abAmroPersonalAccountDetailsBlock.isVisible());
    }

    @Step
    public void verifyLiveInNetherlandsNoNotificationBlockWithNoNextButton() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.liveInNetherlandsNoNotificationBlock));
       // wait.until(ExpectedConditions.invisibilityOf(openAccountPage.nextButton));
    }

    @Step
    public void verifyPostalCodeNotRecognizedMessageBlockWithNoNextButton() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.postalCodeNotRecognisedNotificationBlock));
        //wait.until(ExpectedConditions.invisibilityOf(openAccountPage.nextButton));
    }

    @Step
    public void verifyUSBornNotificationBlock() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.usBornNotificationBlock));
    }

    @Step
    public void verifyDisplayOfInvalidBsnNotificationBlock() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.invalidBsnNotificationBlock));
    }

    @Step
    public void verifyAddressPageIsOpenedBack() {
        FluentWait wait = new FluentWait(getDriver());
        wait.withTimeout(Duration.ofSeconds(5));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.accountTypePrivateButton));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.WhoTheAccountForMyselfButton));
        wait.until(ExpectedConditions.visibilityOf(openAccountPage.liveInNetherlandsButton));
    }
}
