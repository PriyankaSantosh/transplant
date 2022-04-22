package PatientManagement;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PatientReg
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void PatientReg() throws InterruptedException 
	{
	
	
	
	//public static void main(String[] args) throws Exception {
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//*[@id='menu-1060-1']/a")).click();
		driver.navigate().to("https://dev.bmtplus.com/node/add/patient");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='edit_field_patient_disease_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Severe Thalassemia (major or intermedia)']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-status-description-und']")).click();
		driver.findElement(By.xpath("//option[@value='10']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-hla-status-und']")).click();
		driver.findElement(By.xpath("//option[@value='HLA typing justified']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-hla-conf-status-und']")).click();
		driver.findElement(By.xpath("//option[@value='Required']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-consanguinity-und']")).click();
		driver.findElement(By.xpath("(//option[@value='Yes'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-risk-factor-und']")).click();
		driver.findElement(By.xpath("//option[text()='Not Set']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-referral-und']")).click();
		/*driver.findElement(By.xpath("//option[text()='Partner Institution Referral']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("hfjshh");*/
		driver.findElement(By.xpath("//*[@id=\"edit-field-patient-free-tagging-und-0-value\"]")).sendKeys("gsfhHDj");
		driver.findElement(By.xpath("//div[@id='edit_field_patient_standard_tags_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='2nd BMT from different PMRD after PMRD rejection']")).click();
		driver.findElement(By.xpath("//div[@id='edit_field_patient_study_category_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Alpha Beta Depletion Candidate']")).click();
		//driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-rejection-und-0-value-datepicker-popup-0']")).sendKeys("24 Mar 2019");
      //  driver.findElement(By.xpath("//div[@id='edit_field_patient_disable_alerts_und_chosen']")).click();
       // driver.findElement(By.xpath("//li[text()='Chimerism']")).click();
        driver.findElement(By.xpath("//input[@id='edit-field-patient-proposed-tx-date-und-0-value-datepicker-popup-0']")).sendKeys("10-Apr-2019");
        driver.findElement(By.xpath("//input[@id='edit-field-patient-scheduling-remark-und-0-value']")).sendKeys("na");
        driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
        driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
        driver.findElement(By.xpath("(//a[@href='#undefined'])[2]")).click();
        driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("test1530");//unique
       // driver.findElement(By.id("edit-field-patient-uhid-und-0-value")).sendKeys("9991");//unique
        driver.findElement(By.xpath("//input[@id='edit-field-patient-reference-id-und-0-value']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@id='edit-field-patient-uuid-und-0-value']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@id='edit-field-patient-date-of-birth-und-0-value-datepicker-popup-0']")).sendKeys("25 Feb 1997");
       // driver.findElement(By.xpath("//input[@id='edit-field-patient-registration-date-und-0-value-datepicker-popup-0']")).sendKeys("23 Mar 2019");
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        
        
        
        WebElement ele213 = driver.findElement(By.xpath("//input[@id='edit-field-patient-gender-und-male']"));
		JavascriptExecutor executor21115 = (JavascriptExecutor)driver;
		executor21115.executeScript("arguments[0].click();", ele213);

        
        
        //driver.findElement(By.xpath("//select[@id='edit-field-patient-religion-und']")).click();
        //driver.findElement(By.xpath("//option[@value='Buddhism']")).click();
      //driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_country_chosen']")).click();
    // driver.findElement(By.xpath("//li[text()='India']")).click();
       
        

        
      //  WebDriverWait wait1 = new WebDriverWait(driver, 5000);

    // WebElement q = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@data-option-array-index='102'])[2]")));
   //  q.click();


   //driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-thoroughfare']")).sendKeys("uma hotel");
     //driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-premise']")).sendKeys("station road");
     //driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-locality']")).sendKeys("bangalore");
     //driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_administrative_area_chosen']")).click();
    // driver.findElement(By.xpath("//li[text()='Karnataka']")).click();
    // driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-postal-code']")).sendKeys("584101");
     driver.findElement(By.xpath("//input[@id='edit-field-patient-phone-und-0-value']")).sendKeys("9874561232");
     driver.findElement(By.xpath("//input[@id='edit-field-patient-email-und-0-email']")).sendKeys("pas@gmail.com");
     driver.findElement(By.xpath("//select[@id='edit-field-patient-reg-complete-und']")).click();
     driver.findElement(By.xpath("(//option[@value='Yes'])[2]")).click();
     driver.findElement(By.xpath("//input[@id='edit-field-patient-healthy-sibbling-und-yes']")).click();
     driver.findElement(By.xpath("//input[@id='edit-field-patient-number-of-siblings-und-0-value']")).sendKeys("2");
     /*File f= new File("File/Hla.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("edit-field-patient-photo-und-0-upload")).sendKeys(path);
		Thread.sleep(3000);
		driver.findElement(By.id("edit-field-document-file-und-0-upload-button")).click();*/

       driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();
     driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
     driver.findElement(By.xpath("(//a[@href='#undefined'])[3]")).click();
    driver.findElement(By.xpath("//input[@id='edit-field-patient-next-follow-with-und-0-target-id']")).sendKeys("Aditi (12666)");
    driver.findElement(By.xpath("//input[@id='edit-field-patient-transplant-centre-und-0-target-id']")).sendKeys("Al-Zahra Teaching Hospital, Najaf-Iraq (IQA) (61747)");
     driver.findElement(By.xpath("//input[@id='edit-field-patient-primary-physician-und-0-uid']")).sendKeys("abrashi");
    // driver.findElement(By.xpath("//input[@id='edit-field-patient-primary-nurse-und-0-uid']")).sendKeys("abida");
     driver.findElement(By.xpath("//div[@id='edit_field_patient_shadow_physician_und_chosen']")).click();
     driver.findElement(By.xpath("//li[text()='abrashi']")).click();
     driver.findElement(By.xpath("//div[@id='edit_field_patient_shadow_nurse_und_chosen']")).click();
     driver.findElement(By.xpath("//li[text()='Akhila']")).click();
     driver.findElement(By.xpath("//input[@id='edit-field-patient-intial-consultant-und-0-uid']")).sendKeys("ampomah");
     driver.findElement(By.xpath("//input[@id='edit-field-patient-referred-to-und-0-uid']")).sendKeys("Aditi");
     driver.findElement(By.xpath("(//a[@href='#undefined'])[4]")).click();
     driver.findElement(By.xpath("//select[@id='edit-field-patient-ethnicity-und']")).click();
     driver.findElement(By.xpath("//option[@value='hispanic or latino']")).click();
     driver.findElement(By.xpath("//select[@id='edit-field-patient-race-und']")).click();
     driver.findElement(By.xpath("//option[@value='asian']")).click();
    driver.findElement(By.xpath("//div[@id='edit_field_patient_race_detail_und_chosen']")).click();
    driver.findElement(By.xpath("//li[text()='middle eastern']")).click();
    driver.findElement(By.xpath("//select[@id='edit-field-list-yes-no-und']")).click();
    driver.findElement(By.xpath("(//option[@value='yes'])[1]")).click();
    
    driver.findElement(By.xpath("//select[@id='edit-field-list-yes-no-und']")).click();
    driver.findElement(By.xpath("(//option[@value='no'])[2]")).click();
    driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
   
	}

}
