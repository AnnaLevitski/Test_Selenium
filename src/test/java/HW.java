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
        WebElement elAboutNav = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement elLogInNav = wd.findElement(By.cssSelector("[href='/login']"));

        WebElement elEmailInput = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement elPasswordInput = wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement elLoginButton= wd.findElement(By.cssSelector("button[name='login']"));
        WebElement elRegistrationButton= wd.findElement(By.cssSelector("button[name='registration']"));


    }

    @AfterClass
    public void close(){
        wd.quit();
    }


}
