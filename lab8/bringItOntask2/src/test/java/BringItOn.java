import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BringItOn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastecode.ru/");
        WebElement inputAuthorNameValues = driver.findElement(By.name("author"));
        WebElement inputTitleValues = driver.findElement(By.name("title"));
        WebElement inputCodeLanguegeValues = driver.findElement(By.name("language"));
        WebElement inputPasteValues = driver.findElement(By.name("code"));
        WebElement pasteValuesBtn = driver.findElement(By.xpath("//*[@id=\"code-submit-container\"]/input"));
        String valueForInputIntoCodeArea = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        inputAuthorNameValues.sendKeys("KirillPochta");
        Thread.sleep(1000);
        inputCodeLanguegeValues.sendKeys("Bash");
        Thread.sleep(1000);
        inputPasteValues.sendKeys(valueForInputIntoCodeArea);
        Thread.sleep(1000);
        inputTitleValues.sendKeys("how to gain dominance among developers");
        Thread.sleep(1000);

        String saveTitleValue = inputTitleValues.getText();
        String saveLanguegeValue = inputCodeLanguegeValues.getText();

        pasteValuesBtn.click();

        WebElement outputCodeLanguegeValues = driver.findElement(By.name("language"));
        WebElement outputPasteCodeValues = driver.findElement(By.xpath("//*[@id=\"code\"]/pre"));
        outputCodeLanguegeValues.sendKeys("bash");

        Logger logger = Logger.getLogger(BringItOn.class.getName());

        if(driver.getTitle().equals(saveTitleValue)){
            logger.log(Level.INFO,"Paste Name equally to Title of URL");
        } else  logger.log(Level.INFO,"Paste Name is not equally to Title of URL");

        if(outputCodeLanguegeValues.getText().equals(saveLanguegeValue)){
            logger.log(Level.INFO,"language we entered is equally to output language");
        } else  logger.log(Level.INFO,"language we entered is not equally to output language");

        if(outputPasteCodeValues.getText().equals(valueForInputIntoCodeArea)){
            logger.log(Level.INFO,"Output code is equally to input code ");
        } else   logger.log(Level.INFO,"Output code is not equally to input code ");

        Thread.sleep(600000);
        driver.close();
    }
}
