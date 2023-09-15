package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AssignmentClasswork2 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        // Find all radio buttons with type="radio"
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        // Iterate through each radio button and select it
        for (WebElement radioButton : radioButtons) {
            radioButton.click();
        }

        for (WebElement radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                // Get the text associated with the selected radio button
                String radioButtonText = radioButton.getAttribute("value");
                System.out.println(radioButtonText);
            }
        }
    }
}
