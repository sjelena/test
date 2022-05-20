package stepdefinitions.elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pageobjects.Action;
import pageobjects.Locators;

public class LinksStep extends Locators {
    Action action;
    private String text1 = "Link has responded with staus";
    private String text2 = "and status text";
    public void loadPage() {
        action.connection();
    }
    @Given("Open links page")
    public void openLinksPage() {
        loadPage();
        elements.click();
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", linksPage);
        linksPage.click();
    }

    @When("I will click on links")
    public void iWillClickOnLinks() {
        int randomNum = (int) ((Math.random() * (7 - 1)) + 1);
        switch(randomNum) {
            case 1:
                createdLink.click();
                Assert.assertEquals(text1+ " 201 " +text2 + " Created", linkResponse.getText());
                break;
            case 2:
                contentLink.click();
                Assert.assertEquals(text1+ " 204 " +text2 + " No Content", linkResponse.getText());
                break;
            case 3:
                movedLink.click();
                Assert.assertEquals(text1+ " 301 " +text2 + " Moved Permanently", linkResponse.getText());
                break;
            case 4:
                requestLink.click();
                Assert.assertEquals(text1+ " 400 " +text2 + " Bad Request", linkResponse.getText());
                break;
            case 5:
                unauthorizedLink.click();
                Assert.assertEquals(text1+ " 401 " +text2 + " Unauthorized", linkResponse.getText());
                break;
            case 6:
                forbiddenLink.click();
                Assert.assertEquals(text1+ " 403 " +text2 + " Forbidden", linkResponse.getText());
                break;
            case 7:
                urlLink.click();
                Assert.assertEquals(text1+ " 404 " +text2 + " Not Found", linkResponse.getText());
                break;
        }
    }

    @Then("Links validation")
    public void linksValidation() {
        System.out.println("Validated");
    }
}