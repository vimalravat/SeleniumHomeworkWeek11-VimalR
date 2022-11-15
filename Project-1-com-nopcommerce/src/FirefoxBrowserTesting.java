import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximise window view
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        String title2 = driver.getCurrentUrl();
        System.out.println("Current URL: " + title2);

        //get page source
        System.out.println("Page source:  " + driver.getPageSource());

        // Navigate to login page by clicking on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the element of email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //find the element of password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Test123456");



      driver.quit();
    }
}
