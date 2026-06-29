# Java_Selenium_Projects
Collection of Core Java, Selenium WebDriver, TestNG, and Automation Testing programs developed for learning, practice, and QA automation projects.
package Sonesta_Internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textboxes {

	public static void main(String[] args) throws Exception{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt =driver.findElement(By.id("login_field"));
		if (usernameTxt.isDisplayed()) {
			if (usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("DanielBright");
				String enteredtxt = usernameTxt.getAttribute("value");
				System.out.println(enteredtxt);

				Thread.sleep(3000);
			} else System.err.println("username textbox is not enabled");
		} else
			System.err.println("username textbox is not displayed");
		WebElement password = driver.findElement(By.id("password"));
		if (password.isDisplayed()) {
			if (password.isEnabled()) {
				password.sendKeys("DanielBright@25");
				String enteredtxt = password.getAttribute("value");
				System.out.println(enteredtxt);
			}System.err.println("password textbox is not enabled");
		}System.err.println("password textbox is not displayed");
	}

}

