package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CopyofTest {

WebDriver driver;
@Given("^Open Firefox and start application$")
public void Open_Firefox_and_start_application() throws Throwable {
 driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/#identifier");
}

@When("^I enter Valid username and password$")
public void I_enter_Valid_username_and_password() throws Throwable {
    driver.findElement(By.name("Email")).sendKeys("madishettymanibushan@gmail.com");
    driver.findElement(By.id("next")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("html/body/div[1]/div[2]")).sendKeys("Madishetty12");
}

@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {
   driver.findElement(By.xpath(".//*[@id='signIn']")).click();
}
}
