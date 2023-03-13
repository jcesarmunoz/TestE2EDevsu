package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = "starter.stepdefinitions",
        features = "src/test/resources/features/buy_products.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
/**
 *Configurations Cucumber and Serenity BDD
 */

public class TestE2ESuite {
}
