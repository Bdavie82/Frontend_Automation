package LogicObjects;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumTests extends BaseTest {

    @Test
    @Parameters ({"website"})
    public void GetTitle(String website){

        HomepagePO.NavigateToSite(website);
        HomepagePO.FindTitle();

        Assert.assertTrue(HomepagePO.FindTitle(), String.valueOf(true));

    }

    @Test
    @Parameters({"website","navigateTo"})
    public void NavigateToMain(String website, String navigateTo){

        HomepagePO.NavigateToSite(website);
        HomepagePO.NavigateToPage(navigateTo);
    }


}
