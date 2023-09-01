import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//getTitle() method
		//it retrives the title of the web page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
