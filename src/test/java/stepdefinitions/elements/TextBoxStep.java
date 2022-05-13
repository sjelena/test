package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.Action;
import pageobjects.Locators;

public class TextBoxStep extends Locators {
    Action action;

    @Managed
    WebDriver driver;
    public void loadPage() {
        action.connection();
    }

    @Given("Open text box page")
    public void openSite() {
        loadPage();
        elements.click();
        textBox.click();
    }

    @When("I will enter values in fields and click on Submit button")
    public void iWillEnterValuesInFieldsAndClickOnSubmitButton() {
        userName.sendKeys("jelena");
        userEmail.sendKeys("jelena@mail.com");
        currentAddress.sendKeys("novi sad");
        permanentAddress.sendKeys("neka porukica");

        executor.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);", submitButton);
        submitButton.click();
    }

    @Then("I verify result")
    public void iVerifyResult() {
        Assert.assertEquals(true, userName.isDisplayed());
        Assert.assertEquals(true, userEmail.isDisplayed());
        Assert.assertEquals(true, currentAddress.isDisplayed());
        Assert.assertEquals(true, permanentAddress.isDisplayed());
     //   Assert.assertTrue(name.getText().contains(userName.getValue()));
    }
}