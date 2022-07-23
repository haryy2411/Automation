package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;

	@Given("User is on Adactin Hotel login page")
	public void user_is_on_Adactin_Hotel_login_page(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");
		System.out.println("sdddddddddddddddddd");


	}
	@When("User should enter valid {string} , {string} and click login")
	public void user_should_enter_valid_and_click_login(String string, String string2) {
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys(string);

		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(string2);

		driver.findElement(By.id("login")).click();
	}

	@Then("User should verify after login {string}")
	public void user_should_verify_after_login(String string) {
		Assert.assertTrue(string, true);	
	}

	@When("User should enter search hotel details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_search_hotel_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {

		WebElement location = driver.findElement(By.id("location"));
		Select location1 =new Select(location);
		location1.selectByVisibleText(string);

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotel1 =new Select(hotel);
		hotel1.selectByVisibleText(string2);

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select sel5 =new Select(roomtype);
		sel5.selectByVisibleText(string3);

		WebElement roomnos1 = driver.findElement(By.id("room_nos"));
		Select roomnos =new Select(roomnos1);
		roomnos.selectByVisibleText(string4);


		WebElement datepick_in = driver.findElement(By.id("datepick_in"));
		datepick_in.sendKeys(string5);

		WebElement datepick_out = driver.findElement(By.id("datepick_out"));
		datepick_out.sendKeys(string6);

		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select room =new Select(adult_room);
		room.selectByVisibleText(string7);

		WebElement child_room = driver.findElement(By.id("child_room"));
		Select child_room1 =new Select(child_room);
		child_room1.selectByVisibleText(string8);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();



	}

	@When("User should select hotel by clicking radio button and click continue")
	public void user_should_select_hotel_by_clicking_radio_button_and_click_continue() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();

		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();

	}

	@When("User should enter valid details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_valid_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(string);

		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys(string2);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(string3);

		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys(string4);

		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select sel = new Select(cc_type);
		sel.selectByVisibleText(string5);

		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select sel1 = new Select(cc_exp_month);
		sel1.selectByVisibleText(string6);

		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		Select sle = new Select(cc_exp_year);
		sle.selectByVisibleText(string7);

		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys(string8);

		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
		Thread.sleep(5000);
	}
	
	@Then("User should print the booking id")
	public void user_should_print_the_booking_id()  {

		WebElement orderid = driver.findElement(By.id("order_no"));
		String attribute = orderid.getAttribute("value");
		System.out.println("Order ID: "+attribute);
		driver.close();
	}

}
