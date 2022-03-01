package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_acc_page {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	
	public Create_acc_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
			}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getlogin() {
		return login;
	}

	
	
	
	
	
	
	
	
	
	
	
}
	
	