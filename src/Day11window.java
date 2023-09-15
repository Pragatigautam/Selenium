import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11window {

    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/index.html");

        driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        Iterator<String> iterator = windows.iterator();
        String parentWindow = iterator.next();
        System.out.println(parentWindow);

        String childWindow = iterator.next();
        System.out.println(childWindow);

        // Switch to the child window
        driver.switchTo().window(childWindow);

        WebElement E1 = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
        if (E1.isDisplayed()) {
            System.out.println("Element is displayed in the child window. Test case pass");
        }

        if (driver.getTitle().equals("WebDriver | Contact Us")) {
            System.out.println("Title of the child window is correct. Test case pass");
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);

        // Get the current URL of the parent window
        String parentWindowUrl = driver.getCurrentUrl();
        System.out.println("Parent window URL: " + parentWindowUrl);

        // Close the child window (if needed)
        driver.close();

        // Close the parent window (or perform further actions)
        // driver.quit();
    }
}
