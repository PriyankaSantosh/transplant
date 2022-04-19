package PatientManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckPatient {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
		WebDriver driver=new ChromeDriver();
		@Test
		public void CheckPatient() throws InterruptedException 
		{
		
		//public static void main(String[] args) throws Exception {
			//WebDriver driver= new ChromeDriver();
			driver.get("http://dev.bmtplus.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
			driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath("//*[@id='menu-1060-1']/a")).click();
			driver.findElement(By.xpath("//input[@id='edit-field-patient-name-value']")).sendKeys("hen");;
			driver.findElement(By.xpath("//div[@id='edit_tid_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='Undergoing BMT']")).click();
			driver.findElement(By.xpath("//div[@id='edit_og_group_ref_target_id_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
			driver.findElement(By.xpath("//select[@id='edit-items-per-page']")).click();
			driver.findElement(By.xpath("(//option[@value='10'])[2]")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		

}
