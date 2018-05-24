package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepagePO {

    private WebDriver _webDriver;

    public HomepagePO(WebDriver webDriver){
        _webDriver = webDriver;
    }

    public void NavigateToSite(String WebSite){

        _webDriver.get(WebSite);
    }



    public String FindTitle(){

        String Title;

        Title = _webDriver.getTitle();

        System.out.println("Page title: "+Title);

        return Title;
    }

    public boolean NavigateToPage(String navigateTo){

        try{
            POHelper.WaitForElement(_webDriver, By.cssSelector(".SuperfishMegaMenu-level--1"));
            List<WebElement> mainPages = _webDriver.findElements(By.cssSelector(".SuperfishMegaMenu-level--1"));
            WebElement Page = POHelper.ClickListItem(mainPages,navigateTo);

            //WebElement Page = _webDriver.findElement(By.cssSelector("span[title='Deals']"));

            Page.click();
            return true;

        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Error finding " + navigateTo + " in navigation");
            return false;
        }


    }


}
