package step_defination.Android;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Page;

import java.util.List;
import java.util.Map;


public class HomeSteps extends Page {
    @And("^\\[Home Page\\] User is on Home Page title (.*)$")
    public void UserIsOnHomePageTitleTestingApp(String title)  {
        Assert.assertEquals(getHomePage().getTitle().getText(),title,"Verify App Title");
    }

    @And("^\\[Home Page\\] Verify the Version Code (.*)$")
    public void verifyTheCode(String versionCode) {
        Assert.assertEquals(getHomePage().getVersionCode().getText(),versionCode,"Verify Version Code");
    }

    @And("^\\[Home Page\\] Verify the Version Name (.*)$")
    public void verifyTheName(String versionName) {
        Assert.assertEquals(getHomePage().getVersionName().getText(),versionName,"Verify Version Name");
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

//    @Then("[Home Page] Verify the three button options")
//    public void updatePageVerifyTheThreeButtonOptions(DataTable dataTable,String button) throws InterruptedException {
//        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
//        for (Map<String, String> itemData : rows) {
//            if (itemData.containsKey("Button1")) {
//                Thread.sleep(3000);
//                $(getHomePage().getButton(button)).shouldHave(Condition.exactText(itemData.get("Button1")));
//            }
//            if (itemData.containsKey("Button2")) {
//                Thread.sleep(3000);
//                $(getHomePage().getButton(button)).shouldHave(Condition.exactText(itemData.get("Button2")));
//            }
//            if (itemData.containsKey("Button3")) {
//                Thread.sleep(3000);
//                $(getHomePage().getButton(button)).shouldHave(Condition.exactText(itemData.get("Button3")));
//            }
//
//        }
//    }

    @When("\\[Home Page\\] User tap on Button (.*)$")
    public void homePageUserTapOnButtonXxx(String button) {
        getHomePage().getButton(button).click();
    }

    @Then("\\[Home Page\\] Verify that Result (.*) is displayed$")
    public void homePageVerifyThatResul1IsVisible(String number) {
        Assert.assertEquals(getHomePage().getFirstResult().getText(),"RESULT "+number,"Verify Result with Number");
        getHomePage().backButton();
    }

}