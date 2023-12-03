import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
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
       List<WebElement> list3 = wd.findElements(By.xpath("//a"));
       int i = list.size();
       WebElement el3 = list.get(2);

       WebElement elContainer = wd.findElement(By.className("container"));
       WebElement elContainer2 = wd.findElement(By.cssSelector(".container"));
       WebElement elContainer3 = wd.findElement(By.xpath("//*[@class='container']"));

       List<WebElement> list1 = wd.findElements(By.className("naw-item"));
       List<WebElement> list2 = wd.findElements(By.cssSelector(".naw-item"));

       WebElement elByID = wd.findElement(By.id("nav"));
       WebElement elByID2 = wd.findElement(By.cssSelector("#nav"));
       WebElement elByID3 = wd.findElement(By.xpath("//*[@id='nav']"));


       WebElement elByAtrebut = wd.findElement(By.cssSelector("[href='#item2']"));

       WebElement elByName = wd.findElement(By.name("name"));
       WebElement elByName2 = wd.findElement(By.cssSelector("[name='name']"));


       WebElement elPasswordInput = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
       WebElement elPasswordInput1 = wd.findElement(By.cssSelector("[placeholder ^='Type']"));
       WebElement elPasswordInput2 = wd.findElement(By.cssSelector("[placeholder $='name']"));
       WebElement elPasswordInput4 = wd.findElement(By.xpath("//input[@placeholder ='Type your name']"));
       WebElement elPasswordInput5 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Type')"));

       // contains
       WebElement elPasswordInput3 = wd.findElement(By.cssSelector("[placeholder *='your']"));
       WebElement elPasswordInput6 = wd.findElement(By.xpath("//input[contains(@placeholder, 'your')"));

    }

    @Test
    public void testEquals(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
        //Assert.assertEquals(canada.getText(), "USA");
    }

    @AfterClass
    public void ac(){
        wd.quit();
    }

}
