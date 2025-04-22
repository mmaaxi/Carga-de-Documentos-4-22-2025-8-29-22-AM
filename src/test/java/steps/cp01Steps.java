package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pages.cp01Page;

public class cp01Steps {
    cp01Page cp01Page = new cp01Page();

    @Given("^el usuario navega a la sección de \"Solicitud de renovación\"$")
    public void navegarASeccionSolicitudRenovacion() {
        cp01Page.navegarASeccionSolicitudRenovacion();
    }
    
    @When("^el usuario selecciona la opción para cargar documentos$")
    public void seleccionarOpcionCargarDocumentos() {
        cp01Page.seleccionarOpcionCargarDocumentos();
    }

    @When("^el usuario selecciona un documento válido \"([^\"]*)\" en formato XLS$")
    public void seleccionarDocumentoValido(String documento) {
        cp01Page.seleccionarDocumentoValido(documento);
    }

    @Then("^el usuario confirma la carga del documento$")
    public void confirmarCargaDocumento() {
        cp01Page.confirmarCargaDocumento();
    }

    @Then("^el documento se carga con éxito y se muestra un mensaje de confirmación$")
    public void verificarCargaExitosaYMensaje() {
        cp01Page.verificarCargaExitosaYMensaje();
    }
}