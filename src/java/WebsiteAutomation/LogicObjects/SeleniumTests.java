package LogicObjects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumTests extends BaseTest {

    @Test
    @Parameters ({"website"})
    public void GetTitle(String website)
    {

        HomepagePO.NavigateToSite(website);
        HomepagePO.FindTitle();
        
    }


}
