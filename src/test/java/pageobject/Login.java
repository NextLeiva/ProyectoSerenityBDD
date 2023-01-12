package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject  {
    @FindBy(id = "txt-username")
    public WebElementFacade usernameTxt;

    @FindBy(id = "txt-password")
    public WebElementFacade passwordTxt;

    @FindBy(id = "btn-login")
    public WebElementFacade loginBtn;
    public void iniciarSesion(){
        usernameTxt.type("John Doe");
        passwordTxt.type("ThisIsNotAPassword");
        loginBtn.click();
    }
}
