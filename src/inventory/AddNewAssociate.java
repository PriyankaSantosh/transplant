package inventory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddNewAssociate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void AddNewAssociate() throws InterruptedException 
	{
	
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.get("http://dev.bmtplus.com/node/add/associate");
		DateFormat dateformate= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date =new Date();
		String dd = dateformate.format(date);
		System.out.println(dd);
		
		driver.findElement(By.id("edit-title")).sendKeys("testAssociate"+" "+dd);//unique
		driver.findElement(By.id("edit-field-associate-type-und-supplier")).click();
		driver.findElement(By.id("edit-field-associate-contact-person-und-0-value")).sendKeys("Anand");
		driver.findElement(By.id("edit-field-associate-contact-number-und-0-value")).sendKeys("123456789");
		driver.findElement(By.id("edit-field-associate-email-und-0-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("edit-field-associate-relationship-id-und-0-value")).sendKeys("brother");
		driver.findElement(By.id("edit_field_associate_address_und_0_country_chosen")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.id("edit-field-associate-address-und-0-thoroughfare")).sendKeys("mg road");
		driver.findElement(By.id("edit-field-associate-address-und-0-premise")).sendKeys("Mk road");
		driver.findElement(By.id("edit-field-associate-address-und-0-locality")).sendKeys("bangalore");
		driver.findElement(By.id("edit_field_associate_address_und_0_administrative_area_chosen")).click();
		driver.findElement(By.xpath("//li[text()='Karnataka']")).click();
		driver.findElement(By.id("edit-field-associate-address-und-0-postal-code")).sendKeys("548215");
		driver.findElement(By.id("edit-field-associate-details-und-0-value")).sendKeys("products are added");
		driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		
		

		
		
		
		
	}
	
}
