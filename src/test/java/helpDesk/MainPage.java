package helpDesk;

import core.BaseSeleniumPage;
import core.BaseTestSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath ="//select[@name = 'queue']")
    private WebElement queueList;

    @FindBy(xpath = "//select[@name = 'queue']//option[@value  = '1']")
    private  WebElement queueValue;

    @FindBy(id = "id_title")
    private WebElement title;

    @FindBy(id = "id_body")
    private WebElement body;
}
