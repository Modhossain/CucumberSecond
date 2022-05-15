package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.browse.AllBrowser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTest {
	public static WebDriver dr;

@Given("^I open the browser$")
public void i_open_the_browser() {
	dr=AllBrowser.openbrowser("Chrome");
	dr.get("https://www.osaconsultingtech.com/");
   
}

@And("^I Click on forum button$")
public void i_Click_on_forum_button() {
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
   
}

@And("^I enter the username$")
public void i_enter_the_username() {
dr.findElement(By.id("username")).sendKeys("mhossainchem89@yahoo.com");  
}

@And("I enter the password")
public void i_enter_the_password() {
dr.findElement(By.name("password")).sendKeys("Mhossain@7979");
}
@And("I enter the username {string}")
public void i_enter_the_username(String username) {
    dr.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("username");
}

@And("I enter the password {string}")
public void i_enter_the_password(String password) {
 dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
}

@When("^I click on login button$")
public void i_click_on_login_button() {
dr.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
}


@Then("^I close the browser$")
public void i_close_the_browser() {
	dr.close();

}


}
