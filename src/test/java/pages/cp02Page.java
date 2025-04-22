package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp02Page {
    WebDriver driver;

    By solicitudRenovacionSection = By.id("solicitudRenovacion");
    By uploadOption = By.id("uploadOption");
    By invalidFileInput = By.id("fileInput");
    By errorMessage = By.id("errorMessage");

    public cp02Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSolicitudRenovacion() {
        driver.findElement(solicitudRenovacionSection).click();
    }

    public void selectUploadOption() {
        driver.findElement(uploadOption).click();
    }

    public boolean isUploadOptionDisplayed() {
        return driver.findElement(uploadOption).isDisplayed();
    }

    public void selectInvalidFormatDocument() {
        WebElement fileInput = driver.findElement(invalidFileInput);
        fileInput.sendKeys("path/to/invalid/file.exe");
    }

    public void attemptUpload() {
        driver.findElement(uploadOption).submit();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}