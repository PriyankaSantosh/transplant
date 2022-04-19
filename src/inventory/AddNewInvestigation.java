package inventory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddNewInvestigation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void AddNewInvestigation() throws InterruptedException 
	{
	
	

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver= new ChromeDriver();
		driver.get("http://dev.bmtplus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");;
		driver.findElement(By.id("edit-submit")).click();
		driver.get("http://dev.bmtplus.com/node/add/associate");
		DateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		String dd = dateformat.format(date);
		System.out.println(dd);
		
		driver.findElement(By.id("edit-title")).sendKeys("test1201"+" "+dd);//unique
		driver.findElement(By.id("edit-field-associate-type-und-supplier")).click();
		driver.findElement(By.id("edit_og_group_ref_und_chosen")).click();

		driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		driver.get("http://dev.bmtplus.com/node/add/chargebles");
		driver.findElement(By.id("edit_field_chargebles_associate_und_chosen")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1201"+" "+dd);//associate name 
		
		driver.findElement(By.xpath("//div[@id='edit_field_chargebles_associate_und_chosen']/div/ul/li")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-chargebles-investigation-und-hierarchical-select-selects-0']")).click();
		driver.findElement(By.xpath("//option[text()='Investigation']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='edit-field-chargebles-investigation-und-hierarchical-select-selects-1']")).click();
		driver.findElement(By.xpath("//option[@value='92']")).click();
			
		driver.findElement(By.id("edit-field-chargebles-cost-und-0-value")).sendKeys("5000");
		driver.findElement(By.id("edit-field-currency-und")).click();
		driver.findElement(By.xpath("//option[@value='INR']")).click();
		driver.findElement(By.id("edit-field-investigation-lab-id-und-0-value")).sendKeys("123");
		driver.findElement(By.id("edit-field-chargebles-instructions-und-0-value_ifr")).sendKeys("know");
		driver.findElement(By.id("edit-field-chargeables-tat-und-0-value")).sendKeys("12");
		driver.findElement(By.id("edit_field_chargables_bmt_status_und_chosen")).click();
		driver.findElement(By.xpath("//li[text()='Undergoing BMT']")).click();
		driver.findElement(By.id("edit-field-label-instructions-und-0-value_ifr")).sendKeys("hhhhh");
		driver.findElement(By.xpath("//div[@id='edit_og_group_ref_und_chosen']")).click();
        driver.findElement(By.xpath("//li[text()='Test Centre (TSA)']")).click();
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        
        

        
        
		
	}

}
