package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


/**
 * This class contains the locators for each object on the page
 */

public class BuySauceUI {

    public static final Target INPUT_USER_NAME=Target.the("Enter Usename").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD=Target.the("Enter Password").located(By.id("password"));
    public static final Target BTN_LOGIN=Target.the("Button Login Page").located(By.id("login-button"));
    public static final Target TXT_TITLE_HOME=Target.the("Text Home Products").locatedBy("//*[@class='header_secondary_container']//span[@class='title']");

    public static final Target CONTAINER_PRODUCTS=Target.the("container products").locatedBy("//div[@class='inventory_list']//div[@class='inventory_item']//button");
    public static final Target BTN_SHOPPING_CART=Target.the("shopping cart").located(By.className("shopping_cart_link"));
    public static final Target BTN_CHECKOUT=Target.the("chekcout").located(By.id("checkout"));

    public static final Target INPUT_FIRST_NAME=Target.the("checkout first name").located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME=Target.the("checkout last name").located(By.id("last-name"));
    public static final Target INPUT_ZIP=Target.the("checkout Zip").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE=Target.the("continue from checkout").located(By.id("continue"));

    public static final Target BTN_FINISH=Target.the("Complete purchase").located(By.id("finish"));

    public static final Target TXT_COMPLETE=Target.the("Complete Header").located(By.className("complete-header"));


}
