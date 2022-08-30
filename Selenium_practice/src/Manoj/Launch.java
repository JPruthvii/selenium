package Manoj;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Launch 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement linkreg=driver.findElement(By.className("ico-register"));
	Thread.sleep(2000);
	linkreg.click();
	WebElement malerb=driver.findElement(By.id("gender-male"));
	malerb.click();
	WebElement firstname=driver.findElement(By.id("FirstName"));
	firstname.click();
	firstname.sendKeys("manoj");
	WebElement lastname=driver.findElement(By.id("LastName"));
	lastname.click();
	lastname.sendKeys("JP");
	WebElement email=driver.findElement(By.id("Email"));
	email.click();
	email.sendKeys("jpmanoj1@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	password.click();
	password.sendKeys("jiji271098");
	WebElement confirmpass=driver.findElement(By.id("ConfirmPassword"));
	confirmpass.click();
	confirmpass.sendKeys("jiji271098");
	WebElement register=driver.findElement(By.id("register-button"));
	register.click();
	driver.close();
	
	}
}
