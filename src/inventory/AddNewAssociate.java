package inventory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import generic.IAutoConst;

public class AddNewAssociate implements IAutoConst {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void AddNewAssociate() throws InterruptedException, FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException 
	{
	Properties p= new Properties();
	p.load(new FileInputStream("./configs/configuration.properties"));
	driver.get(p.getProperty("url"));
	
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		//driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		
		Workbook w= WorkbookFactory.create(new FileInputStream("Configs/data.xlsx"));
		String username = w.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
		
		Workbook w1= WorkbookFactory.create(new FileInputStream("Configs/data.xlsx"));
		String password = w1.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
	
		driver.findElement(By.id("edit-name")).sendKeys(username);;
		driver.findElement(By.id("edit-pass")).sendKeys(password);;
		
		
		//driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		//driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.get("http://dev.bmtplus.com/node/add/associate");
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
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
