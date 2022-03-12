package com.VyTrack.tests.base;

import com.VyTrack.pages.DashboardPage;
import com.VyTrack.pages.VytrackLoginPage;
import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected VytrackLoginPage loginPage;
    protected DashboardPage dashboardPage;
    @BeforeMethod
    public void setUp() {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        loginPage=new VytrackLoginPage();
        dashboardPage=new DashboardPage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}