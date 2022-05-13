package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.Action;
import pageobjects.Locators;

import java.util.Random;

public class CheckBoxStep extends Locators {
    Action action;

    public void loadPage() {
        action.connection();
    }

    @Given("Open check box page")
    public void openSite() {
        loadPage();
        elements.click();
        checkBoxPage.click();
    }

    @When("I will check some values from check box")
    public void iWillCheckSomeValuesFromCheckBox() throws InterruptedException {
        homeButton.click();
        Random random = new Random();
        int randomNum = (int) ((Math.random() * (3 - 1)) + 1);

        for (int i = 1; i <= randomNum; i++) {
            System.out.println(toogleList.size());
            int buttonRandom = random.nextInt(checkBoxList.size());

            WebElementFacade locator = toggleBoxList.get(buttonRandom);
            WebElementFacade button = checkBoxList.get(buttonRandom);

            if (locator.getAttribute("class").contains("rct-node-collapsed")) {
                button.click();
            } else {
                continue;
            }
        }
        Thread.sleep(3000);
    }

    @Then("I will check if the check is selected")
    public void iWillCheckIfTheCheckIsSelected() {
    }

}

