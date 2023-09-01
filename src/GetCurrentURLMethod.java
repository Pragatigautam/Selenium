import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		//getCurrentURL () method.
		//it retrived the current url of the web page.
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
