package helpDesk;
import core.BaseSeleniumPage;
import delete.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath ="//select[@name = 'queue']")
    private WebElement queueList;

    @FindBy(xpath = "//select[@name = 'queue']//option[@value  = '1']")
    private  WebElement queueValue;

    @FindBy(id = "id_title")
    private WebElement title;

    @FindBy(id = "id_body")
    private WebElement body;

    @FindBy(id = "id_due_date")
    private WebElement dateFiled;

    @FindBy(xpath = "//table[@class = 'ui-datepicker-calendar' ]//a[text()= 23]")
    private WebElement dateValue;

    @FindBy(id = "id_submitter_email")
    private  WebElement email;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement button;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }
    public MainPage createTicket(String titleValue, String bodyValue, String emailValue){
        queueList.click();
        queueValue.click();
        title.sendKeys(titleValue);
        body.sendKeys(bodyValue);
        dateFiled.click();
        dateValue.click();
        email.sendKeys(emailValue);
        button.click();
        return this;

    }
}
