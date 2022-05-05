package InitialClinicalManagement;

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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.IAutoConst;

public class DiseaseSpecificSummary implements IAutoConst {
static
{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	System.setProperty(GECKO_KEY,GECKO_VALUE);
}


WebDriver driver=new ChromeDriver();
@Test
public void DiseaseSpecificSummary() throws InterruptedException, FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException 
{
	
	

	//public static void main(String[] args) throws InterruptedException
	//{
	//WebDriver driver=new ChromeDriver();
	
	Properties p =new Properties();
	p.load(new FileInputStream("./configs/configuration.Properties"));
	driver.get(p.getProperty("url"));
	driver.manage().window().maximize();
	
	Workbook w= WorkbookFactory.create(new FileInputStream("./configs/data.xlsx"));
	String username = w.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
	
	Workbook w1=WorkbookFactory.create(new FileInputStream("./configs/data.xlsx") );
	String password = w1.getSheet("DemoA").getRow(0).getCell(1).getStringCellValue();
	
	
	//driver.get("https://dev.bmtplus.com/");
	//driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys(username);
	driver.findElement(By.id("edit-pass")).sendKeys(password);
	driver.findElement(By.id("edit-submit")).click();
	driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
	
	
	driver.navigate().to("https://dev.bmtplus.com/node/add/patient");
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
	driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='Severe Thalassemia (major or intermedia)']")).click();
	driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
    driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
    driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
	DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    //get current date time with Date()
    
    Date date1 = new Date();
    
  String  dd1=dateFormat1.format(date1);
  System.out.println(dd1);
    driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("testPatient"+""+dd1);
    driver.findElement(By.id("edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0")).sendKeys("9 Nov 2001");
    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);



    WebElement ele213 = driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']"));
    JavascriptExecutor executor21115 = (JavascriptExecutor)driver;
    executor21115.executeScript("arguments[0].click();", ele213);    
    
    
    driver.findElement(By.id("edit-submit")).click();
    driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-2']")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//div[@id='quicktabs-tabpage-patient_summary_pre_bmt-2']/div/div[2]/div/a")).click();
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-title-mig-und-0-value']")).sendKeys("testtitle");
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-description-und-0-value']")).sendKeys("na");
    driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-date-und-0-value-datepicker-popup-0']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a")).click();
   driver.findElement(By.xpath("//input[@id='edit-field-dis-summ-diagnosis-age-und-0-value']")).sendKeys("15");
   driver.findElement(By.id("edit-submit")).click();
}
}
