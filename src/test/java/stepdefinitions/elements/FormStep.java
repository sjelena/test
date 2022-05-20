package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pageobjects.Action;
import pageobjects.Locators;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FormStep extends Locators {
    Action action;
    int randomMonth = (int) ((Math.random() * (11 - 0)) + 0);
    int randomYear = (int) ((Math.random() * (2002 - 1940)) + 1940);
    int randomDay = (int) ((Math.random() * (31 - 1)) + 1);

    public void loadPage() {
        action.connection();
    }

    @Given("Open forms page")
    public void openFormsPage() {
        loadPage();
        forms.click();
        formLink.click();
    }

    @When("I will enter values in form fields")
    public void iWillEnterValuesInFormFields() throws InterruptedException {
        firstName.sendKeys("jelena");
        lastName.sendKeys("stojkovic");
        userEmail.sendKeys("jelena@mail.com");
        int randomNum = (int) ((Math.random() * (3 - 1)) + 1);
        switch (randomNum) {
            case 1:
                male.click();
                break;
            case 2:
                female.click();
                break;
            case 3:
                other.click();
                break;
        }
        userNumber.sendKeys("1234567890");
        dateOfBirthInput.click();

        new Select(month).selectByIndex(randomMonth);
        new Select(year).selectByVisibleText(String.valueOf(randomYear));

        day.get(randomDay).click();
        chooseFile.sendKeys("C:\\Users\\QH User\\Desktop\\nature.jpg");
        Thread.sleep(10000);
    }
    @Then("Submit")
    public void submit() {
    }
}
