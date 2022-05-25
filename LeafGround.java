package week2.day1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver= new ChromeDriver();
 driver.get("http://leafground.com/pages/Dropdown.html");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 WebElement ele1 =driver.findElement(By.id("dropdown1"));
 Select dd1=new Select(ele1);
 dd1.selectByIndex(3);
// Thread.sleep(2000);
 
 WebElement ele2 =driver.findElement(By.name("dropdown2"));
 Select dd2=new Select(ele2);
 dd2.selectByVisibleText("Appium");
 WebElement ele3 =driver.findElement(By.id("dropdown3"));
 Select dd3=new Select(ele3);
 dd3.selectByValue("3");
 
 List <WebElement> ddn = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
 System.out.println("Total no of options: " + ddn.size());
 
 //Editing Function
 driver.get("http://leafground.com/pages/Edit.html");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.id("email")).sendKeys("kothurvaish@gmail.com");
 
 driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("data");
 
System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
 driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
 boolean flag =driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
 Thread.sleep(5000);
 if (flag==true)
	 System.out.println("Edit field is not disabled");
 else
	 System.out.println("Edit field is disabled");
 
 
 //Button Function
 driver.get("http://leafground.com/pages/Button.html");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.id("home")).click();
 driver.navigate().back();
 System.out.println(driver.findElement(By.id("position")).getLocation());
 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
 System.out.println(driver.findElement(By.id("size")).getSize());
 
 
	}

}
