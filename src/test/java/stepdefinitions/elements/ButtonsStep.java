package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pageobjects.Action;
import pageobjects.Locators;

public class ButtonsStep extends Locators {
    Action action;
    Actions actions = new Actions(getDriver());

    public void loadPage() {
        action.connection();
    }

    @Given("Open buttons page")
    public void openButtonsPage() {
        loadPage();
        elements.click();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", buttonsPage);
        buttonsPage.click();
    }

    @When("I will click on all buttons")
    public void iWillClickOnAllButtons() {
        actions.doubleClick(doubleClickButton).perform();
        actions.contextClick(rightClickButton).perform();
        actions.click(clickButton).perform();
    }

    @Then("Validation")
    public void validation() {
        if (doubleClickMessage.isDisplayed()) {
            Assert.assertEquals("You have done a double click", doubleClickMessage.getText());
        }
        if (rightClickMessage.isDisplayed()) {
            Assert.assertEquals("You have done a right click", rightClickMessage.getText());
        }
        if (dynamicClickMessage.isDisplayed()) {
            Assert.assertEquals("You have done a dynamic click", dynamicClickMessage.getText());
        }
    }
}