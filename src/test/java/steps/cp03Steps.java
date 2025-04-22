package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.cp03Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class cp03Steps {
    WebDriver driver;
    cp03Page page;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        page = new cp03Page(driver);
    }

    @Given("el usuario navega a la sección de \"Solicitud de renovación\"")
    public void el_usuario_navega_a_la_seccion_de_solicitud_de_renovacion() {
        page.navigateToSolicitudDeRenovacion();
    }

    @When("el usuario selecciona la opción para cargar documentos")
    public void el_usuario_selecciona_la_opcion_para_cargar_documentos() {
        page.selectUploadOption();
    }

    @When("el usuario selecciona un documento que excede los 50 MB")
    public void el_usuario_selecciona_un_documento_que_excede_los_50_MB() {
        page.selectFileExceedingSize();
    }

    @Then("el sistema muestra un mensaje de error indicando que el tamaño del archivo supera el límite permitido")
    public void el_sistema_muestra_un_mensaje_de_error() {
        assertTrue(page.isErrorMessageDisplayed());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}