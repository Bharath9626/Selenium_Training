
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Proj11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/Seleniumjava/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	    driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]/input")).click();

		String select = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();

		WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));

		Select s = new Select(dropDown);

		s.selectByVisibleText(select);

		driver.findElement(By.name("enter-name")).sendKeys(select);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(select))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}

	// System.out.println(
	// driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

}