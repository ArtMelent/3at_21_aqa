package day_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.util.List;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {
        //initFromScratch();
        initUsingDriverManager();
        driver.get("https://www.google.com/");

        //STEP _ 1 Try search
        WebElement searchInput=driver.findElement(By.name("q"));
        String searchQueryText="search Query Text";
        searchInput.sendKeys(searchQueryText +Keys.ENTER
                //'\ue007'
        );

        //STEP _ 2 print search result
        List<WebElement> searchResultList= driver.findElements(By.xpath("//div[@id=\"rso\"]/div/div/div/div/a"));
        searchResultList.forEach(e-> System.out.println(e.getText()+"\t"+e.getAttribute("href")));
        String expectedURL= searchResultList.get(0).getAttribute("href");

        //STEP _ 3 select first result
        searchResultList.get(0).click();

        //STEP _ 4 validate URL
        String actualURL= driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL,"invalid result URL");


        driver.close();
        driver.quit();
    }

    private static void initUsingDriverManager() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    private static void initFromScratch() {

        System.setProperty("webdriver.chrome.driver","driver"+ File.separator+"chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.close();
        driver.quit();
    }
}