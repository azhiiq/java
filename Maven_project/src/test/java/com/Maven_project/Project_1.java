package com.Maven_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.Create_acc_page;
import com.pomclass.Create_confirmpage;
import com.pomclass.Create_hotel_typ;

public class Project_1 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		browserLaunch("chrome");
		
		//implicitwait();
		
		geturl("https://adactinhotelapp.com/index.php");
		
		Create_acc_page cp = new Create_acc_page(driver);
	     
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://adactinhotelapp.com/index.php");
		
		//driver.manage().window().maximize();
		
		//WebElement UN = driver.findElement(By.id("username"));
		//UN.sendKeys("Ashiqashi");
		sendKeysmethod(cp.getUsername(), "Ashiqashi");
		
		//WebElement Pass = driver.findElement(By.name("password"));
		//Pass.sendKeys("ashiqteena");
		sendKeysmethod(cp.getPassword(), "ashiqteena");
		
		//WebElement Login = driver.findElement(By.id("login"));
		//Login.click();
		clickmethod(cp.getlogin());
		
		//-----------------------------------------
		
		
		Create_hotel_typ ch = new Create_hotel_typ(driver);
		
		//implicitwait();
		
		
		
		//WebElement location = driver.findElement(By.id("location"));
		//Select s1 = new Select(location);
		//s1.selectByValue("Paris");
		singleDropDown_value(ch.getLocation(), "Paris");
		
		//WebElement hotels = driver.findElement(By.name("hotels"));
		//Select s2 =new Select(hotels);
		//s2.selectByValue("Hotel Sunshine");
		singleDropDown_value(ch.getHotels(), "Hotel Sunshine");
		
		//WebElement room = driver.findElement(By.id("room_type"));
		//Select s3 = new Select(room);
		//s3.selectByValue("Super Deluxe");
		singleDropDown_value(ch.getRoom_type(), "Super Deluxe");
		
		//WebElement Norm = driver.findElement(By.id("room_nos"));
		//Select s4 = new Select(Norm);
		//s4.selectByValue("1");
		singleDropDown_value(ch.getRoom_nos(), "1");
		
		//WebElement date = driver.findElement(By.id("datepick_in"));
		//date.sendKeys("05/05/2022");
		sendKeysmethod(ch.getDatepick_in(), "05/05/2022");
		
		//WebElement chckout = driver.findElement(By.id("datepick_out"));
		//chckout.sendKeys("10/202/052");
		sendKeysmethod(ch.getDatepick_out(), "10/202/052");
		
		//WebElement adult = driver.findElement(By.id("adult_room"));
		//Select s5 = new Select(adult);
		//s5.selectByValue("2");
		singleDropDown_value(ch.getAdult_room(), "2");
		
		
		
		//WebElement child = driver.findElement(By.id("child_room"));
		//Select s6 = new Select(child);
		//s6.selectByValue("1");
		singleDropDown_value(ch.getChild_room(), "1");
		
		
		//WebElement Sub = driver.findElement(By.id("Submit"));
		//Sub.click();
		clickmethod(ch.getSubmit());
		
		
		
		//WebElement Radiobtn = driver.findElement(By.id("radiobutton_0"));
		//Radiobtn.click();
		clickmethod(ch.getRadiobutton_0());
		
		//Thread.sleep(3000);
		
		//--------------------------------------------------------------
		
		Create_confirmpage cop =new Create_confirmpage(driver);
		
		//implicitwait();
		
		
		
		//WebElement Conti = driver.findElement(By.xpath("//input[@type='submit']"));
		//Conti.click();
		
		clickmethod(cop.getSubmit());
		
		
		
		
		//WebElement FN = driver.findElement(By.xpath("//input[@name='first_name']"));
		//FN.sendKeys("Mohammed Ashiq");
		sendKeysmethod(cop.getFirst_name(), "Mohammed Ashiq");
		
		//WebElement LN = driver.findElement(By.id("last_name"));
		//LN.sendKeys("Teena");
		sendKeysmethod(cop.getLast_name(),"Teena");
		
		//WebElement add = driver.findElement(By.id("address"));
		//add.sendKeys("kovaipudur");
		sendKeysmethod(cop.getAddress(), "kovaipudur");
		
		//WebElement cc = driver.findElement(By.id("cc_num"));
		//cc.sendKeys("1234567890987654");
		sendKeysmethod(cop.getCc_num(), "1234567890987654");
		
		//WebElement ccno = driver.findElement(By.id("cc_type"));
		//Select s7 = new Select(ccno);
		//s7.selectByValue("AMEX");
		singleDropDown_value(cop.getCc_type(), "AMEX");
		
		//WebElement exp = driver.findElement(By.id("cc_exp_month"));
		//Select s8 =  new Select(exp);
		//s8.selectByValue("4");
		singleDropDown_value(cop.getCc_exp_month(), "4");
		
		//WebElement expd = driver.findElement(By.id("cc_exp_year"));
		//Select s9 = new Select(expd);
		//s9.selectByValue("2022");
		singleDropDown_value(cop.getCc_exp_year(), "2022");
		
		//WebElement ccv = driver.findElement(By.id("cc_cvv"));
		//ccv.sendKeys("221");
		sendKeysmethod(cop.getCc_cvv(), "221");
		
		//Thread.sleep(3000);
		
		//WebElement BOKNW = driver.findElement(By.id("book_now"));
		//BOKNW.click();
		clickmethod(cop.getBook_now());
		
		//WebElement iti = driver.findElement(By.id("my_itinerary"));
		//iti.click();
		clickmethod(cop.getMy_itinerary());
		
		//-----------------------------------------------------
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		methodTakesScreenshot("C:\\\\Selenium\\\\Seleniumproject\\\\Screenshots\\\\adactin.png");
		
		
	}

	

}
