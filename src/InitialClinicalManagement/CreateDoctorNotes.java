package InitialClinicalManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.IAutoConst;

public class CreateDoctorNotes implements IAutoConst {
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void CreateDoctorNotes() throws InterruptedException, FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException 
	{
	
	
	
	//public static void main(String[] args) throws InterruptedException {
		//WebDriver driver= new ChromeDriver();
		
		Properties p =new Properties();
		p.load(new FileInputStream("./configs/configuration.Properties"));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
		Workbook w= WorkbookFactory.create(new FileInputStream("./configs/data.xlsx"));
		String username = w.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
		
		Workbook w1=WorkbookFactory.create(new FileInputStream("./configs/data.xlsx") );
		String password = w1.getSheet("DemoA").getRow(0).getCell(1).getStringCellValue();
		
		
		//driver.get("https://dev.bmtplus.com");
		//driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys(username);
		driver.findElement(By.id("edit-pass")).sendKeys(password);
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		

		driver.navigate().to("https://dev.bmtplus.com/node/add/patient");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Brain Tumor']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("Demo1326");
		//driver.findElement(By.xpath("//input[@id='edit-field-patient-uhid-und-0-value']")).sendKeys("test1478");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("17 Sep 2010");
		
driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);



WebElement ele213 = driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']"));
JavascriptExecutor executor21115 = (JavascriptExecutor)driver;
executor21115.executeScript("arguments[0].click();", ele213);
        
        
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		driver.findElement(By.xpath("//div[@id=\"block-jagriti-custom-jc-display-clinical-course-tab\"]/div/div/div/div/div/a")).click();
	    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-title-mig-und-0-value']")).sendKeys("test1238");
	    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-description-und-0-value']")).sendKeys("na");
	    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-weight-und-0-value']")).sendKeys("45");
	    driver.findElement(By.xpath("//input[@id='edit-field-clin-course-height-und-0-value']")).sendKeys("145");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/div/div/div/div/section/div[2]/div/div/div/div[1]/div/div[3]/div[1]/ul/li/a")).click();

		//driver.findElement(By.xpath("//div[@id='block-system-main']/div/div[3]/div[2]/ul/li/a")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-cc-doctor-notes-summary-und-0-value']")).sendKeys("na");
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("na");
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
}
}