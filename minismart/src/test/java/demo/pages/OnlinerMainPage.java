package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 3/19/17.
 */
public class OnlinerMainPage extends BaseForm {

    private Label lblLink = new Label(By.className("b-main-navigation__text"),"CatalogLink");

    public OnlinerMainPage() {
        super(By.className("b-top-logo"),"Main Page");
    }

    public void openCatalog() {

        lblLink.click();
    }
}
