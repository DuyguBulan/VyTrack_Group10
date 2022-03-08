package com.VyTrack.tests.base;

import com.VyTrack.utilities.ConfigurationReader;
import com.VyTrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
