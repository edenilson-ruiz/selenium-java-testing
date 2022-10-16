import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome -> ChromeDriver -> Methods
		
		System.setProperty("webdriver.chrome.driver", "C:/ToolsWebDev/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.id("inputPassword")).sendKeys("hello123");

	}
}
