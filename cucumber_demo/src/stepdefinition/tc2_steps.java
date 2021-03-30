package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tc2_steps {
	WebDriver driver;
    WebElement register, firstname, lastname;
    @Given("^click on the registration link$")
    public void click_on_the_registration_link() throws Throwable 
    {
        System.out.println("Started");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");    
    }
    @When("^entering the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void entering_the_and(String arg1, String arg2) throws Throwable
    {
        register = driver.findElement(By.linkText("Register"));
        register.click();
        firstname = driver.findElement(By.name("FirstName"));
        firstname.sendKeys(arg1);
        lastname = driver.findElement(By.name("LastName"));
        lastname.sendKeys(arg2);
        Thread.sleep(5000);    
    }
    @Then("^the user is able to register$")
    public void the_user_is_able_to_register() throws Throwable
    {
        System.out.println("User is in the home page");
        driver.quit();
    }
}
