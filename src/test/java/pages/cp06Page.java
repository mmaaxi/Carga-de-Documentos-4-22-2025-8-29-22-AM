package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp06Page {
    WebDriver driver;
    By sectionCarga = By.id("sectionCargaId");
    By inputFile = By.id("fileInput");
    By uploadButton = By.id("uploadButton");
    By progressWindow = By.id("progressWindow");

    public cp06Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSolicitudRenovacion() {
        driver.get("URL_DE_SOLICITUD_RENOVACION");
    }

    public boolean isCargaSectionDisplayed() {
        return driver.findElement(sectionCarga).isDisplayed();
    }

    public void selectLargeFile() {
        WebElement uploadElement = driver.findElement(inputFile);
        uploadElement.sendKeys("PATH_DEL_ARCHIVO_GRANDE");
    }

    public boolean isLargeFileSelected() {
        return driver.findElement(inputFile).getAttribute("value").length() > 0;
    }

    public void startFileUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadProgressDisplayed() {
        return driver.findElement(progressWindow).isDisplayed();
    }
}