package com.epam.ta.test;

import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.model.User;
import com.epam.ta.service.NameOfListCreator;
import com.epam.ta.service.OperationParametersCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.epam.ta.service.UserCreator;
import org.testng.annotations.Listeners;

@Listeners({utils.TestListener.class})
public class CommonConditions {
    public WebDriver driver;
    public User TEST_POSITIVE_USER = UserCreator.getUserPosivite();
    public User TEST_NEGATIVE_USER = UserCreator.getUserNegative();

    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
