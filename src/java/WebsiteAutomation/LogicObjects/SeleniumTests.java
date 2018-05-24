package LogicObjects;

import PageObjects.HomepagePO;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumTests extends BaseTest {

    @Test
    @Parameters ({"website"})
    public void GetTitle(String website){

        HomepagePO.NavigateToSite(website);
        HomepagePO.FindTitle();
        
    }

    @Test
    @Parameters({"website","navigateTo"})
    public void NavigateToSite(String website, String navigateTo){

        HomepagePO.NavigateToSite(website);
        HomepagePO.NavigateToPage(navigateTo);
    }


}
