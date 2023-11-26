import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
    WebDriver wd;
    String url = "https://telranedu.web.app/home";


    @Test
    public void test(){
        wd = new ChromeDriver();
//        wd.get(url); without history
        wd.navigate().to(url);

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close(); // close one tab
        wd.quit();  // close all

    }
}