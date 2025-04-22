package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.cp06Page;

public class cp06Steps {
    WebDriver driver;
    cp06Page page;

    public cp06Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, cp06Page.class);
    }

    @Given("que el usuario navega a la sección de \"Solicitud de renovación\"")
    public void el_usuario_navega_a_la_seccion_de_solicitud_de_renovacion() {
        page.goToSolicitudRenovacion();
        Assert.assertTrue("No se accedió correctamente a la sección de carga", page.isCargaSectionDisplayed());
    }

    @When("selecciona un archivo grande")
    public void selecciona_un_archivo_grande() {
        page.selectLargeFile();
        Assert.assertTrue("No se seleccionó un archivo grande correctamente", page.isLargeFileSelected());
    }

    @When("inicia la carga del archivo")
    public void inicia_la_carga_del_archivo() {
        page.startFileUpload();
    }

    @Then("aparece una ventana mostrando el progreso de la carga hasta que se completa")
    public void verificar_progreso_de_la_carga() {
        Assert.assertTrue("La ventana de progreso no aparece correctamente", page.isUploadProgressDisplayed());
    }
}