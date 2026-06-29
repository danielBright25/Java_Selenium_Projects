package Sonesta_Internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonswebsite {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("Daniel");
		driver.findElement(By.id("lastName")).sendKeys("Bright");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichbx = driver.findElement(By.id("hindichbx"));
		hindichbx.click();
		Thread.sleep(3000);
		if (hindichbx.isSelected())hindichbx.click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("daniel.bright07@gmail.com");
		driver.findElement(By.id("password")).sendKeys("DanielBright@25");
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();

	}

}
