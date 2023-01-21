package seliniummentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseSelenium extends ConfigurationSelenium{
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeTest

    public static void startBrowser(@Optional("edge") String browser, String url){
        if (browser.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(getUrl());


    }

    @AfterTest
    public static void closeUp(){
        if(driver instanceof EdgeDriver){
            driver.quit();
        }else{
            driver.close();
        }
    }




}
