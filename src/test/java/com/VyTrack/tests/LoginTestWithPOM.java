package com.VyTrack.tests;

import com.VyTrack.tests.base.TestBase;
import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestWithPOM extends TestBase {


    @Test
    public void login_test() {

        //goto login page
        loginPage.gotoLoginPage();
        //enter username
        BrowserUtils.sleep(2);
        loginPage.userNameInput
                .sendKeys(ConfigurationReader.getProperty("driver_username"));
        //enter password
        BrowserUtils.sleep(2);
        loginPage.passwordInput
                .sendKeys(ConfigurationReader.getProperty("driver_password"));
        //click the login button
        BrowserUtils.sleep(2);
        loginPage.loginButton.click();
        //verify page header
        Boolean isDisplayedPageHeader = dashboardPage.pageHeader.isDisplayed();
        Assert.assertTrue(isDisplayedPageHeader);


    }

    @Test
    public void login_test_with_method() {
        //go to login page
        loginPage.gotoLoginPage();

        //login
        loginPage
                .login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));
        //verify page header
        String expectedPageHeader="Dashboard";
        String actualPageHeader=dashboardPage.pageHeader.getText();
        Assert.assertEquals(actualPageHeader, expectedPageHeader);

    }

    /*

     */

}