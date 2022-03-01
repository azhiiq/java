package com.Maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	

public static WebDriver driver;

//Browser launch

public static WebDriver browserLaunch(String name) {
			if(name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			else if(name.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			return driver;
}
			// close
			public static void closeBrowser() {
				driver.close();
			}
			
			//quit
			public static void quitBrowser() {
				driver.quit();
			}
			
			//navigate to
			public static void navigate(WebElement element, String input) {
				driver.navigate().to(input);
			}
			
			//navigate back()
			public static void navigateBackurl() {
				driver.navigate().back();
			}
			
			//navigate forward()
			public static void navigatefrwdurl() {
				driver.navigate().forward();
			}
			//navigate refresh()
			public static void navigaterefreshurl() {
				driver.navigate().refresh();
			}
			
			
			//get url
			public static void  geturl(String url) {
				driver.get(url);

			}
			
			
			//Alert
			public static void alertaccept() {
				Alert simplealert = driver.switchTo().alert();
				simplealert.accept();
				
			}
			//dismiss
			public static void dismiss() {
				Alert Adismiss = driver.switchTo().alert();
				Adismiss.dismiss();
			}
			
			//send keys
			public static void alertsendkeys() {
				Alert promtalert = driver.switchTo().alert();
				promtalert.sendKeys(null);
				
			}
	
			public static void alertgettext(String inputext) {
				Alert promtalert= driver.switchTo().alert();
				promtalert.sendKeys(inputext);
				String text = promtalert.getText();
				System.out.println(text);
				
				
			}
		//Action (all methods)
			//action-click
			public static void actionclick(WebElement element) {
			Actions	 clk = new Actions(driver);
			clk.contextClick(element).build().perform();
			}
			
			//action double click
			public static void actiondoubleclick(WebElement element) {
				Actions dclk = new Actions(driver);
				dclk.doubleClick(element).build().perform();
				
			}
			//action -drag and drop
		   public static void actiondragdrop(WebElement drag,WebElement drop) {
			Actions dnd = new Actions(driver);
			dnd.dragAndDrop(drag, drop).build().perform();
		     }
			//Frames ()
		   public static void switchToFrames(int index) {
			driver.switchTo().frame(index);
		     }
			
		   public static void switchToframe(String idorname) {
           driver.switchTo().frame(idorname);
		    }

		   public static void switchToframe(WebElement element) {
           driver.switchTo().frame(element);
		    }
          public static void switchTDefaultContent() {
         driver.switchTo().defaultContent();

		   }
          public static void switchToparentFrame() {
          driver.switchTo().parentFrame();
          }
     

          //Robot()
          public static void keyboardevents() throws AWTException {
        	  Robot r = new Robot();
        	  r.keyPress(KeyEvent.VK_DOWN);
      		  r.keyRelease(KeyEvent.VK_DOWN);
      		r.keyPress(KeyEvent.VK_ENTER);
      		r.keyRelease(KeyEvent.VK_ENTER);
      	   }
           

          //window handles()

      		   public static void windowhandle() {
      			String windowHandle = driver.getWindowHandle();
      			
      		   System.out.println(driver.switchTo().window(windowHandle).getTitle());
      		 }
      		
      		public static void windowhandles() {
      			Set<String> windowHandles = driver.getWindowHandles();
      			for(String tabs : windowHandles) {
      				String title = driver.switchTo().window(tabs).getTitle();
      				System.out.println(title);
      			}
      		}
      		
      		//drop down
      		
      		//single drop down
      		
      		public static void singleDropDown(WebElement data,  int index) {
                 Select s = new Select(data);
      			s.selectByIndex(index);
      		}

      		public static void singleDropDown_value(WebElement data,  String value) {
                 Select s = new Select(data);
      			s.selectByValue(value);
      		}
      		
      		public static void singleDropDown_visibleText(WebElement data,  String visibletext) {

      			Select s = new Select(data);
      			s.selectByVisibleText(visibletext);
      		}
      		//check box
      		public static void methodChechbox(WebElement chkbox) {
      			chkbox.click();
      		}
		//enable
      			public static void methodIsEnable(WebElement element) {

      				boolean isenable = element.isEnabled();
      				System.out.println(isenable);
      			}
      			// is displayed ()
      			public static void methodIsDisplayed(WebElement element) {

      				boolean isdisplayed = element.isDisplayed();
      				System.out.println(isdisplayed);

      			}
      			//is selected ()
      			
      			public static void methodIsSelected(WebElement element) {

      				boolean isselected = element.isSelected();
      				System.out.println(isselected);

      			   }
      			
      			//get options()
      			public static void getAllOptions(WebElement element) {

      				Select s=new Select(element);
      				List<WebElement> alopt = s.getOptions();
      				for(WebElement  options : alopt){
      					String optext = options.getText();
      					System.out.println(optext);
      				}
      					
      				}
      			//get title()
      			public static void getTitleName() {

      				String title = driver.getTitle();
      				System.out.println("Title: " + title);
      			}
      			//get url()
      			public static void getCurrenturl() {

      				String currentUrl = driver.getCurrentUrl();
      				System.out.println("Current URL: " + currentUrl);
      			}
      				
      	   //get text
      				public static void getTextMethod(WebElement element) {

      					String text = element.getText();
      					System.out.println("Text " + text);

      				}
      				
      			//get attribute
      				public static void getAttributeMethod(WebElement element) {

      					String attribute = element.getText();
      					System.out.println("Text " + attribute);
      				}
      			//implicit wait ()
      				
      				public static void implicitwait() {

      		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      				}
      		//explicit wait ()
      				public static void explicitwait(WebElement element) {

      					WebDriverWait wait = new WebDriverWait(driver, 20);
      					wait.until(ExpectedConditions.visibilityOf(element));
      				}
      	//screenshot()
      				
      				public static void methodTakesScreenshot(String location) throws IOException {
      					TakesScreenshot ts = (TakesScreenshot) driver;
      					File src = ts.getScreenshotAs(OutputType.FILE);
      					File dest = new File(location);
      					FileUtils.copyFile(src, dest);
      				}
      				
      				//scroll up & down()
      				
      				public static void scrollIntoView( WebElement element, String viewpoint) {
      					JavascriptExecutor js = (JavascriptExecutor) driver;
      					js.executeScript(viewpoint, element);

      				}
      				public static void scrollUp( String upvalue) {

      					JavascriptExecutor js = (JavascriptExecutor) driver;
      					js.executeScript(upvalue);

      				}
      				public static void scrollDown( String downvalue) {
      					
      					JavascriptExecutor js = (JavascriptExecutor) driver;
      					js.executeScript(downvalue);

      				}
      				
      				//send keys
      				public static void sendKeysmethod(WebElement element, String inputvalue) {

      					element.sendKeys(inputvalue);

      				}
      			//  Get first selected options()
      				public static void methodGetfirstSelectedOption(WebElement element) {
      					Select s = new Select(element);
      					WebElement firstSelectedOption = s.getFirstSelectedOption();
      					String firstselectedtext = firstSelectedOption.getText();
      					System.out.println(firstselectedtext);
      				}
      		
      				// Get all selected options()
      					public static void methodGetAllSelectedOption(WebElement element) {
      						Select s = new Select(element);
      						List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
      						for (WebElement selectedoptions : allSelectedOptions) {
      							String selectedtext = selectedoptions.getText();
      							System.out.println(selectedtext);
      						}	
      					}
      					//Is multiple()
      					public static void methodIsMultiple(WebElement element) {
      						Select s = new Select(element);
      						boolean ismultiple = s.isMultiple();
      						System.out.println("Is Multiple : " + ismultiple);

      					}
      					
      					// Click()
      					public static void clickmethod(WebElement element) {

      						element.click();
      					}
	
      						// RadioButton()
      						public static void radiobuttonmethod(WebElement radiobutton) {
      							radiobutton.click();
      						}
      							

      						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
      	
}
	

