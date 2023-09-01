package one;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class findelementsrough {

    public static void main(String[] args) {
        // Set the system property for ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://www.saucedemo.com/");

        // Locate and fill in the login fields
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        try {
            // Add a brief pause to let the page load completely (or use explicit wait)
            Thread.sleep(2000);

            // Find a list of buttons using xpath
            List<WebElement> buttons = driver.findElements(By.xpath("//button"));

            // Print the list of buttons
            System.out.println("Number of buttons: " + buttons.size());

            // Iterate through the list of buttons and print their text
            for (WebElement button : buttons) {
                System.out.println("Button Text: " + button.getText());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
