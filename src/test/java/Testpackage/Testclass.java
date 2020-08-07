package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	
public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@Test
	public void acionclass() {
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
	
		WebElement drago=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropo=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		WebElement dropodrop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(drago, dropo).perform();
		act.dragAndDropBy(drago, 50, 50).perform();
	}

	@AfterSuite
	public void closure() {
		driver.quit();
	}


}
