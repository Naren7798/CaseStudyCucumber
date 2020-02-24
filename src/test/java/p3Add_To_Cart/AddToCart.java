package p3Add_To_Cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1.Drivers;

public class AddToCart {
	WebDriver driver;
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		  driver=Drivers.getDriver("Chrome");
		  driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.xpath("//*[@href='login.htm']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters valid credentials And performs login")
	public void user_enters_valid_credentials_And_performs_login() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("password123");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("clicks the product")
	public void clicks_the_product() {
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("selects product from drop down")
	public void selects_product_from_drop_down() {
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElement(By.linkText("All Categories")).click();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Electronics")).click();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Head Phone")).click();
		 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on add to cart")
	public void clicks_on_find_details() {
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Add to cart")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	
}