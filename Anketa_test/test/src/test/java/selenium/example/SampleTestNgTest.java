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
     //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[1]/dx-number-box/div/input")).sendKeys("123456789123");
     waitXpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[1]/dx-number-box/div/input");
     String[] anArrayOfStrings = "1027700132195".split("");
     for (int i = 0;i<anArrayOfStrings.length;i++)
     {
       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[1]/dx-number-box/div/input")).sendKeys(anArrayOfStrings[i]);
     }
     //Thread.sleep(1000);
     waitXpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[2]/dx-text-box/div/input");
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[2]/dx-text-box/div/input")).sendKeys("test_package");
     //выбор директории хранения пакета 
     //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[3]/app-choose-directory/div/dx-button")).sendKeys("C:\\Users\\lgalieva\\Desktop\\Converter\\514");
     driver.findElement(By.xpath("//*[@title='null']")).sendKeys("C:\\Users\\lgalieva\\Desktop\\Converter\\514");
     //выбор таксономии
     driver.findElement(By.tagName("dx-select-box")).click();
     driver.findElement(By.xpath("//div[@class = 'dx-item dx-list-item']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/dx-scroll-view/div[1]/div/div[1]/div[2]/div[6]/div[2]/dx-button/div/i")).click();
     Thread.sleep(1000);
     //выбор точки входа 
     // негосударственный пенсионный фонд
     // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/dx-tree-view/div/div/div/div[1]/ul/li[3]/div[2]")).click();
     // driver.findElement(By.xpath("//*/div[contains(text(),'Негосударственный пенсионный фонд')]")).click();
     driver.findElement(By.xpath("//*[@data-item-id=\"67\"]")).click();
     Thread.sleep(1000);
     // Надзорная отчетность, представляемая в течение 30 календарных дней, на конец месяца (кроме марта, июня, сентября, декабря)
     driver.findElement(By.xpath("//*[@data-item-id=\"68\"]")).click();   
     //driver.findElement(By.xpath("//*/div[contains(text(),'Надзорная отчетность, представляемая в течение 30 календарных дней, на конец месяца (кроме марта, июня, сентября, декабря)')]")).click();
     Thread.sleep(1000);  
     // Отчетность на конец месяца (кроме марта, июня, сентября, декабря)
     driver.findElement(By.xpath("//*[@data-item-id=\"69\"]")).click();
     // выбираем период январь 2018 года
     driver.findElement(By.xpath("//*[@data-item-id=\"70\"]")).click();
     Thread.sleep(1000);
     //нажать на кнопку "Выбрать"
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/dx-button[1]/div/span")).click();
     Thread.sleep(1000);
     //нажать на кнопку "Сохранить"
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[1]/form/dx-validation-group/div/dx-button[1]/div/span")).click();
     Thread.sleep(1000);
  }
  
}

