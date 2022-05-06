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

public class GenerateClinicalForGeneralEvaluation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void GenerateClinicalForGeneralEvaluation() throws InterruptedException, FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException 
	{
	
		Properties p =new Properties();
		p.load(new FileInputStream("./configs/configuration.Properties"));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
		Workbook w= WorkbookFactory.create(new FileInputStream("./configs/data.xlsx"));
		String username = w.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
		
		Workbook w1=WorkbookFactory.create(new FileInputStream("./configs/data.xlsx") );
		String password = w1.getSheet("DemoA").getRow(0).getCell(1).getStringCellValue();
	
	//public static void main(String[] args) throws Exception {
	//	WebDriver driver= new ChromeDriver();
		
		
		
		driver.findElement(By.id("edit-name")).sendKeys(username);
		driver.findElement(By.id("edit-pass")).sendKeys(password);
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		
		
		driver.navigate().to("https://dev.bmtplus.com/node/add/patient");
		//driver.get("http://dev.bmtplus.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		/*driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id='menu-1060-1']/a")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();*/
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Brain Tumor']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("demo1315");
		//driver.findElement(By.xpath("//input[@id='edit-field-patient-uhid-und-0-value']")).sendKeys("UHID15252");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("17 Sep 2010");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);



	    WebElement ele213 = driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']"));
	    JavascriptExecutor executor21115 = (JavascriptExecutor)driver;
	    executor21115.executeScript("arguments[0].click();", ele213);    		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		
		driver.findElement(By.xpath("//a[@id=\"quicktabs-tab-patient_summary_pre_bmt-1\"]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"quicktabs-tabpage-patient_summary_pre_bmt-1\"]/div/div/div/a")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-family-history-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Pos'])[1]")).click();
		driver.findElement(By.xpath("//iframe[@id='edit-field-gii-family-history-notes-und-0-value_ifr']")).sendKeys("hi");
		driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-growth-development-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-othr-medical-prblm-und']")).click();
		driver.findElement(By.xpath("//option[@value='Yes']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-allergies-und']")).click();
		driver.findElement(By.xpath("(//option[@value='No'])[2]")).click();
		driver.findElement(By.xpath("//iframe[@id='edit-field-gii-medical-history-notes-und-0-value_ifr']")).sendKeys("na");
		driver.findElement(By.xpath("(//a[@href='#'])[5]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-weight-und-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-height-und-0-value']")).sendKeys("154");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-skin-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[2]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-lymphnodes-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[3]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-ent-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[4]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-heart-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[5]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-lungs-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[6]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-liver-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[7]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-spleen-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[8]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-genitalia-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[9]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-nervous-system-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[10]")).click();
		driver.findElement(By.xpath("//iframe[@id='edit-field-gii-initial-notes-und-0-value_ifr']")).sendKeys("na");
		driver.findElement(By.xpath("(//a[@href='#'])[6]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-wbc-count-und-0-value']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-abs-neutrophil-count-und-0-value']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-abs-lymphocyte-count-und-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-hb-und-0-first']")).sendKeys("6");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-hb-und-0-second']")).click();
		driver.findElement(By.xpath("(//option[@value='mmol/L'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-mean-corpuscolar-vol-und-0-value']")).sendKeys("15");
		driver.findElement(By.xpath("//input[@id='edit-field-clin-course-ferritin-und-0-value']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-platelet-count-und-0-value']")).sendKeys("52");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-creatinine-1-und-0-first']")).sendKeys("45");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-creatinine-1-und-0-second']")).click();
		driver.findElement(By.xpath("(//option[@value='µmol/L'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-tot-bilirubin-und-0-first']")).sendKeys("52");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-tot-bilirubin-und-0-second']")).sendKeys("2");
		driver.findElement(By.xpath("(//option[@value='µmol/L'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-sgpt-alt-und-0-value']")).sendKeys("25");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-tot-serum-protein-und-0-first']")).sendKeys("2");
		
		driver.findElement(By.xpath("//select[@id='edit-field-gii-tot-serum-protein-und-0-second']")).click();
		driver.findElement(By.xpath("((//option[@value=\"g/dL\"])[2])")).click();
		
		
		driver.findElement(By.xpath("//input[@id='edit-field-gii-prothrobin-time-und-0-value']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-thromboplastin-time-und-0-value']")).sendKeys("456");
		driver.findElement(By.xpath("//input[@id='edit-field-gii-fibrinogen-1-und-0-first']")).sendKeys("25");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-fibrinogen-1-und-0-second']")).click();
		driver.findElement(By.xpath("(//option[@value=\"mmol/L\"])[3]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-serum-zinc-1-und-0-first']")).sendKeys("123456");
		driver.findElement(By.xpath("//select[@id='edit-field-gii-serum-zinc-1-und-0-second']")).click();
		driver.findElement(By.xpath("(//option[@value=\"µmol/L\"])[3]")).click();
		driver.findElement(By.xpath("//iframe[@id='edit-field-gii-notes-und-0-value_ifr']")).sendKeys("na");
		driver.findElement(By.xpath("(//a[@href='#'])[7]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-gii-blood-type-und']")).click();
		driver.findElement(By.xpath("//option[text()='A pos']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-gii-rh-phenotype-und-0-value']")).sendKeys("Negative");
		driver.findElement(By.id("edit-field-gii-kell-und-0-value")).sendKeys("15");
		driver.findElement(By.id("edit-field-gii-direct-coombs-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[2]")).click();
		driver.findElement(By.id("edit-field-gii-irregular-antibodies-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[3]")).click();
		driver.findElement(By.id("edit-field-gii-iha-titre-und-0-value")).sendKeys("1");
		driver.findElement(By.id("edit-field-gii-blood-type-notes-und-0-value_ifr")).sendKeys("na");
		driver.findElement(By.xpath("(//a[@href='#'])[8]")).click();
		driver.findElement(By.id("edit-field-gii-chest-x-ray-und")).click();
		driver.findElement(By.xpath("(//option[@value='Normal'])[11]")).click();
		driver.findElement(By.id("edit-field-gii-abdominal-sonogram-und")).click();
		driver.findElement(By.xpath("(//option[@value='Abnormal'])[12]")).click();
		driver.findElement(By.id("edit-field-gii-liver-usg-und-0-value")).sendKeys("14");
		driver.findElement(By.id("edit-field-gii-spleen-usg-und-0-value")).sendKeys("15");
		driver.findElement(By.id("edit-field-gii-imaging-notes-und-0-value_ifr")).sendKeys("nmsnmcnm");
		driver.findElement(By.xpath("(//a[@href='#'])[9]")).click();
		driver.findElement(By.id("edit-field-gii-hepatitis-b-und")).click();
		driver.findElement(By.xpath("(//option[@value='Pos'])[4]")).click();
		driver.findElement(By.id("edit-field-gii-hepatitis-c-und")).click();
		driver.findElement(By.xpath("(//option[@value='Pos'])[5]")).click();
		driver.findElement(By.id("edit-field-gii-cmv-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[6]")).click();
		driver.findElement(By.id("edit-field-gii-hiv-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[7]")).click();
		driver.findElement(By.id("edit-field-gii-tpha-und"));
		driver.findElement(By.xpath("(//option[@value='Neg'])[8]")).click();
		driver.findElement(By.id("edit-field-gii-ppd-und")).click();
		driver.findElement(By.xpath("//option[@value='Negative']")).click();
		driver.findElement(By.id("edit-field-gii-tubercolosis-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[9]")).click();
		driver.findElement(By.id("edit-field-gii-malaria-und")).click();
		driver.findElement(By.xpath("(//option[@value='Neg'])[10]")).click();
		driver.findElement(By.id("edit-field-gii-bcg-und")).click();
		driver.findElement(By.xpath("(//option[@value='Yes'])[3]")).click();
		driver.findElement(By.id("edit-field-gii-dtp-x3-und")).click();
		driver.findElement(By.xpath("(//option[@value='Yes'])[4]")).click();
		driver.findElement(By.id("edit-field-gii-opv-x3-und")).click();
		driver.findElement(By.xpath("(//option[@value='Yes'])[5]")).click();
		driver.findElement(By.id("edit-field-gii-hb-x3-und")).click();
		driver.findElement(By.xpath("(//option[@value='Yes'])[6]")).click();
		driver.findElement(By.id("edit-field-gii-measles-vaccine-und")).click();
		driver.findElement(By.xpath("(//option[@value='No'])[7]")).click();
		driver.findElement(By.id("edit-field-gii-infectious-dis-notes-und-0-value_ifr")).sendKeys("klklkl");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("(//div[@id='block-system-main']/article/div/div/section/div/div/a)[1]")).click();
		driver.findElement(By.xpath("//a[@id='quicktabs-tab-patient_summary_pre_bmt-1']/span[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='quicktabs-tabpage-patient_summary_pre_bmt-1']/div/div[1]/table/tbody/tr/td[7]/div/span/a")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		
		
		
		
		



		

		
	}
}
