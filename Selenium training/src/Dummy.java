import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Seleniumjava/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
	}

}
