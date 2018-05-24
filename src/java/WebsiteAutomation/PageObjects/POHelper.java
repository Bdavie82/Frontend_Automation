package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/***
 * Created by Bryan Davie 5/14/2018
 * Used as a helper class for Page objects
 */
public class POHelper {

    public static WebElement ClickListItem(List<WebElement> textCollection, String searchText){

        for (WebElement item : textCollection){
            String listText = item.getAttribute("innerText");
            listText = listText.trim();
            if (listText.contains(searchText)){
                return item;
            }
        }
        throw new RuntimeException("Unable to locate text: "+ searchText);
    }

    public static void WaitForElement(WebDriver webDriver, By locator)
    {
        webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(webDriver, 45);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }

    public static void WaitForElement(WebDriver webDriver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
