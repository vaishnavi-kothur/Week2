package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver= new ChromeDriver();
 driver.get("http://leaftaps.com/opentaps/control/main");
 driver.manage().window().maximize();
 WebElement eleUser = driver.findElement(By.id("username"));
 eleUser.sendKeys("DemoSalesManager");
 
 driver.findElement(By.id("password")).sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Create Lead")).click();
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test123");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kothur");
 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vaishnavi");
 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kothur");
 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kothurvaish@gmail.com");
 WebElement ele =driver.findElement(By.name("generalStateProvinceGeoId"));
 Select dd=new Select(ele);
 dd.selectByVisibleText("New York");
 driver.findElement(By.className("smallSubmit")).click();
 System.out.println(driver.getTitle());
 driver.close();
 
 
	}

}
