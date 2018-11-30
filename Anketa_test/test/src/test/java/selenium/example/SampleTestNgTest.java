package selenium.example;

import java.security.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.example.TestNgTestBase;

public class SampleTestNgTest extends TestNgTestBase {



@Test
   public void TestSampleGooglePlayElectronApp() throws Exception    {
     waitXpath("/html/body/app-root/div/app-top-toolbar/ul/li[1]/ul/li[1]/button");
     driver.findElement(By.xpath("/html/body/app-root/div/app-top-toolbar/ul/li[1]/ul/li[1]/button")).click();
     waitXpath("/html/body/div[2]/div/div[1]");
     waitXpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[1]/div");
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[1]/dx-number-box/div/input")).sendKeys("123456789123");
     Thread.sleep(1000);
     waitXpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[2]/dx-text-box/div/input");
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[2]/dx-text-box/div/input")).sendKeys("test_package");
     driver.findElement(By.tagName("dx-select-box")).click();
     driver.findElement(By.xpath("//div[@class = 'dx-item dx-list-item']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[6]/div[2]/dx-button/div/i")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/dx-tree-view/div/div/div/div[1]/ul/li[3]/div[1]/div")).click();
     
     
  }
  
}

