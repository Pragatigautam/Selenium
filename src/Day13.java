import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
	
	// Tables 
	// Get the total number of tables 
	// Get the total number of rows 
	// Get the total number of columns
	// Iterate rows and columns and print text of element 
	// Convert it into integer and add
	
	//since we are finding tables directly searching //*[table] in the dom
	List<WebElement> tables= driver.findElements(By.xpath("//*[table]"));
	//Total number of tables
	System.out.println(tables.size());
	
	//Total number of rows
	
	List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
	int totalRows = rows.size();
	System.out.println(totalRows);
	
	List<WebElement> cloumns = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
	int totalColumns = cloumns.size();
	System.out.println(totalColumns);
	
	
	int sum = 0;
	for(int i=2; i<= totalRows; i++) {
	String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
	System.out.println(text);
	sum=sum+ Integer.parseInt(text);

	}
	System.out.println(sum);
	
	//find the person with first name Michael
	
	for(int i=2; i<= totalRows; i++) {
		String firstName = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
		if(firstName.equals("Michael")) {
			System.out.println("Test case passed.");
			break;
		}
	}
	
	
	

	}

}
