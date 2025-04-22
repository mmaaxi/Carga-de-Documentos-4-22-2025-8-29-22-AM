package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp04Page {
    WebDriver driver;

    By seccionCarga = By.id("seccionCarga");
    By botonCargarDocumentos = By.id("botonCargarDocumentos");
    By inputDocumentos = By.id("inputDocumentos");
    By botonConfirmarCarga = By.id("botonConfirmarCarga");
    By mensajeExito = By.id("mensajeExito");

    public cp04Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarASeccionDeCarga() {
        driver.findElement(seccionCarga).click();
    }

    public void mostrarOpcionDeCarga() {
        driver.findElement(botonCargarDocumentos).click();
    }

    public void seleccionarMultiplesDocumentos() {
        // Implementación para seleccionar múltiples documentos
    }

    public void confirmarCarga() {
        driver.findElement(botonConfirmarCarga).click();
    }

    public void verificarCargaExitosa() {
        assert driver.findElement(mensajeExito).isDisplayed();
    }
}