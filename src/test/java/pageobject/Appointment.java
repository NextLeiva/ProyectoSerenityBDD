package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class Appointment extends PageObject {
    @FindBy(id = "facility")
    public WebElementFacade facilityTxt;

    @FindBy(id = "hospital_readmission")
    public WebElementFacade readmissionTxt;

    @FindBy(id = "program")
    public WebElementFacade programTxt;

    @FindBy(id = "visit_date")
    public WebElementFacade dateTxt;

    @FindBy(id = "comment")
    public WebElementFacade commentTxt;

    public void validateDataAppointment(String facility, String readmission, String program, String visitDate, String comment) {
        element(facilityTxt).waitUntilVisible();
        String actualFacility = facilityTxt.getText();
        String actualReadmission = readmissionTxt.getText();
        String actualProgram = programTxt.getText();
        String actualVisitDate = dateTxt.getText();
        String actualComment = commentTxt.getText();

        if (Boolean.parseBoolean(readmission)) {
            readmission="Yes";
        }
        Assert.assertEquals(actualFacility, facility);
        Assert.assertEquals(actualReadmission, readmission);
        Assert.assertEquals(actualProgram, program);
        Assert.assertEquals(actualVisitDate, visitDate);
        Assert.assertEquals(actualComment, comment);
    }
}
