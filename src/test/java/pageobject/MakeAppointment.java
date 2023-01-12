package pageobject;
import actions.SelectOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MakeAppointment extends PageObject  {
    @FindBy(css = "#combo_facility")
    public WebElementFacade facilityCombo;

    @FindBy(id = "chk_hospotal_readmission")
    public WebElementFacade readmissionChk;
    @FindBy(xpath = "//label[@class='radio-inline']")
    public List<WebElementFacade> programRadio;

    @FindBy(id = "txt_visit_date")
    public WebElementFacade visiteDate;



    @FindBy(id = "txt_comment")
    public WebElementFacade commentTxt;

    @FindBy(id = "btn-book-appointment")
    public WebElementFacade bookBtn;
    public void insertMakeAppointment(String facility, String readmission, String program, String visitDate, String comment){
        element(readmissionChk).waitUntilVisible();
        Select elementCountry = new Select(facilityCombo);
        elementCountry.selectByVisibleText(facility);
        if (Boolean.parseBoolean(readmission)) {
            readmissionChk.click();
        }
        SelectOptions.in(programRadio, program);
        visiteDate.type(visitDate);
        commentTxt.type(comment);
        bookBtn.click();
    }
}
