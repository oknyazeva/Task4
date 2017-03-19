package demo.tests;

import demo.pages.CatalogPage;
import demo.pages.OnlinerMainPage;
import demo.pages.ResultsPage;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 3/19/17.
 */

public class SearchTest extends BaseTest{

    @Override
    public void runTest() {
        logStep();
        OnlinerMainPage mainPageOn = new OnlinerMainPage();
        mainPageOn.openCatalog();

        logStep();
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.openTV();

        logStep();
        ResultsPage producer = new ResultsPage();
        producer.chooseCheckBox();

        logStep();
        ResultsPage setprise = new ResultsPage();
        setprise.enterPrise("1000");

        logStep();
        ResultsPage year = new ResultsPage();
        year.enterYear("2013");

        logStep();
        ResultsPage res1 = new ResultsPage();
        res1.selectDiagonal1();

        logStep();
        ResultsPage res2 = new ResultsPage();
        res2.selectDiagonal2();

    }
}
