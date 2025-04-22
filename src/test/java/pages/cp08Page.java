package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class cp08Page {
    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");
    private By validationStatus = By.id("validationStatus");
    private By validationResult = By.id("validationResult");

    public cp08Page() {
        this.driver = DriverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadValidDocument() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/valid/document.pdf");
        uploadElement.submit();
    }

    public boolean isDocumentUploaded() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isDocumentValidated() {
        return driver.findElement(validationStatus).getText().equals("Validated");
    }

    public boolean isValidationResultDisplayed() {
        return driver.findElement(validationResult).isDisplayed();
    }
}