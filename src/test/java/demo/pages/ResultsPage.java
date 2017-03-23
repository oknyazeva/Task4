package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

/**
 * Created by o_knyazeva on 3/19/17.
 */
public class ResultsPage extends BaseForm {

    private TextBox txbPrise = new TextBox(By.xpath(".//div[@class='schema-filter-control schema-filter-control_input']//input[contains(@placeholder, 'до')]"), "Prise");
    private TextBox txbYear = new TextBox(By.xpath(".//div[@class='schema-filter-control schema-filter-control_input']//input[contains(@placeholder, '2010')]"),"Year");
    private Button btnProduser = new Button(By.xpath(".//span[@class='i-checkbox']//input[@value='samsung']//following::span[1]"),"Producer");
    private Label lblDiagonal1 = new Label(By.xpath(".//div[@class='schema-filter__group']//select[@class='schema-filter-control__item' and position()=1]//option[@value='390']"),"Diagonal1");
    private Label lblDiagonal2 = new Label(By.xpath(".//div[@class='schema-filter__group']//div[@class='schema-filter-control schema-filter-control_select' and position()=2]//option[@value='420']"),"Diagonal2");

    public ResultsPage() {
        super(By.className("schema-header__title"), "TV Catalog Search");
    }

    public void chooseCheckBox (){
        btnProduser.click();
    }
    public void enterPrise(String prise) {
        txbPrise.setText(prise);
    }
    public void enterYear(String text) {
        txbYear.setText(text);
    }
    public void selectDiagonal1() {
        lblDiagonal1.click();
    }
    public void selectDiagonal2() {
        lblDiagonal2.click();
    }

}
