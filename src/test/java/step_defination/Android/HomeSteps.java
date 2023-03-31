package step_defination.Android;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.Page;

import java.util.List;
import java.util.Map;


public class HomeSteps extends Page {
    @And("^\\[Home Page] User is on Home Page title 'Testing App'$")
    public void UserIsOnHomePageTitleTestingApp() throws InterruptedException {
        Thread.sleep(5000);
        getHomePage().getTitle().isDisplayed();
    }

    @And("^\\[Home Page] Verify the Version Code '106'$")
    public void verifyTheCode() throws InterruptedException {
        Thread.sleep(5000);
        getHomePage().getVersionCode().isDisplayed();
    }

    @And("^\\[Home Page] Verify the Version Name '12.0'$")
    public void verifyTheName() throws InterruptedException {
        Thread.sleep(5000);
        getHomePage().getVersionName().isDisplayed();
    }


    @Then("[Home Page] Verify the Immediate Update button is visible")
    public void homePageVerifyTheImmediateUpdateButtonIsVisible() {
        getHomePage().getImmediateButton().isDisplayed();
    }

    @When("[Home Page] User tap on Immediate Update Button")
    public void homePageUserTapOnImmediateUpdateButton() {
        getHomePage().getImmediateButton().click();
    }

    @Then("[Home Page] Verify the three button options")
    public void updatePageVerifyTheThreeButtonOptions(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> itemData : rows) {
            if (itemData.containsKey("Button1")) {
                Thread.sleep(3000);
                $(getHomePage().getFirstButton()).shouldHave(Condition.exactText(itemData.get("Button1")));
            }
            if (itemData.containsKey("Button2")) {
                Thread.sleep(3000);
                $(getHomePage().getSecondButton()).shouldHave(Condition.exactText(itemData.get("Button2")));
            }
            if (itemData.containsKey("Button3")) {
                Thread.sleep(3000);
                $(getHomePage().getThirdButton()).shouldHave(Condition.exactText(itemData.get("Button3")));
            }

        }
    }

    @When("[Home Page] User tap on Button1")
    public void homePageUserTapOnButton1() {
        getHomePage().getFirstButton().click();
    }

    @Then("[Home Page] Verify that Result 1 is visible")
    public void homePageVerifyThatResul1IsVisible() {
        getHomePage().getFirstResult().isDisplayed();
        getHomePage().backButton();
    }

}