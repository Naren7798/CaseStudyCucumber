package p2login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1.Drivers;

public class Login {
	 WebDriver driver;
	@Given("I want to write a step with")
	public void i_want_to_write_a_step_with() {
		  driver=Drivers.getDriver("Chrome");
		  driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.xpath("//*[@href='login.htm']")).click();
	}

	@Given("i enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		  driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("I check for the  in step")
	public void i_check_for_the_in_step() {
		  driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Then("I verify the  in step")
	public void i_verify_the_in_step() {
	   
	}

	
}