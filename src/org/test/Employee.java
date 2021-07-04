package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Employee {
	
	public static void main(String[] args) {
		
/**System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikka\\eclipse-workspace\\SeleniumFirstProject\\Drivers\\geckodriver.exe");
WebDriver driver1 = new FirefoxDriver();
driver1.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
WebElement txtUserName = driver1.findElement(By.xpath("//input[@id='login-username']"));		
		txtUserName.sendKeys("imti_mohammed");
		
		WebElement checkEl= driver1.findElement(By.xpath("//input[@id='login-signin']"));
	checkEl.click();	
		//driver1.quit();**/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikka\\eclipse-workspace\\SeleniumFirstProject\\Drivers\\chromedriver.exe");
		
WebDriver driver = 	new ChromeDriver();

driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
WebElement txnUserName = driver.findElement(By.xpath("//input[@type='text']"));
txnUserName.sendKeys("imti_mohammmed@yahoo.com");
WebElement txnPassword = driver.findElement(By.xpath("//input[@id='pass']"));
txnPassword.sendKeys("Nikkath123");
//WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
//btnLogin.click();
String txtUn = txnUserName.getAttribute("value");
System.out.println(txtUn);
String txtPn = txnPassword.getAttribute("value");
System.out.println(txtPn);
//driver.findElement(By.xpath(""))
WebElement getTextValue = driver.findElement(By.xpath("//a[text()='Create a Page']"));
String txt= getTextValue.getText();
System.out.println(txt);


String url = driver.getCurrentUrl(); 

System.out.println(url);
//driver.quit();**/
		


	}


}
