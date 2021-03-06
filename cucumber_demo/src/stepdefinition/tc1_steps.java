package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tc1_steps {
	WebDriver driver;
    WebElement login,email,password;
    
@Given("^open chrome and start the application$")
public void open_chrome_and_start_the_application() throws Throwable 
{
    System.out.println("Started");
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com");
}
@When("^the user enters username password$")
public void the_user_enters_username_password() throws Throwable
{
    login=driver.findElement(By.linkText("Log in"));
    login.click();
    email=driver.findElement(By.name("Email"));
    email.sendKeys("indhumathy@gmail.com");
    password=driver.findElement(By.name("Password"));
    password.sendKeys("indhu.");
    Thread.sleep(5000);
}
@Then("^the user is able to reach the home page$")
public void the_user_is_able_to_reach_the_home_page() throws Throwable 
{
   System.out.println("user is in the home page");
   driver.quit();
}
}
