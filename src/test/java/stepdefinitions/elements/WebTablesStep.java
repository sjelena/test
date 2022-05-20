package stepdefinitions.elements;

import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Tables;
import org.asciidoctor.ast.Table;
import org.junit.Assert;
import pageobjects.Action;
import pageobjects.Locators;

import java.util.ArrayList;
import java.util.List;

public class WebTablesStep extends Locators {
    Action action;
    Tables table = new Tables();

    public void loadPage() {
        action.connection();
    }

    @Given("Open web tables page")
    public void openWebTablesPage() {
        loadPage();
        elements.click();
        webTable.click();
    }

    @When("I will enter values in form")
    public void iWillEnterValuesInForm() throws InterruptedException {
        addButton.click();
        Thread.sleep(1000);
        table.setFirstName("jelena");
        table.setLastName("stojkovic");
        table.setUserEmail("jelena@mail.com");
        table.setAge("25");
        table.setSalary("15000");
        table.setDepartment("QA");

        firstName.sendKeys(table.getFirstName());
        lastName.sendKeys(table.getLastName());
        userEmail.sendKeys(table.getUserEmail());
        age.sendKeys(table.getAge());
        salary.sendKeys(table.getSalary());
        department.sendKeys(table.getDepartment());

        for (int i = 1; i < tabela.size(); i++) {
            table.setLastName(ime.getText());
            table.setUserEmail(ime.getText());
            table.setAge(ime.getText());
            table.setSalary(ime.getText());
            table.setDepartment(ime.getText());
        }
        submitButton.click();
    }

    @Then("I check if the data is entered in the table")
    public void iCheckIfTheDataIsEnteredInTheTable() {
        Assert.assertEquals(table.getFirstName(), tableName.getText());
    }
}