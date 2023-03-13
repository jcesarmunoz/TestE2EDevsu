package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.task.Information;
import starter.task.LoginSauce;
import starter.task.Products;
import starter.ui.BuySauceUI;

public class BuyStepDefinitions {


    @Given("{actor} has an account to make purchases")
    public void hasAnAccountToMakePurchases(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.sauceDemo());
        actor.attemptsTo(
                LoginSauce.makeLogin()
        );
    }
    @Given("{actor} can log in with their credentials")
    public void canLogInWithTheirCredentials(Actor actor) {
        Ensure.that(BuySauceUI.TXT_TITLE_HOME).hasText("Products");
    }
    @When("{actor} chooses her products")
    public void theUserChoosesHisProducts(Actor actor) {
        actor.attemptsTo(
                Products.selectProducts()
        );
    }
    @When("{actor} completed the formulary")
    public void completedTheFormulary(Actor actor) {
        actor.attemptsTo(
                Information.formAndFinish()
        );
    }
    @Then("{actor} sees a purchase confirmation")
    public void theUserSeesAPurchaseConfirmation(Actor actor) {
        actor.attemptsTo(
                Ensure.that(BuySauceUI.TXT_COMPLETE).hasText("Thank you for your order!")
        );
    }
}
