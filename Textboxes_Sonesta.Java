package Sonesta_Internship;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextboxesSonesta {
	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sonesta.com/");
		driver.findElement(By.id("login-user-name")).click();
		WebElement Email = driver.findElement(By.id("email"));
        WebElement Password = driver.findElement(By.id("password"));
        Email.sendKeys("Daniel.bright07@gmail.com");
        String enteredText = Email.getAttribute("value");
        System.out.println(enteredText);
        Password.sendKeys("DanielBright@25");
        String enteredText1 = Password.getAttribute("value");
        System.out.println(enteredText1);
        Thread.sleep(3000);
        Email.clear();
        Password.clear();
        
	}

}
