import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//getPageSource() method
		//it is used to obtain the code of the page source.
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
