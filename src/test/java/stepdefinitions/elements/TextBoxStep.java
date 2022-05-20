package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.Action;
import pageobjects.Locators;

public class TextBoxStep extends Locators {
    Action action;

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
        permanentAddress.sendKeys("kralja petra");

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