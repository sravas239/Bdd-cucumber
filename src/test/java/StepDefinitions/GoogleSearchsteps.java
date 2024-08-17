package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchsteps {
	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is opened");
	}

	@Given("User is on  google Search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
	}

	@When("User enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		System.out.println("user enters a text in search box");

		driver.findElement(By.name("q")).sendKeys("webtracker");

		Thread.sleep(2000);
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println(" user enters a text in search box");

		driver.findElement(By.name("q")).sendKeys("webtracker");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		System.out.println("Inside Step - user is navigated to search results");
	driver.getPageSource().contains("BDD cucumber");
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
		
	}


}
