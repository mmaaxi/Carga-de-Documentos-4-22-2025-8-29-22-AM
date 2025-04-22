package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp01Page {
    WebDriver driver;

    By seccionSolicitudRenovacion = By.id("seccionSolicitudRenovacion");
    By opcionCargarDocumentos = By.id("opcionCargarDocumentos");
    By botonCargarDocumento = By.id("botonCargarDocumento");
    By mensajeConfirmacion = By.id("mensajeConfirmacion");

    public cp01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarASeccionSolicitudRenovacion() {
        driver.findElement(seccionSolicitudRenovacion).click();
    }

    public void seleccionarOpcionCargarDocumentos() {
        driver.findElement(opcionCargarDocumentos).click();
    }

    public void seleccionarDocumentoValido(String documento) {
        WebElement uploadElement = driver.findElement(By.name("file"));
        uploadElement.sendKeys(documento);
    }

    public void confirmarCargaDocumento() {
        driver.findElement(botonCargarDocumento).click();
    }

    public void verificarCargaExitosaYMensaje() {
        WebElement mensaje = driver.findElement(mensajeConfirmacion);
        assert(mensaje.isDisplayed());
    }
}