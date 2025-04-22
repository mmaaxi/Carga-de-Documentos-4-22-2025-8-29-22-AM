package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp05Page {
    WebDriver driver;
    By seccionCarga = By.id("seccion-carga");
    By botonContinuar = By.id("btn-continuar");
    By mensajeError = By.id("mensaje-error");

    public cp05Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarASeccion(String seccion) {
        if(seccion.equals("Solicitud de renovación")) {
            driver.findElement(seccionCarga).click();
        }
    }

    public void intentaraContinuarSinDocumentos() {
        driver.findElement(botonContinuar).click();
    }

    public String obtenerMensajeDeError() {
        return driver.findElement(mensajeError).getText();
    }
}