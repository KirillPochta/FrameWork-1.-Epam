package com.epam.ta.page.Quik;

import com.epam.ta.page.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuikTicketWindowPage extends AbstractPage {
    public QuikTicketWindowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[contains(@style,'two-fingers')]")
    private WebElement newTicketButton;

    @FindBy(xpath = "//input[contains(@tabindex,'5')]")
    private WebElement tradeNumber;

    @FindBy(xpath = "//input[contains(@style,'height: 24px;')]")
    private WebElement inputNameOfLot;

    @FindBy(xpath = "//td[contains(@id,'combobox-2')]//input[contains(@tabindex,'6')]")
    private WebElement clientsCode;

    @FindBy(xpath = "//td[@colspan=3]//td[contains(@class,'x-form-trigger-input')]//input[contains(@tabindex,'1')]")
    private WebElement numberOfLotsToBuy; //5

    @FindBy(xpath = "//td[contains(@class,'x-form-tr')]//input[contains(@tabindex,'11')]")
    private WebElement costForInstrument; //1

    @FindBy(xpath = "//table[@style='position: absolute; top: 0px; width: 1200px;']/tbody/tr[last()]/td[7]")
    private WebElement costForInstrumentAfterTicketSend; //1

    @FindBy(xpath = "//table[contains(@style,'195px; top: 25px')]//div[contains(@role,'input')]")
    private WebElement sumOfTransactionOfLimitTicketBeforeSubmit;

    @FindBy(xpath = "//a[@tabindex=41]//span[contains(@style,'height: 19px')]//span[contains(@id,'submit')]//span[@role='img']")
    private WebElement submitTicketButton;

    @FindBy(xpath = "//a[contains(@style,'left: 271px; top: 0px;')]//span[contains(@style,'height: 19px')]//span[@role='img'][1]")
    private WebElement sendTicketButton;


    @FindBy(xpath = "//td[@colspan=2]//div[contains(@style,'width: 100%')][1]")
    private WebElement tradeNumberAfterSubmitTicket;


    @FindBy(xpath = "//div[contains(@style,'968')]/div[6]")
    private WebElement timeBeforeTicketCreate;

    @FindBy(xpath = "//table[@style='position: absolute; top: 0px; width: 1200px;']/tbody/tr[last()]/td[2]")
    private WebElement timeAfterTicketSend;

    @FindBy(xpath = "//td[@colspan='3']//input[@tabindex='16']")
    private WebElement setStopTicket;

    @FindBy(xpath = "//a[contains(@style,'0px; margin: 0px; width: 154px;')]")
    private WebElement setMarkettypeOfTicket;


    @FindBy(xpath = "//table[contains(@style,'margin: 10px 0px; table-layout: auto;')]/tbody/tr/td[last()]/div")
    private WebElement sumOfTransactionMrketTypeOfTicket;

    @FindBy(xpath = "//table[@style='position: absolute; top: 0px; width: 1200px;']/tbody/tr[last()]/td[4]")
    private WebElement nameOfLotAfterSendticket;

    @FindBy(xpath = "//table[@style='position: absolute; top: 0px; width: 1200px;']/tbody/tr[last()]/td[9]")
    private WebElement costForTicketAfterSubmit;

    @FindBy(xpath = "//table[@style='position: absolute; top: 0px; width: 1200px;']/tbody/tr[last()]/td[8]")
    private WebElement numberOfLotsToBuyAfterSendingTIcket;

    @FindBy(xpath = "//a[@style=\"right: auto; left: 38px; margin: 0px; top: 0px; width: 180px;\"]")
    private WebElement addNewInstrumentButton;

    @FindBy(xpath = "//table[@style=\"width: 100%; table-layout: fixed;\"]/tbody/tr/td/input[@style=\"padding-right: 20px !important; width: 100%; height: 28px;\"]")
    private WebElement inputNameOfLotInFiledOFAddNewInstrument;

    @FindBy(xpath = "//table[@style=\"width: 251px;\"]/tbody/tr[last()]/td[1]/div")
    private WebElement nameOfIntrumentAfterAddNewInstrument;

    @FindBy(xpath = "//ul[@class=\"x-list-plain\"]/li[2]")
    private WebElement clickOnElementInListOfAddingOfNewInstument;

    public QuikTicketWindowPage pressSubmitTicketButton() {
        waitForElementToBeClickable(driver, submitTicketButton);
        submitTicketButton.click();
        logger.info("click on submitTicket");
        return this;
    }

    public QuikTicketWindowPage sendOfCretedTicketButton() {
        waitForElementToBeClickable(driver, sendTicketButton);
        sendTicketButton.click();
        logger.info("send ticket");
        return this;
    }

    public QuikTicketWindowPage openTicket() {
        waitForElementToBeClickable(driver, newTicketButton);
        newTicketButton.click();
        logger.info("ticketOpen");
        return this;
    }

    public QuikTicketWindowPage fillTheFieldOfTicket(String nameOfLot, String countOfLots, String costPerInstruments) {
        waitForVisibilityOfElement(driver, tradeNumber);
        waitForVisibilityOfElement(driver, inputNameOfLot);
        waitForVisibilityOfElement(driver, numberOfLotsToBuy);
        waitForVisibilityOfElement(driver, costForInstrument);

        tradeNumber.sendKeys(Keys.ENTER+"\n");
        inputNameOfLot.sendKeys(nameOfLot);
        inputNameOfLot.sendKeys(Keys.ENTER);
        numberOfLotsToBuy.sendKeys(countOfLots);
        costForInstrument.sendKeys(costPerInstruments);

        logger.info("filling the field was success");
        return this;
    }


}
