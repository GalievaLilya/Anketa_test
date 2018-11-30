package selenium.example;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNgTestBase {

  protected static URL gridHubUrl = null;
  protected static String baseUrl;
  protected static Capabilities capabilities;

  protected WebDriver driver;

  @BeforeSuite
  public void initTestSuite() throws IOException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lgalieva\\Desktop\\soft\\chromedriver_win32\\chromedriver.exe");
  ChromeOptions chromeOptions = new ChromeOptions();            
  chromeOptions.setBinary("C:\\Program Files (x86)\\Anketa-redaktor XBRL\\bin\\Anketa-redaktor XBRL.exe");           
  DesiredCapabilities capability = new DesiredCapabilities();
  capability.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
  capability.setCapability("chromeOptions", chromeOptions);
  driver = new ChromeDriver(chromeOptions);
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
  }


  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
  
  public void waitXpath(String xpath) {
    WebDriverWait wait = new WebDriverWait(driver, 250);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
  }
}