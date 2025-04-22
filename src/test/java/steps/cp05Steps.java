package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import pages.cp05Page;

public class cp05Steps {
    WebDriver driver;
    cp05Page solicitudRenovacionPage;

    @Given("el usuario navega a la sección de {string}")
    public void elUsuarioNavegaALaSecciónDe(String seccion) {
        solicitudRenovacionPage = new cp05Page(driver);
        solicitudRenovacionPage.navegarASeccion(seccion);
    }

    @When("el usuario intenta continuar sin cargar documentos obligatorios")
    public void elUsuarioIntentaContinuarSinCargarDocumentosObligatorios() {
        solicitudRenovacionPage.intentaraContinuarSinDocumentos();
    }

    @Then("el sistema muestra un mensaje de error indicando que se requieren documentos obligatorios para continuar")
    public void elSistemaMuestraUnMensajeDeErrorIndicandoQueSeRequierenDocumentosObligatoriosParaContinuar() {
        String mensajeError = solicitudRenovacionPage.obtenerMensajeDeError();
        assertEquals("Se requieren documentos obligatorios para continuar", mensajeError);
    }
}