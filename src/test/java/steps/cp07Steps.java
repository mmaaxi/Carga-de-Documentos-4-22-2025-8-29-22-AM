package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.cp07Page;

import static org.junit.Assert.assertTrue;

public class cp07Steps {

    WebDriver driver;
    WebDriverWait wait;
    cp07Page cp07Page;

    @Given("the user is on the {string} section")
    public void theUserIsOnTheSection(String section) {
        cp07Page = new cp07Page(driver);
        cp07Page.navigateToSection(section);
    }

    @When("the user attempts to upload a document in an invalid format")
    public void theUserAttemptsToUploadADocumentInAnInvalidFormat() {
        cp07Page.uploadInvalidFormatDocument();
    }

    @Then("a clear error message {string} is displayed")
    public void aClearErrorMessageIsDisplayed(String expectedErrorMessage) {
        String actualErrorMessage = cp07Page.getErrorMessage();
        assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }
}