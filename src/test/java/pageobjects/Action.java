package pageobjects;

import java.util.concurrent.TimeUnit;

public class Action extends Locators {
    private static final String baseUrl = "https://demoqa.com/";

    public void connection() {
        try {
            getDriver().get(baseUrl);
            getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (Exception e){
            System.out.println("Website did not reached.");
        }
    }
}