package LogicObjects;

import PageObjects.HomepagePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver _webDriver;

    protected HomepagePO HomepagePO;

    @BeforeTest
    public void SetUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        _webDriver = new ChromeDriver(options);

        HomepagePO = new HomepagePO(_webDriver);

        if(_webDriver != null){
            System.out.println("Opening chrome browser");
        }
        else{
            System.out.println("Something went wrong. Browser unable to open");
        }


    }

    @AfterTest
    public void TearDown() {

        if(_webDriver != null){
            System.out.println("Closing chrome browser");

            _webDriver.quit();
        }
    }
}