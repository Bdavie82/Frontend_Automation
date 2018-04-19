package WebsiteAutomation.LogicObjects;

import WebsiteAutomation.PageObjects.HomepagePO;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class SeleniumTests extends BaseTest {

    @Test
    public void GetTitle()
    {
        HomepagePO.NavigatetoSite("https://www.skiutah.com/");
        HomepagePO.FindTitle();
    }


}
