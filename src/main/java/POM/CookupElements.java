package POM;

import net.bytebuddy.jar.asm.Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class CookupElements {
    static WebDriver driver;
    public CookupElements(WebDriver driver){
        CookupElements.driver=driver;
    }
    By cookupButton=By.xpath("//div[@class=\"store-item\"][2]");
    By categoriesButton=By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div[1]/div/div[1]/div[3]/div[2]/button");
    By groceriesOption=By.xpath("(//button[@role='button'])[28]");
    By oilButton=By.xpath("(//button[@role='button'])[6]");
    public void ClickCookup()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(cookupButton).click();
    }
    public void ClickCategories()throws InterruptedException{
        Thread.sleep(5000);
        //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        //assertTrue(driver.findElement(categoriesButton).isDisplayed());
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()){
            String child = it.next();
            driver.switchTo().window(child);
        }
        Thread.sleep(5000);
        driver.findElement(categoriesButton).click();
    }
    public void ClickGr()throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(groceriesOption).click();
    }
    public void ClickOil()throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(oilButton).click();
    }

    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
