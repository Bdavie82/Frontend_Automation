package WebsiteAutomation.PageObjects;

import org.openqa.selenium.WebDriver;

public class HomepagePO {

    private WebDriver _webDriver;

    public HomepagePO(WebDriver webDriver){
        _webDriver = webDriver;
    }

    public void NavigatetoSite(String WebSite)
    {

        _webDriver.get(WebSite);
    }



    public String FindTitle(){

        String Title;

        Title = _webDriver.getTitle();

        System.out.println("Page title: "+Title);

        return Title;
    }


}
