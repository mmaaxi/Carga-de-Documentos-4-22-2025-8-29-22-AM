package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp03Page {
    WebDriver driver;

    private By uploadSectionButton = By.id("upload-section-button");
    private By uploadOptionButton = By.id("upload-option-button");
    private By fileInput = By.id("file-input");
    private By errorMessage = By.id("error-message");

    public cp03Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSolicitudDeRenovacion() {
        driver.get("http://example.com/solicitud-de-renovacion");
    }

    public void selectUploadOption() {
        driver.findElement(uploadOptionButton).click();
    }

    public void selectFileExceedingSize() {
        driver.findElement(fileInput).sendKeys("/path/to/large/file.txt");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}