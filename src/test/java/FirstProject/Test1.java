package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {


    WebDriver wd;


    @BeforeMethod
    public void preCond(){
        // ChromeOptions chromeOptions = new ChromeOptions();
        // WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");

    }

    @Test
    public void testNew() {
        //WebElement el = wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        // WebElement el3 = wd.findElement(By.className("btn btn-sm btn-link"));
        // WebElement link = wd.findElement(By.linkText("Sign Up"));
        //WebElement partLink = wd.findElement(By.partialLinkText("Sign"));
        List<WebElement> ael= wd.findElements(By.tagName("a"));
        System.out.println(ael.size());

    }

    @AfterMethod
    public void close(){
        wd.close();
        wd.quit();
    }


}
