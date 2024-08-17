package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	WebDriver driver;

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("I open orange hrm page")
	public void i_open_zomato_home_page() {
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	}

	@Then("I verify that username and password")
	public void i_verify_that_username_and_password() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	    driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//b[text()='Admin']")).click();
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("searchSystemUser_userName")).sendKeys("sravani.guduru");
	driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("sravani");
	driver.findElement(By.name("btnAdd")).click();
	driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Dastagiri Rohit");
	driver.findElement(By.id("systemUser_userName")).sendKeys("Sravas");
	driver.findElement(By.id("systemUser_password")).sendKeys("Qedgetech123!@#");
	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Qedgetech123!@#");
	driver.findElement(By.id("btnSave")).submit();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
}
