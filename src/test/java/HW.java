import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HW {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }
    @Test
    public void test(){
        WebElement elHomeNav = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement elHomeNav2 = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']/a[1]"));

        WebElement elAboutNav = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement elAboutNav2 = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']/a[2]"));


        WebElement elLogInNav = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement elLogInNav2 = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']/a[3]"));


        WebElement elEmailInput = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement elEmailInput2 = wd.findElement(By.xpath("//input[@placeholder='Email']"));



        WebElement elPasswordInput = wd.findElement(By.xpath("//input[@placeholder='Password']"));



        WebElement elRegistrationButton= wd.findElement(By.cssSelector("button[name='registration']"));
        WebElement elRegistrationButton2= wd.findElement(By.xpath("//button[@name='registration']"));


        WebElement elLoginButton= wd.findElement(By.cssSelector("button[name='login']"));
        WebElement elLoginButton2= wd.findElement(By.xpath("//button[@name='login']"));


    }

    @AfterClass
    public void close(){
       wd.quit();
    }


}
