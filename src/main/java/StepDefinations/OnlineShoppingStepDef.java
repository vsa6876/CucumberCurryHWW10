package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineShoppingStepDef {
    static WebDriver driver;

@Given("user is on main page")
        public void user_is_on_login_page() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.currys.co.uk/");
    Thread.sleep(3000);
}
@When("user click on Accept all cookies")
public void user_click_on_Accept_all_cookies()throws InterruptedException{
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    Thread.sleep(5000);
}
    @When("user click on Appliances")
    public void user_click_on_appliances()throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//body/div[contains(@class,'page')]/div[contains(@class,'currys-mobile-app')]/header[@class='section-header desktop-menu-view']/section[@class='header-main']/div[@class='container mobile-header p-0 header-containerwidth']/div[@class='row m-0 mobile-header-icons']/div[@class='col-xl-11 col-lg-11 p-0 search-monile lg-pos-static']/div[@class='row menu-navigation main-menu navbar-toggleable-sm menu-toggleable-left multilevel-dropdown d-none d-md-flex bg-white']/div[@class='col-xl-9 col-lg-9 hidden-sm-down lg-pos-static menu-single-line']/nav[@aria-label='global']/div[@class='menu-group']/ul[@class='nav navbar-nav']/li[1]")).click();
    Thread.sleep(2000);}

@And("user click on Laundry")
    public void user_click_on_Laundry(){
    driver.findElement(By.xpath("//a[@href='https://www.currys.co.uk/appliances/laundry']//div[@class='heading title-color-picker']")).click();
}
@And("user click on Washing Machine")
    public void user_click_on_WashingMachine(){
    driver.findElement(By.xpath("//a[@href='https://www.currys.co.uk/appliances/laundry/washing-machines']//div[@class='heading title-color-picker']")).click();
}

    @And("user click on selected SAMSUNG Series 5 ecobubble WW90TA046AE/EU 9 kg 1400 Spin Washing Machine - White")
    public void user_Click_On_Selected_SAMSUNG_Series_5_ecobubble_WW90TA046AE_EU_9Kg_1400_Spin_Washing_Machine_White() {
    driver.findElement(By.xpath("//div[@id='hash-10213785']//div[contains(@class,'row m-0 row-alignement')]//h2[contains(@class,'pdp-grid-product-name')]")).click();
    }
@And("user click on Add to basket button")
    public void user_click_on_Add_to_basket_button(){
    driver.findElement(By.xpath("//div[contains(@class,'addToCartActionButton')]//button[contains(@class,'btn cta-primary-left-icon-btn btn-styles w-100')]")).click();
}
@And("user click on Continue without Care & Repair")
    public void user_click_on_Continue_without_Care_and_Repair(){
    driver.findElement(By.cssSelector(".col-12.col-sm-6.care-service-close")).click();

    }
  @And("user click on Go to basket button")
    public void user_click_on_Go_to_basket_button(){
    driver.findElement(By.xpath("//a[@title='Go to basket']")).click();

  }
  @And("user click on Checkout button")
    public void user_click_on_Checkout_button(){
    driver.findElement(By.xpath("//a[@class='d-sm-none d-md-block custom-btn-primary curry-sansreg-font btn btn-primary btn-block checkout-btn checkout-modal-login']")).click();
  }

}
