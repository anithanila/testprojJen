package step;

import cucumber.api.java.en.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stepdefi {

	public WebDriver driver = null;

	
		       @Given("^sample feature file is ready$")
		
		       public void givenStatment() throws InterruptedException{
		
		              System.out.println("Given statement executed successfully");;
		              System.setProperty("webdriver.chrome.driver", "C:/Users/yogeshraja/SeleniumDriver/bin/chromedriver.exe");
		              driver = new ChromeDriver();
		              driver.get("http://gmail.com");
		              driver.manage().window().maximize();
		              driver.findElement(By.id("identifierId")).sendKeys("praniyogesh@gmail.com");
		              driver.findElement(By.id("identifierNext")).click();
		              //driver.findElement(By.cssSelector("div[class='Xb9hP']")).sendKeys("Praniyog@1");
		              Thread.sleep(5000); 
		              Actions actions = new Actions(driver);
		              actions.moveToElement(driver.findElement(By.cssSelector("div[class='Xb9hP']")));
		              actions.click();
		              actions.sendKeys("praniyog1");
		              actions.perform();
		              driver.findElement(By.id("passwordNext")).click();
		              
		              WebDriverWait wait = new WebDriverWait(driver, 10);
		              WebElement composeBut = wait.until(
		                      ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")));
		              composeBut.click();
		              //get window handle 
		              String parentWindowHandler = driver.getWindowHandle(); 
		              String subWindowHandler = null;
		              
		              Set<String> handles = driver.getWindowHandles(); 
		              Iterator<String> iterator = handles.iterator();
		              while (iterator.hasNext()){
		            	    subWindowHandler = iterator.next();
		            	}
		              driver.switchTo().window(subWindowHandler);
		              WebElement toAdd = wait.until(
		                      ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		              
		              toAdd.sendKeys("yogsatha@gmail.com");
		              driver.findElement(By.name("subjectbox")).sendKeys("Love u Daddy :)");
		              driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		              driver.switchTo().window(parentWindowHandler);
		              WebElement sentMail = wait.until(
		                      ExpectedConditions.visibilityOfElementLocated(By.linkText("Sent Mail")));
		              sentMail.click();
		              driver.findElement(By.xpath("*//table[@id=':15m']/tbody/tr[@id=':15l']/td[8]")).getText();
		              driver.quit();
		              
		              System.out.println("test ran successfully");
		       }
	
		       @When("^I run the feature file$")
		
		       public void whenStatement(){
			System.out.println("Passed!!! When statement execueted successfully");
		
		       }
		
		       @Then("^run should be successful$")
		
		       public void thenStatment(){
		
		              System.out.println("Passed !!! Then statement executed successfully");
		
		       }
		
		}


