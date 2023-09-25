import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.makemytrip.com/");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Click on the city input box
        driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Enter "Mumbai" into the input box
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input")).sendKeys("Mumbai");
        
        // Find the list of matching elements
        List<WebElement> dynamicList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
        
        for(int i = 0; i < dynamicList.size(); i++) {
            String text = dynamicList.get(i).getText();
            if(text.contains("Mumbai, India")) {
                dynamicList.get(i).click();
                break;
            }
        }
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        //here is to city
        
        
        
        // Click on the city input box
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchToCity.inactiveWidget > label")).click();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Enter "New Delhi" into the input box
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.searchToCity.inactiveWidget.activeWidget > div:nth-child(2) > div > div > div > input")).sendKeys("Delhi");
        
        // Find the list of matching elements
        List<WebElement> dynamicList2 = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
        
        for(int i = 0; i < dynamicList2.size(); i++) {
            String text = dynamicList2.get(i).getText();
            if(text.contains("New Delhi, India")) {
                dynamicList2.get(i).click();
                break;
            }
        }
        
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        //here are the dates
        
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > div.fsw_inner.returnPersuasion > div:nth-child(4) > label > p.blackText.font20.code.lineHeight36")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw.widgetOpen > div.fsw_inner.returnPersuasion > div.fsw_inputBox.dates.inactiveWidget.activeWidget > div.datePickerContainer > div > div > div > div.DayPicker > div > div.DayPicker-Months > div:nth-child(2) > div.DayPicker-Body > div:nth-child(2) > div:nth-child(6) > div")).click();
        
        
        
        
       
        
        
        driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div > div.fsw > p > a")).click();
        
        // Close the driver
        //driver.quit();
    }
}
