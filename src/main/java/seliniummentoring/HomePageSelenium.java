package seliniummentoring;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSelenium extends BaseSelenium{

    @FindBy(xpath = "//input[@class='wp-block-search__input wp-block-search__input ']")private WebElement searchInput;
    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")private WebElement searchIcon;


    public HomePageSelenium(){
        PageFactory.initElements(driver,this);
    }



    public void enterSearchInput(String item){
        searchInput.sendKeys(item);
    }

    public void clickOnSearchIcon(){
        searchIcon.click();
    }

    public void doSearch(String item){
        enterSearchInput(item);
        clickOnSearchIcon();
    }




}
