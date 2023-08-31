


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest1 {

 public static void main(String[] args) {
  ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); 

        
        String[] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
          
       
        String password = "secret_sauce";

        for (String username : usernames) {
            
            WebElement usernameField = driver.findElement(By.cssSelector("#user-name")); // Replace with appropriate locator
            WebElement passwordField = driver.findElement(By.cssSelector("#password")); // Replace with appropriate locator
            WebElement loginButton = driver.findElement(By.cssSelector("#login-button")); // Replace with appropriate locator
           usernameField.clear();
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
            
            
            System.out.println("Login attempt made for: " + username);
      
            driver.get("https://www.saucedemo.com/");
        }

        driver.quit();
        }
        
    }