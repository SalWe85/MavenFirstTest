
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    public static final String SAUCE_DEMO_URL = "https://www.saucedemo.com";
    public static final String INVENTORY_URL = "https://www.saucedemo.com/inventory.html";

    @Test
    public void firstSeleniumTest () {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");



        WebElement usernameField = driver.findElementById("user-name");
        usernameField.sendKeys("standard_user");

        WebElement passField = driver.findElementById("password");
        passField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElementById("login-button");
        loginButton.click();

        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(INVENTORY_URL) : "Error. Expected url: " + INVENTORY_URL +", actual url: " + actualUrl;
    }

}
