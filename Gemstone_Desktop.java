package Desktop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gemstone_Desktop {

	static WebElement popup;

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("M2_test");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseUrl = "http://www.angara.com/";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		// Wait for Welcome popup and close it.
		logger.info("WAIT FOR WELCOME POP-UP");

		Thread.sleep(10000);

		boolean isPopupVisible;
		try {
			popup = driver.findElement(By.xpath("//*[@id='popup-visitor']/p/img"));

			isPopupVisible = popup.isDisplayed();
			logger.info("Popup Visible: " + isPopupVisible);

		} catch (Exception e) {
			isPopupVisible = false;
		}
		if (isPopupVisible) {
			WebElement closeButton = driver
					.findElement(By.xpath("//*[@id='visitor_popup_script_selection']/span[2][@class='popup_close']"));
			closeButton.click();
		}

		logger.info("WELCOME POPUP CLOSE SUCCESSFULLY.");

		// Create object of SimpleDateFormat class and decide the format
		long start = System.currentTimeMillis();
		DateFormat CurrentDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date dateNow = new Date();
		String dateNowText = CurrentDate.format(dateNow);
		logger.info("Total Time for page load111 - " + dateNowText);

		driver.get(baseUrl + "products?icid=home|main|hb|11142018");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 240);
	

		WebElement Rings = driver.findElement(By.xpath("//nav[@class='navigation']/ul/li[2]"));
		Rings.click();
		logger.info(" Rings Cache START ");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[6]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(4000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		logger.info(" Rings Cache END " + driver.getCurrentUrl());
		Thread.sleep(4000);

		logger.info(" Pendants Cache START ");
		driver.get(baseUrl + "products");
		WebElement Pendants = driver.findElement(By.xpath("//nav[@class='navigation']/ul/li[3]"));
		Pendants.click();

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[6]/a[1]")).click();
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		logger.info(" Pendants Cache END " + driver.getCurrentUrl());

		driver.get(baseUrl);
		logger.info(" Earrings Cache START ");
		driver.get(baseUrl + "products");
		WebElement Earrings = driver.findElement(By.xpath("//nav[@class='navigation']/ul/li[4]"));
		Earrings.click();

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[6]/a[1]")).click();
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);

		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		driver.findElement(By.xpath("//*[@id='maincontent']/div[5]/div[1]/div/div[10]/div[2]/ul/li[7]/a[1]")).click();
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(6000);
		logger.info(" Earrings Cache END " + driver.getCurrentUrl());

		long finish = System.currentTimeMillis();

		long totalTime = finish - start;
		logger.info("" + start);
		logger.info("" + finish);
		logger.info("Total Time for page load - " + totalTime);

		
		driver.quit();
	}
}
