package RNDLW_AUTH.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class signup {
    @Test public void signUp_negative () {

        System.setProperty("webdriver.chrome.driver", "/home/karkusha/Documents/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://roundlaw.com/landing/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,10000)", "");
        /*WebDriverWait wait = new WebDriverWait(driver, 10);*/
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
        WebElement firstname = driver.findElement(By.id("name"));
        firstname.sendKeys("test");
        WebElement secondname = driver.findElement(By.id("surname"));
        secondname.sendKeys("1");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@test.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345");
        WebElement button = driver.findElement(By.className("button_box"));
        button.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-text")));
        driver.quit();

    }

    @Test public void signUp_positive (){
        System.setProperty("webdriver.chrome.driver", "/home/karkusha/Documents/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://roundlaw.com/landing/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,10000)", "");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
        WebElement firstname = driver.findElement(By.id("name"));
        firstname.sendKeys("test");
        WebElement secondname = driver.findElement(By.id("surname"));
        secondname.sendKeys("1");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@test.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345");
        WebElement button = driver.findElement(By.className("button_box"));
        button.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 10);


    }


}

