package PatientManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckPatientIndashboard {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void CheckPatientIndashboard() throws InterruptedException 
	{
		
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[@href='/patients?=&tid%5B%5D=10']")).click();
		driver.findElement(By.xpath("//a[@href='/add-new-patient-details']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Severe Thalassemia (major or intermedia)']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-status-description-und']")).click();
		driver.findElement(By.xpath("//option[text()='Undergoing BMT']")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("demoPatient");
		//driver.findElement(By.xpath("//input[@id='edit-field-patient-uhid-und-0-value']")).sendKeys("UHID147");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("17 Sep 2010");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		driver.findElement(By.xpath("//li[@id='menu-1060-1']/a")).click();
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_target_id_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit-patients']")).click();
		
		
}
}