package starter.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import starter.ui.BuySauceUI;
import starter.utils.RandomOperations;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Products implements Task {


    public static Products selectProducts(){return instrumented(Products.class);}


    @Override
    @Step("{0} users selects two random products in the pages sauce Demo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BuySauceUI.CONTAINER_PRODUCTS,isVisible()).forNoMoreThan(10).seconds());
        int sizeProducts=BuySauceUI.CONTAINER_PRODUCTS.resolveAllFor(actor).size();
        int numberProduct1= RandomOperations.numberRandominRange(sizeProducts);
        int numberProduct2=RandomOperations.numberRandominRange(sizeProducts);
        actor.attemptsTo(
                Click.on(BuySauceUI.CONTAINER_PRODUCTS.resolveAllFor(actor).get(numberProduct1)),
                Click.on(BuySauceUI.CONTAINER_PRODUCTS.resolveAllFor(actor).get(numberProduct2)),
                Click.on(BuySauceUI.BTN_SHOPPING_CART),
                Click.on(BuySauceUI.BTN_CHECKOUT)
        );
    }
}
