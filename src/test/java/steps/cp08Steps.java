package steps;

import pages.cp08Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class cp08Steps {
    cp08Page documentPage = new cp08Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        documentPage.navigateToDocumentUploadPage();
    }

    @When("el usuario carga un documento válido")
    public void elUsuarioCargaUnDocumentoValido() {
        documentPage.uploadValidDocument();
    }

    @Then("el documento se carga correctamente")
    public void elDocumentoSeCargaCorrectamente() {
        Assert.assertTrue(documentPage.isDocumentUploaded());
    }

    @Then("el sistema valida el documento")
    public void elSistemaValidaElDocumento() {
        Assert.assertTrue(documentPage.isDocumentValidated());
    }

    @Then("el sistema muestra los resultados de validación en la pantalla")
    public void elSistemaMuestraLosResultadosDeValidacionEnLaPantalla() {
        Assert.assertTrue(documentPage.isValidationResultDisplayed());
    }
}