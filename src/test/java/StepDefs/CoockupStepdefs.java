package StepDefs;

import Core.Helper;
import POM.CookupElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CoockupStepdefs {
    static WebDriver driver;
        CookupElements web;
    @Given("go to Home page")
    public void goToHomePage() {
        Helper hp=new Helper();
        driver=hp.chromeLaunch();
    }


    @When("click on Cookup button")
    public void clickOnCookupButton() throws InterruptedException {
        web=new CookupElements(driver);
        web.ClickCookup();

    }

    @And("click on categories")
    public void clickOnCategories() throws InterruptedException {
        web.ClickCategories();
    }

    @And("click Groceries")
    public void clickGroceries() throws InterruptedException {
        web.ClickGr();
    }

    @And("click Oil")
    public void clickOil() throws InterruptedException {
        web.ClickOil();
    }

    @Then("exit")
    public void exit() throws InterruptedException {
        web.CloseBrowser();
    }
}
