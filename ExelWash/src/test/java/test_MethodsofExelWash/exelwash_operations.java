package test_MethodsofExelWash;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages_of_exelwash.homepage;
import pages_of_exelwash.login_page;
import pages_of_exelwash.services;
import pages_of_exelwash.sign_up_page;

public class exelwash_operations {

	WebDriver driver;
	sign_up_page Sign_Up_Page;
	login_page Login_Page;
	services Services;
	homepage Home_Page;



	@Test(priority = 0)
	public void enter_user_SignUp_Details() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		// driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		// Thread.sleep(2000);

		Sign_Up_Page = new sign_up_page(driver);
		Sign_Up_Page.clickOnMenu();
		Sign_Up_Page.clickOnSignUpOption();
		Sign_Up_Page.enterEmail("Test");
		Sign_Up_Page.enterPasswrod("123");
		Sign_Up_Page.enterconfirmPasswrod("123");
		// Sign_Up_Page.clickOnSignUpButton();
		Sign_Up_Page.enterconfirmPasswrod2();
		driver.close();

	}

	@Test(priority = 2)
	public void enter_user_Login_Details() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		// driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		// Thread.sleep(2000);

		Login_Page = new login_page(driver);
		Login_Page.clickOnMenu();
		Login_Page.clickOnLoginOption();
		Login_Page.enterEmail("Test");
		Login_Page.enterPasswrod("123");
		Login_Page.clickOnLoginButton();
		driver.close();
	}

	@Test(priority = 3)
	public void click_On_Services() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		// driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		// Thread.sleep(2000);

		Services = new services(driver);
		Services.clickOnMenuOption();
		Services.clickOnServicesOption();
		Services.clickOnWashingIcon();
		Services.clickOnWASHandfoldButton();
		Services.clickOnDryCleaningButton();
		Services.click_On_Shoe_Laundry_Button();
		Services.click_On_Saree_Rolling_Button();
		Services.click_On_Stain_Removal_Button();
		Services.click_On_Steam_Ironing_Button();
		Services.click_On_Carpet_and_Curtains_Cleaning_Button();
		Services.click_On_Soft_Toys_Cleaning_Button();
		driver.close();
	}

	@Test(priority = 4)
	public void chacking_Home_Page_Functionality() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://exelwash.com");

		// driver.findElement(By.xpath("//a[normalize-space()='Menu']")).click();
		// Thread.sleep(2000);

		Home_Page = new homepage(driver);
		Home_Page.clickOnMenuOption();
		Home_Page.clickOnHomeOption();
		Home_Page.clickOnExelWashIcon();
		driver.close();
	}
}