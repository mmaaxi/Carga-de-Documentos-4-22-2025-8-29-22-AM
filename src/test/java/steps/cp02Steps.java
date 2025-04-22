package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.cp02Page;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertTrue;

public class cp02Steps {
    WebDriver driver;
    WebDriverWait wait;
    cp02Page page;

    @Given("el usuario navega a la sección de \"Solicitud de renovación\"")
    public void el_usuario_navega_a_la_seccion_de_solicitud_de_renovacion() {
        page = new cp02Page(driver);
        page.navigateToSolicitudRenovacion();
    }

    @When("el usuario selecciona la opción para cargar documentos")
    public void el_usuario_selecciona_la_opcion_para_cargar_documentos() {
        page.selectUploadOption();
    }

    @Then("se muestra la opción de carga")
    public void se_muestra_la_opcion_de_carga() {
        assertTrue(page.isUploadOptionDisplayed());
    }

    @When("el usuario selecciona un documento en formato no permitido")
    public void el_usuario_selecciona_un_documento_en_formato_no_permitido() {
        page.selectInvalidFormatDocument();
    }

    @When("intenta cargar el documento")
    public void intenta_cargar_el_documento() {
        page.attemptUpload();
    }

    @Then("el sistema muestra un mensaje de error indicando que el formato no es válido")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_que_el_formato_no_es_valido() {
        assertTrue(page.isErrorMessageDisplayed());
    }
}