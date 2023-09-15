package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class radio {

    public static void main(String[] args) {
       

        ChromeDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait

        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        // Find all radio buttons with type="radio"
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='color']"));

        
        for (WebElement radioButton : radioButtons) {
            radioButton.click();
           
            boolean isSelected = radioButton.isSelected();
            System.out.println(isSelected);
        }

        
    }
}
