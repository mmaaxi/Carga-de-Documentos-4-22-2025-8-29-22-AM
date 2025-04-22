package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.cp04Page;

public class cp04Steps {
    WebDriver driver = new ChromeDriver();
    cp04Page page = new cp04Page(driver);

    @Given("^el usuario está en la sección de \"Solicitud de renovación\"$")
    public void usuario_esta_en_seccion_solicitud_de_renovacion() {
        driver.get("http://example.com");
        page.navegarASeccionDeCarga();
    }

    @When("^el usuario selecciona la opción para cargar documentos$")
    public void usuario_selecciona_opcion_cargar_documentos() {
        page.mostrarOpcionDeCarga();
    }

    @When("^selecciona múltiples documentos válidos en formatos permitidos$")
    public void selecciona_multiples_documentos_validos() {
        page.seleccionarMultiplesDocumentos();
    }

    @When("^confirma la carga$")
    public void confirmar_carga() {
        page.confirmarCarga();
    }

    @Then("^todos los documentos se cargan correctamente y se muestra un mensaje de confirmación con la lista de documentos cargados$")
    public void verificacion_carga_exitosa() {
        page.verificarCargaExitosa();
        driver.quit();
    }
}