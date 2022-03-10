package com.VyTrack.tests;

import com.VyTrack.utilities.BrowserUtils;
import com.VyTrack.utilities.Driver;
import com.VyTrack.utilities.VyTrackUtilities;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US01_how_to_use_pinbar {

    @Test
    public void user_verified_text(){
        // User login
        VyTrackUtilities.loginAsStoreManager();

        //Find and click "Learn how to use this space b
        WebElement pinbar = Driver.getDriver().findElement(By.xpath("//a[.='Learn how to use this space']"));
        BrowserUtils.sleep(2);
        pinbar.click();

        //find the actual texts
        String actualH3 = Driver.getDriver().findElement(By.xpath("//h3[.='How To Use Pinbar']")).getText();
        String actualP=Driver.getDriver().findElement(By.xpath("//p[normalize-space()='Use pin icon on the right top corner of page to create fast access link in the pinbar.']")).getText();

        // expected text
        String expectedH3 = "How To Use Pinbar";
        String expectedText2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        //verify
        Assert.assertEquals(actualH3,expectedH3);
        Assert.assertEquals(actualP,expectedText2);

        Driver.closeDriver();

    }

    @Test
    public void user_verified_image(){
        // User login
        VyTrackUtilities.loginAsStoreManager();

        //Find and click "Learn how to use this space b
        WebElement pinbar = Driver.getDriver().findElement(By.xpath("//a[.='Learn how to use this space']"));
        BrowserUtils.sleep(2);
        pinbar.click();

        String expectedImagePath = "https://qa1.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
        //verify

        //find actual imagine path
        String actualImaginePath = Driver.getDriver().findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")).getAttribute("src");

        Assert.assertEquals(expectedImagePath,actualImaginePath);
        Driver.closeDriver();

    }



}
