package Frontend_UI;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestCars {


       @Test
       public static void main(String[] args) {
           //Создаём системную переменную которая содержит путь к драйверу
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\frolova.n\\Desktop\\test\\AFT-Layers-example\\webdriver\\chromedriverWin.exe");

            //create webdriver
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            //open test page
            driver.get("https://www.carnext.com/en-be/");

            //User selects something in make and model dropdowns

            WebElement makeselector = driver.findElement(By.className("div.sc-gAmQfK.cMhgHF"));
            Actions builder = new Actions(driver);
            builder.click(makeselector).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            Select anotherMakeSelector = new Select (driver.findElement (By.className("div.sc-gAmQfK.cMhgHF")));
           anotherMakeSelector.selectByVisibleText("Opel");

            //User clicks search button
            WebElement button = driver.findElement (By.name("Search"));
            button.click();

        	// Verify that you’ve found the car with selected make and model.


            driver.quit();

                    }
    }



