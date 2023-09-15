package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AssignmentClasswork {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        // Find all checkboxes with type="checkbox"
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        // Iterate through each checkbox and check it
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
                //Assertion
                //String checkboxText = checkbox.getAttribute("value");
                //System.out.println(checkboxText);
                //System.out.println(checkbox.isSelected());            
            }
            else {
            	checkbox.isSelected();
            }
            
            System.out.println(checkbox.isSelected()); 
        }
        
        
        for (WebElement checkbox : checkboxes) {
            
                checkbox.click();
                //Assertion
                System.out.println(checkbox.isSelected()); 
               
            
        }
        
        

      
   
        
    }
}
