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
import static starter.ui.BuySauceUI.*;

public class Information implements Task {

    private String firstName;
    private String lastName;
    private String zip;

    public Information() {
        ReadDataJson readDataJson = new ReadDataJson();
        readDataJson.getInformationUser();
        firstName = readDataJson.getName();
        lastName = readDataJson.getLastName();
        zip = readDataJson.getZip();
    }

    public static Information formAndFinish() {
        return instrumented(Information.class);
    }

    @Override
    @Step("{0} user complete form in the page sauce Demo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                Enter.theValue(zip).into(INPUT_ZIP),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(BTN_FINISH, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_FINISH)
        );
    }



}
