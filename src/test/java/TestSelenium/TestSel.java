package TestSelenium;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import seliniummentoring.BaseSelenium;
import seliniummentoring.HomePageSelenium;

import java.time.Duration;

public class TestSel extends BaseSelenium {

    @Test

    public void testSeleniumMentoring(){
        HomePageSelenium homePage=new HomePageSelenium();
        homePage.doSearch("bag");

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        Assert.assertEquals(driver.getTitle(),"Search Results for “bag” – Automation");





    }

}
