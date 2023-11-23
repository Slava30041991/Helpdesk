package helpDesk;
import core.BaseTestSelenium;
import org.junit.Test;

public class HelpDeskTest extends BaseTestSelenium {
    @Test
    public void checkTicket(){
        String title = "Slava Youtuber";
        String body = "Техническая поддержка";
        String mail = "fake@mail.ru";
        MainPage mainPage = new MainPage();
        mainPage.createTicket(title,body,mail);

    }
}
