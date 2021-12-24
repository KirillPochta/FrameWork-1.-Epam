package com.epam.ta.page.Quik;

import com.epam.ta.model.User;
import com.epam.ta.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuikLoginPage extends AbstractPage {
    protected QuikLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"textfield-1015-inputEl\"]")
    private WebElement loginFiled;
    @FindBy(xpath = "//*[@id=\"textfield-1017-inputEl\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"button-1021-btnIconEl\"]")
    private WebElement submitLogInButton;

    public QuikLoginPage enterLogin(User user) {
        waitForVisibilityOfElement(driver, loginFiled);
        loginFiled.sendKeys(user.getEmail());
        return this;
    }

    public QuikLoginPage enterPassword(User user) {
        waitForVisibilityOfElement(driver, passwordField);
        passwordField.sendKeys(user.getPassword());
        return this;
    }

    public QuikTicketWindowPage signIn() {
        waitForElementToBeClickable(driver, submitLogInButton);
        submitLogInButton.click();
        return new QuikTicketWindowPage(driver);
    }
}
