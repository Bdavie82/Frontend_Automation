package LogicObjects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/***
 * Created by Bryan Davie 5/14/2018
 * Used as a place to execute Frontend testing
 */

public class SeleniumTests extends BaseTest {

    @Test
    @Parameters ({"website"})
    public void GetTitle(String website){

        HomepagePO.NavigateToSite(website);

        if (HomepagePO.FindTitle() == true) {
            System.out.println("Page title: "+ HomepagePO.Title);
        }
        else{
            System.out.println("Error finding page title using FindTitle method.");
        }


    }

    @Test
    @Parameters({"website","navigateTo"})
    public void NavigateToMain(String website, String navigateTo){

        HomepagePO.NavigateToSite(website);

        if (HomepagePO.NavigateToPage(navigateTo) == true) {
            System.out.println("Page to navigate to: "+ HomepagePO.link);
        }else
            System.out.println("Unable to find page to navigate to using NavigateToPage method.");
    }


}
