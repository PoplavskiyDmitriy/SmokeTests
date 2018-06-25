package SmokeTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SmokeTest {
    private static WebDriver driver;

    @Test
    public void main(){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://223.rts-tender.ru/supplier/auction/Trade/Search.aspx");
        WebElement button = driver.findElement(By.cssSelector("#BaseMainContent_MainContent_btnSearch"));
        String s = button.getText();
        if (s.equals("Поиск")) System.out.println("Search button present");
        else{
            System.out.println("Search button absent");}
    }
}


