import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aeropro {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Seleniumjava/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// dropdown with select tag

		WebElement Aeropro = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Aeropro);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//checkbox handling
		
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();   //* represent short form writing of a attribute name
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount")).isSelected());
		//count the checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// updated dropdown

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // to get text first

		for (int i = 1; i < 5; i++) // to click 5 times
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // to get text after for loop

		// Dynamic dropdowmn

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); //it is 1
		// method for dynamic dropdown
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click(); // it is method2

		// if dynamic dropdown the index 2 is for next box

		// Autosuggestion box

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;

			}
			//calendar 
			//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		}

	}

}
