package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import starter.ui.BuySauceUI;
import starter.utils.ReadDataJson;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginSauce implements Task {

    private final String userName;
    private final String password;

    public LoginSauce(){
        ReadDataJson readDataJson=new ReadDataJson();
        readDataJson.getInformationUser();
        userName=readDataJson.getUserName();
        password=readDataJson.getPassword();
    }

    public static LoginSauce makeLogin(){return instrumented(LoginSauce.class);}

    @Override
    @Step("{0} user makes login in the page Sauce Demo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BuySauceUI.INPUT_USER_NAME,isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userName).into(BuySauceUI.INPUT_USER_NAME),
                Enter.theValue(password).into(BuySauceUI.INPUT_PASSWORD),
                Click.on(BuySauceUI.BTN_LOGIN)
        );
    }
}
