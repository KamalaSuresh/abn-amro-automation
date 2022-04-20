package com.abnamro.service.ui;

import com.abnamro.pageObjects.CommonPageElements;
import com.abnamro.pageObjects.OpenAccountPage;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.util.EnvironmentVariables;

public class BaseServiceUI extends ScenarioSteps {
    public EnvironmentVariables environmentVariables;
    //ublic static String environmentUrl;
    public OpenAccountPage openAccountPage;
    public CommonPageElements commonPageElements;
    public static String abnAmroBusinessAccountUrl;

@Steps
public OpenAccountServiceUI openAccountServiceUI;
    public void set_up() {

        abnAmroBusinessAccountUrl  = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("abn.amro.business.account.url");


        openAccountPage.open();
        commonPageElements.maximizeWindow();
        commonPageElements.acceptCookies();
    }
}
