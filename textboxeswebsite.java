package Sonesta_Internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class textboxeswebsite {

public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement SecondName = driver.findElement(By.id("lastName"));
		FirstName.sendKeys("Daniel");
		String enteredText = FirstName.getAttribute("Value");
		SecondName.sendKeys("Bright");
		String enteredText1 = SecondName.getAttribute("Value");
		 Thread.sleep(3000);
		 FirstName.clear();
		 SecondName.clear();
	}
	
}
