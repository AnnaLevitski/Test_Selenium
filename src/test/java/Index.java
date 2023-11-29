import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();

        wd.get("file:///Users/anna/Downloads/21.index.html");
    }
    @Test
    public void testCSS(){
       WebElement el = wd.findElement(By.tagName("button"));
       WebElement el2 = wd.findElement(By.cssSelector("button"));

       List<WebElement> list = wd.findElements(By.tagName("a"));
       int i = list.size();
       WebElement el3 = list.get(2);

       WebElement elContainer = wd.findElement(By.className("container"));
       WebElement elContainer2 = wd.findElement(By.cssSelector(".container"));

       List<WebElement> list1 = wd.findElements(By.className("naw-item"));
       List<WebElement> list2 = wd.findElements(By.cssSelector(".naw-item"));

       WebElement elByID = wd.findElement(By.id("nav"));
       WebElement elByID2 = wd.findElement(By.cssSelector("#nav"));


       WebElement elByAtrebut = wd.findElement(By.cssSelector("[href='#item2']"));

       WebElement elByName = wd.findElement(By.name("name"));
       WebElement elByName2 = wd.findElement(By.cssSelector("[name='name']"));






    }

}
