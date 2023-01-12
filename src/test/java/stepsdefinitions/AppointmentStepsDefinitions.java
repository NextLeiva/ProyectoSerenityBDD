package stepsdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageobject.Appointment;
import pageobject.Login;
import pageobject.MakeAppointment;
import pageobject.Home;
public class AppointmentStepsDefinitions {
    @Steps
    Home home;

    @Steps
    Login login;

    @Steps
    MakeAppointment makeAppointment;
    @Steps
    Appointment appointment;
    @Given("^el usuario ingresar a make appointment page$")
    public void elUsuarioIngresaAMakeAppointmentPage() {
        home.open();
        home.clicMakeAppointment();
    }
    @And("login to make appointment")
    public void loginToMakeAppointment() {
        login.iniciarSesion();
    }
    @When("^ingresar datos al appoinment datos (.*), (.*), (.*), (.*) y (.*)$")
    public void ingresarDatosAlAppoinmentDatosFacilityReadmissionProgramVisitDateYComment(String facility,String readmission, String program, String visitDate, String comment) {
        makeAppointment.insertMakeAppointment(facility,readmission,program,visitDate,comment);
    }
    @Then("^verificar datos de appointment datos (.*), (.*), (.*), (.*) y (.*)$")
    public void verificarDatosDeAppointmentDatosFacilityReadmissionProgramVisitDateYComment(String facility,String readmission, String program, String visitDate, String comment)  {
        appointment.validateDataAppointment(facility,readmission,program,visitDate,comment);
    }
}
