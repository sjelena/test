package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    // check box
    @FindBy (id = "item-1")
    public WebElementFacade checkBoxPage;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button")
    public WebElementFacade homeButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div/ol/li/ol/li/span/button")
    public List<WebElementFacade> checkBoxList;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li")
    public List<WebElementFacade> toggleBoxList;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li")
    public List<WebElementFacade> toggleBoxList2;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li/ol/li/span/button")
    public List<WebElementFacade> checkBoxList2;

    @FindBy(className = "rct-icon-uncheck")
    public List<WebElementFacade> checkBoxs;

    // web tables
    @FindBy(id = "item-3")
    public WebElementFacade webTable;

    @FindBy(id = "addNewRecordButton")
    public WebElementFacade addButton;

    @FindBy(id = "firstName")
    public WebElementFacade firstName;

    @FindBy(id = "lastName")
    public WebElementFacade lastName;

    @FindBy(id = "age")
    public WebElementFacade age;

    @FindBy(id = "salary")
    public WebElementFacade salary;

    @FindBy(id = "department")
    public WebElementFacade department;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")
    public WebElementFacade tableName;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]")
    public WebElementFacade ime;

    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div[1]")
    public List<WebElementFacade> tabela;

    // buttons
    @FindBy (id = "item-4")
    public WebElementFacade buttonsPage;

    @FindBy(id = "doubleClickBtn")
    public WebElementFacade doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElementFacade rightClickButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    public WebElementFacade clickButton;

    @FindBy(id = "doubleClickMessage")
    public WebElementFacade doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    public WebElementFacade rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElementFacade dynamicClickMessage;

    // Links
    @FindBy (id = "item-5")
    public WebElementFacade linksPage;

    @FindBy (id = "created")
    public WebElementFacade createdLink;

    @FindBy (id = "no-content")
    public WebElementFacade contentLink;

    @FindBy (id = "moved")
    public WebElementFacade movedLink;

    @FindBy (id = "bad-request")
    public WebElementFacade requestLink;

    @FindBy (id = "unauthorized")
    public WebElementFacade unauthorizedLink;

    @FindBy (id = "forbidden")
    public WebElementFacade forbiddenLink;

    @FindBy (id = "invalid-url")
    public WebElementFacade urlLink;

    @FindBy (id = "linkResponse")
    public WebElementFacade linkResponse;

    // Form
    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]")
    public WebElementFacade forms;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")
    public WebElementFacade formLink;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")
    public WebElementFacade male;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label")
    public WebElementFacade female;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[3]/label")
    public WebElementFacade other;

    @FindBy (id = "userNumber")
    public WebElementFacade userNumber;

    @FindBy (id = "dateOfBirthInput")
    public WebElementFacade dateOfBirthInput;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    public WebElement month;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
    public WebElement year;

    @FindBy (xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div")
    public List<WebElementFacade> day;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[8]/div[2]/div/input")
    public WebElementFacade chooseFile;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div")
    public WebElementFacade state;
}