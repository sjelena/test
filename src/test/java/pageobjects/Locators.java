package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class Locators extends PageObject {
    public JavascriptExecutor executor = (JavascriptExecutor) getDriver();

    // text box
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]")
    public WebElementFacade elements;

    @FindBy(id = "item-0")
    public WebElementFacade textBox;

    @FindBy(id = "userName")
    public WebElementFacade userName;

    @FindBy(id = "userEmail")
    public WebElementFacade userEmail;

    @FindBy(id = "currentAddress")
    public WebElementFacade currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElementFacade permanentAddress;

    @FindBy(id = "submit")
    public WebElementFacade submitButton;

    //check box

    @FindBy (id = "item-1")
    public WebElementFacade checkBoxPage;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button")
    public WebElementFacade homeButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div/ol/li/ol/li/span/button")
    public List<WebElementFacade> checkBoxList;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li")
    public List<WebElementFacade> toggleBoxList;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li/span/button")
    public  List<WebElementFacade> toogleList;
}
