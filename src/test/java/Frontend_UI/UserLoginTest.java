import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class UserLoginTest {

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\frolova.n\\Desktop\\Nt\\test\\chromedriver.exe");
        Selenide.clearBrowserCookies(); //to clear login
    }

    @Test
    public static void userCanLogin() throws InterruptedException {
        String baseURL = "https://portal-test.effie.mobi/";
        String mainURL;

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//input[@name='userName']")).get(0).sendKeys("u0ba3@ipland.com.ua");
        driver.findElements(By.xpath("//input[@name='password']")).get(0).sendKeys("testPass");
        driver.findElement(By.xpath("//form/button")).click();

        Thread.sleep(4000);


        mainURL = driver.getCurrentUrl();
        System.out.println(mainURL);


//        driver.close();
//        driver.quit();
    }
}