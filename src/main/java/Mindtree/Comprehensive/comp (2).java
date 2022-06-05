package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class comp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","c:\\program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("signUp-phoneNumber")).click();
		driver.findElement(By.id("signUp-phoneNumber")).sendKeys("9837462743");
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-signup-form_password-input")).sendKeys("Sandy123");
		driver.findElement(By.id("signUpSubmit")).click();
	}

		
		

	}


