package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp07Page {

    WebDriver driver;

    public cp07Page(WebDriver driver) {
        this.driver = driver;
    }

    By uploadSection = By.id("upload-section");
    By uploadInput = By.id("upload-input");
    By errorMessage = By.id("error-message");

    public void navigateToSection(String sectionName) {
        // Navigate to the specific section on the website
        driver.get("http://example.com/" + sectionName.toLowerCase());
    }

    public void uploadInvalidFormatDocument() {
        // Simulate the action of uploading a document with an invalid format
        driver.findElement(uploadInput).sendKeys("path/to/invalid/format/file.xyz");
    }

    public String getErrorMessage() {
        // Retrieve the error message displayed
        return driver.findElement(errorMessage).getText();
    }
}