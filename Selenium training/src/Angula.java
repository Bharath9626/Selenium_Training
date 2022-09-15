import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Angula {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Seleniumjava/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Wade");
		driver.findElement(By.name("email")).sendKeys("brockyma@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hohohoho");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select jaja = new Select(dropdown);
		jaja.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("18-06-1876");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
