package za.co.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public TestBase() {
        driver = null;
    }

    public void before() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void after() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected String getSiteURL() {
        String URL = System.getProperty("testURL");
        if (URL == null)
            return "http://newtours.demoaut.com/";
        else {
            return URL;
        }
    }

    protected WebDriver getWebDriver() {
        return driver;
    }
}