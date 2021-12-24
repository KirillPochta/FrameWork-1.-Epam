package com.epam.ta.page.Quik;

import com.epam.ta.page.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class QuikHomePage extends AbstractPage {
    public QuikHomePage(WebDriver driver) {
        super(driver);
    }
    private static final String HOMEPAGE_URL = "https://junior.webquik.ru/";
    @FindBy(xpath = "//*[@id=\"textfield-1015-inputEl\"]")
    private WebElement loginButton;

    public QuikHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public QuikLoginPage openLoginWindow() {
        loginButton.click();
        return new QuikLoginPage(driver);
    }
}
