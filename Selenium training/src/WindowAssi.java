import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssi {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/Seleniumjava/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String wione = it.next();

		String witwo = it.next();

		driver.switchTo().window(witwo);

		String name1 = driver.findElement(By.cssSelector("div[class='example']")).getText();

		System.out.println(name1);

		driver.switchTo().window(wione);

		String name2 = driver.findElement(By.xpath("//h3")).getText();

		System.out.println(name2);

	}
}
