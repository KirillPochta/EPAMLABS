import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HurtMePlentyTaskThree {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.get("https://cloud.google.com/");
        //WebElement searchBtn = driver.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]"));
      //  WebElement intputValuesIntopSearchTeaxArea = driver.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input"));
       // searchBtn.click();
       // intputValuesIntopSearchTeaxArea.sendKeys("Google Cloud Platform Pricing Calculator");
        //intputValuesIntopSearchTeaxArea.sendKeys(Keys.ENTER);

        driver.get("https://cloud.google.com/products/calculator?hl=en");
        //ya HZZZZZZZZZZZZZZZZZZ
        WebElement intputValuesInNumberOfIntenceses = driver.findElement(By.xpath(""));
        intputValuesInNumberOfIntenceses.sendKeys("4");
        // мб доделать
    }
}
