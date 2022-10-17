import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:/ToolsWebDev/chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		/*
		 * options.addArguments("--headless", "--disable-gpu",
		 * "--window-size=1920,1200", "--ignore-certificate-errors",
		 * "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage" );
		 */
		// WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		// int i = 1;
		
		/*
		 * while(i < 5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		
		for(int i=1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		

	}

}
