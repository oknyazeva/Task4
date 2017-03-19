package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 3/19/17.
 */
public class CatalogPage extends BaseForm {

    private Label lblLink = new Label(By.xpath(".//div[@class='catalog-bar-main']//a[contains(text(), 'Телевизоры')]"),"TVLink");

    public CatalogPage() {
        super(By.className("catalog-navigation"),"TV Catalog");
    }

    public void openTV() {
        lblLink.click();
    }
}
