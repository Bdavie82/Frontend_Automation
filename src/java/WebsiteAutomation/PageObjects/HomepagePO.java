package PageObjects;

import LogicObjects.SeleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sun.font.TrueTypeFont;

import java.util.List;

public class HomepagePO {

    private WebDriver _webDriver;

    public HomepagePO(WebDriver webDriver){
        _webDriver = webDriver;
    }

    public void NavigateToSite(String WebSite){

        _webDriver.get(WebSite);
    }



    public Boolean FindTitle(){

        String Title;

        try {
             Title = _webDriver.getTitle();

            System.out.println("Page title: "+ Title);

            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e){

            System.out.println("Error finding Title");

            return false;
        }

    }

    public boolean NavigateToPage(String navigateTo){

        try{

            POHelper.WaitForElement(_webDriver, By.cssSelector(".SuperfishMegaMenu-level--1 [title~="+navigateTo+"]"));
            WebElement Page = _webDriver.findElement(By.cssSelector(".SuperfishMegaMenu-level--1 [title~="+navigateTo+"]"));

            String link = Page.getAttribute("href");

            System.out.println(link);
            _webDriver.get(link);

            return true;

        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Error finding " + navigateTo + " in navigation");
            return false;
        }


    }


}
