package com.epam.ta.test;

import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.page.Quik.QuikHomePage;
import com.epam.ta.page.Quik.QuikTicketWindowPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuikTestCreationOfTickets extends CommonConditions {
    private QuikTicketWindowPage quikTicketWindowPage;
    private String nameOfLotBeforeSubmit = "CNYRUB_SPT";
    private String nameOfLotAfterTocketSend;

    private String costToPayForTicketBefore;
    private String costToPayForTicketAfter;

    private String timeBeforeTicketSending;
    private String timeAfterTicketSending;

    private String numberOfLotsBeforeTicketSend = "5";
    private String costPerInstrument = "0.000100";
    private String numberOfLotsAfterTicketSend;
    private String costPerInstrumentAfterTicketSend;
    private String nameOfNewInstrument = "CNYRUB_SPT";
    private String getNameOfNewInstumentAfterSubmit;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        quikTicketWindowPage = new QuikHomePage(driver)
                .openPage()
                .openLoginWindow()
                .enterLogin(TEST_POSITIVE_USER)
                .enterPassword(TEST_POSITIVE_USER)
                .signIn()
                .openTicket();
    }
    @Test(description = "create ticket with limits", priority = 1)
    public void createNewTicketWithLimits() {
        quikTicketWindowPage = new QuikTicketWindowPage(driver)
                .openTicket();
        timeBeforeTicketSending = QuikHomePage.getTimeBeforTicketSend();

        .fillTheFieldOfTicket().pressSubmitTicketButton().sendOfCretedTicketButton();

        assertThat(currencyTradeTab.haveTokensBeenBought()).isTrue();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
