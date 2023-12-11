import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home {
	ChromeDriver driver;
@Test 
	public void browserConfig() {
	System.setProperty("WebDriver.chrome.driver", "C:\\Users\\radha\\eclipse-workspace\\Polaris\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
}

@Test 
@Parameters({"url"})
	public void launchBrowser(String s) {
	driver.get(s);
}

@Test

	public void maximizeBroswer() {
	driver.manage().window().maximize();
	System.out.println("window maximized");
}


}
