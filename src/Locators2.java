import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "ranul";
		
		// Chrome Driver
		// System.setProperty("webdriver.chrome.driver", "C:/ToolsWebDev/chromedriver/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		// Firefox Driver
		// System.setProperty("webdriver.gecko.driver", "C:/ToolsWebDev/geckodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		// Edge Driver
		System.setProperty("webdriver.edge.driver", "C:/ToolsWebDev/msedgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String tmpText = driver.findElement(By.cssSelector("form p")).getText();
		String tempPassword = "";
		Pattern p = Pattern.compile("\'([^\']*)\'"); // single quotes
		Matcher m = p.matcher(tmpText);
		Thread.sleep(1000);
		if (m.find()) {
			  // System.out.println(m.group(1));
			tempPassword = m.group(1);
		}
		
		return tempPassword;
	}
}
