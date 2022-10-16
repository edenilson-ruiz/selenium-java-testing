import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/ToolsWebDev/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Sibling - parent traverse
		//header/div/button[1]/following-sibling::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement btnLogin = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
		System.out.println(btnLogin.getText());
		btnLogin.click();
		
		WebElement btnLogin2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]"));
		System.out.println(btnLogin2.getText());
		btnLogin2.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
