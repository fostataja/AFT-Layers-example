import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenuTest {


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

        WebElement menu = driver.findElement(By.cssSelector(Cred.activities));
        menu.click();
        WebElement submenu = driver.findElement(By.cssSelector(Cred.contracts));
        submenu.click();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/span")).click();
        Thread.sleep(3000);
        WebElement createQH = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div[1]/div/div/div[1]/div/div/div[3]/button/div/span"));
        createQH.click();
        Thread.sleep(1000);
        driver.findElements(By.xpath("//input[@name='name']")).get(0).sendKeys("testAuto");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.cssSelector(Cred.save));
        submit.click();



    }
//
}





