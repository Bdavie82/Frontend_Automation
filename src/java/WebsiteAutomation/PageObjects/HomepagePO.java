package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/***
 * Created by Bryan Davie 5/14/2018
 * Used as a Page object for Homepage testing
 */

public class HomepagePO {

    private WebDriver _webDriver;
    public String Title;
    public String link;
    public String sublink;
    public HomepagePO(WebDriver webDriver){
        _webDriver = webDriver;
    }

    public void NavigateToSite(String WebSite){

        _webDriver.get(WebSite);
    }



    public Boolean FindTitle(){



        try {
            Title = _webDriver.getTitle();

            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e){

            System.out.println("Error finding Title");

            return false;
        }

    }

    public boolean NavigateToMainPage(String navigateToPage){

        try{

            POHelper.WaitForElement(_webDriver, By.cssSelector(".SuperfishMegaMenu-level--1 [title~="+navigateToPage+"]"));
            WebElement Page = _webDriver.findElement(By.cssSelector(".SuperfishMegaMenu-level--1 [title~="+navigateToPage+"]"));

            link = Page.getAttribute("href");

            _webDriver.get(link);

            return true;

        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Error finding " + navigateToPage + " in navigation");
            return false;
        }


    }

    /*public boolean NavigateToSubPage(String nagigateToSubPage){

        try{

            POHelper.WaitForElement(_webDriver, By.ByCssSelector(".SuperfishMegaMenu-subLink"));
            WebElement SubPage = _webDriver.findElement(By.ByCssSelector(".SuperfishMegaMenu-subLink"))

            sublink = SubPage.getAttribute("href")

            _webDriver.get(sublink)

            return true;
        }
        catch{
            System.out.println("Error finding Subpages in navigation");
            return false;
        }
    }*/


}
