import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewLoginTests {
    WebDriver wd = new ChromeDriver();
    @BeforeClass
    public void preCondition(){
        String url = "https://telranedu.web.app/home";

        wd.navigate().to(url);
    }

    @Test
    public void loginSuccess(){
        // open form
        wd.findElement(a[href="/login"]);
        //fill form

        // submit form


    }
    @Test
    public void loginWrongEmail(){
        // open form

        //fill form

        // submit form


    }

    @Test
    public void loginWrongPassword(){
        // open form

        //fill form

        // submit form


    }

    @AfterClass
    public void postConditions(){
        wd.quit();
    }
}
