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

public class GNB_OPEN_NOV_Desktop {

	static WebElement popup;

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("M2_test");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 240);

		// Home page or base URL define.
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
		logger.info("Now Time - " + dateNowText);

		driver.get(baseUrl + "products");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// now start open catalog page URLs present in GNB desktop including open page-2
		// from pagination opptions.
		driver.get(baseUrl + "rings/diamond-rings?gnb=rings-stone-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/sapphire-rings?gnb=rings-stone-sapphire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/ruby-rings?gnb=rings-stone-ruby");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/emerald-rings?gnb=rings-stone-emerald");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/tanzanite-rings?gnb=rings-stone-tanzanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/aquamarine-rings?gnb=rings-stone-aquamarine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/amethyst-rings?gnb=rings-stone-amethyst");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/pearl-rings?gnb=rings-stone-pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/morganite-rings?gnb=rings-stone-morganite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/garnet-rings?gnb=rings-stone-garnet");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/opal-rings?gnb=rings-stone-opal");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/blue-topaz-rings?gnb=rings-stone-blue");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/peridot-rings?gnb=rings-stone-peridot");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/pink-tourmaline-rings?gnb=rings-stone-pink_tourmaline");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/colored-diamond-rings/enhanced-blue-diamond?gnb=rings-stone-enhanced_blue_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(
				baseUrl + "rings/colored-diamond-rings/enhanced-black-diamond?gnb=rings-stone-enhanced_black_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/coffee-diamond-rings?gnb=rings-stone-/coffee_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/black-onyx-rings?gnb=rings-stone-black_onyx");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/moissanite-rings?gnb=rings-stone-moissanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/citrine-rings?gnb=rings-stone-citrine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/rose-quartz-rings?gnb=rings-stone-rose_quartz");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "certified-gemstone-rings?gnb=rings-stone-certified_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/halo-rings?gnb=rings-style-halo");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/solitaire-rings?gnb=rings-style-solitaire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/eternity-rings?gnb=rings-style-eternity");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/three-stone-rings?gnb=rings-style-three_stone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/vintage?gnb=rings-style-vintage");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/stackables?gnb=rings-style-stackables");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/cocktail-rings?gnb=rings-style-cocktail");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings?icid=topnavimages|rings|05032018&gnb=rings-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/diamond-necklace-pendants?gnb=necklaces-stone-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/sapphire-necklace-pendants?gnb=necklaces-stone-sapphire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/ruby-necklace-pendants?gnb=necklaces-stone-ruby");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/emerald-necklace-pendants?gnb=necklaces-stone-emerald");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/tanzanite-necklace-pendants?gnb=necklaces-stone-tanzanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/aquamarine-necklace-pendants?gnb=necklaces-stone-aquamarine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/amethyst-necklace-pendants?gnb=necklaces-stone-amethyst");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/pearl-necklace?gnb=necklaces-stone-pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/morganite-necklace-pendants?gnb=necklaces-stone-morganite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/garnet-necklace-pendants?gnb=necklaces-stone-garnet");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/opal-necklace-pendants?gnb=necklaces-stone-opal");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/blue-topaz-necklace-pendants?gnb=necklaces-stone-blue_topaz");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/peridot-necklace-pendants?gnb=necklaces-stone-peridot");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/pink-tourmaline-necklace-pendants?gnb=necklaces-stone-pink_tourmaline");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "pendants/colored-diamond-necklace-pendants/enhanced-blue-diamond?gnb=necklaces-stone-enhanced_blue_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "pendants/colored-diamond-necklace-pendants/enhanced-black-diamond?gnb=necklaces-stone-enhanced_black_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/coffee-diamond-pendant-necklaces?gnb=necklaces-stone-coffee_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/black-onyx-necklace-pendants?gnb=necklaces-stone-black_onyx");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/moissanite-necklace-pendants?gnb=necklaces-stone-moissanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/citrine-necklace-pendants?gnb=necklaces-stone-citrine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "certified-gemstone-pendant-necklaces?gnb=necklaces-stone-certified_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/solitaire-necklace-pendants?gnb=necklaces-style-solitaire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants?order=position&dir=asc&filterable_jewelry_styles=halo&gnb=necklaces-style-halo");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/heart-necklace-pendants?gnb=necklaces-style-heart");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/cross-necklace-pendants?gnb=necklaces-style-cross");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants/pearl-strands?gnb=necklaces-stone-pearl-strands");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "pendants?icid=topnavimages|necklaces|05032018&gnb=necklaces-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/diamond-earrings?gnb=earrings-stone-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/sapphire-earrings?gnb=earrings-stone-sapphire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/ruby-earrings?gnb=earrings-stone-ruby");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/emerald-earrings?gnb=earrings-stone-emerald");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/tanzanite-earrings?gnb=earrings-stone-tanzanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/aquamarine-earrings?gnb=earrings-stone-aquamarine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/amethyst-earrings?gnb=earrings-stone-amethyst");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/pearl-earrings?gnb=earrings-stone-pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/morganite-earrings?gnb=earrings-stone-morganite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/garnet-earrings?gnb=earrings-stone-garnet");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/opal-earrings?gnb=earrings-stone-opal");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/blue-topaz-earrings?gnb=earrings-stone-blue_topaz");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/peridot-earrings?gnb=earrings-stone-peridot");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/pink-tourmaline-earrings?gnb=earrings-stone-pink_tourmaline");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "earrings/colored-diamond-earrings/enhanced-blue-diamond?gnb=earrings-stone-enhanced_blue_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "earrings/colored-diamond-earrings/enhanced-black-diamond?gnb=earrings-stone-enhanced_black_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/coffee-diamond-earrings?gnb=earrings-stone-coffee_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/black-onyx-earrings?gnb=earrings-stone-black_onyx");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/moissanite-earrings?gnb=earrings-stone-moissanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/citrine-earrings?gnb=earrings-stone-citrine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "certified-gemstone-earrings?gnb=earrings-stone-certified_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/stud-earrings?gnb=earrings-style-studs");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/drop-earrings?gnb=earrings-style-drop");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings/hoop-earrings?gnb=earrings-style-hoop");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "earrings?icid=topnavimages|earrings|05032018&gnb=earrings-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/diamond-engagement-rings?gnb=engagement-stone-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/sapphire-engagement-rings?gnb=engagement-stone-sapphire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/ruby-engagement-rings?gnb=engagement-stone-ruby");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/emerald-engagement-rings?gnb=engagement-stone-emerald");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/tanzanite-engagement-rings?gnb=engagement-stone-tanzanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/aquamarine-engagement-rings?gnb=engagement-stone-aquamarine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/amethyst-engagement-rings?gnb=engagement-stone-amethyst");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/pearl-engagement-rings?gnb=engagement-stone-pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/morganite-engagement-rings?gnb=engagement-stone-morganite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/garnet-engagement-rings?gnb=engagement-stone-garnet");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/opal-engagement-rings?gnb=engagement-stone-opal");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/blue-topaz-engagement-rings?gnb=engagement-stone-blue_topaz");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/peridot-engagement-rings?gnb=engagement-stone-peridot");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/pink-tourmaline-engagement-rings?gnb=engagement-stone-pink_tourmaline");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "engagement-rings/colored-diamond-engagement-rings/enhanced-blue-diamond-engagement?gnb=engagement-stone-enhanced_blue_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "engagement-rings/colored-diamond-engagement-rings/enhanced-black-diamond-engagement?gnb=engagement-stone-enhanced_black_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/coffee-diamond-engagement-rings?gnb=engagement-stone-coffee_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/black-onyx-engagement-rings?gnb=engagement-stone-black_onyx");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/moissanite-engagement-rings?gnb=engagement-stone-moissanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/citrine-engagement-rings?gnb=engagement-stone-citrine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "certified-gemstone-engagement-rings?gnb=engagement-stone-certified_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/halo-rings?gnb=engagement-style-halo");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/solitaire-rings?gnb=engagement-style-solitaire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/vintage?gnb=engagement-style-vintage");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/three-stone-rings?gnb=engagement-style-three_stone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings/wedding-ring-set?gnb=engagement-style-bridal_sets");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "engagement-rings?icid=topnavimages|engagement|02062018&gnb=engagement-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/anniversary-rings?gnb=wedding-women-anniversary");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/womens-diamond-wedding-bands?gnb=wedding-women-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/womens-gemstone-and-diamond-bands?gnb=wedding-women-colored_gemstones");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/womens-plain-wedding-bands?gnb=wedding-women-plain");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/eternity-rings?gnb=wedding-women-eternity");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/mens-diamond-wedding-bands?gnb=wedding-men-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/mens-gemstone-and-diamond-bands?gnb=wedding-men-colored_gemstones");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings/mens-plain-wedding-bands?gnb=wedding-men-plain");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=white--gold&order=position&dir=asc&gnb=wedding-metal-white_gold");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=yellow--gold&order=position&dir=asc&gnb=wedding-metal-yellow_gold");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=rose--gold&order=position&dir=asc&gnb=wedding-metal-rose_gold");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=two--tone--gold&order=position&dir=asc&gnb=wedding-metal-two_tone_gold");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=platinum&order=position&dir=asc&gnb=wedding-metal-platinum");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "wedding-rings/wedding-bands?filterable_metal_types=silver&order=position&dir=asc&gnb=wedding-metal-silver");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "wedding-rings?icid=topnavimages|wedding|02062018&gnb=wedding-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "bracelets?filterable_jewelry_styles=tennis&gnb=bracelets-style-tennis");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "bracelets/charm-bracelets?gnb=bracelets-style-charms");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "bracelets?icid=topnavimages|bracelets|05032018?gnb=bracelets-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/high-jewelry/certified-gemstone?gnb=collection-certified_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/coffee-diamond-jewelry?gnb=collection-coffee_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/color-crush?gnb=collection-color_crush");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/nature-inspired-jewelry?gnb=collection-love_naturally");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/initial-jewelry?gnb=collection-initials");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/vintage?gnb=collection-vintage_inspired");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "rings/cocktail-rings?gnb=collection-cocktail");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/infinity-jewelry?gnb=collection-infinity");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/two-stone-jewelry?gnb=collection-me_we");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/knotty-heart-jewelry?gnb=collection-knotty_heart");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "collection/wear-your-luck?gnb=collection-wear_your_luck");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "collection/high-jewelry/certified-gemstone?icid=topnavimages|collections|02062018&gnb=collection-banner");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry-gifts/christmas-gifts?gnb=gifts-occasion-christmas");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "anniversary-gifts?gnb=gifts-occasion-anniversary");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry-gifts/wedding?gnb=gifts-occasion-wedding");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry-gifts/birthday-gifts?gnb=gifts-occasion-birthday");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/january-birthstone-garnet-jewelry?gnb=gifts-birthstone-jan_garnet");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(
				baseUrl + "birthstone-jewelry/february-birthstone-amethyst-jewelry?gnb=gifts-birthstone-feb_amethyst");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(
				baseUrl + "birthstone-jewelry/march-birthstone-aquamarine-jewelry?gnb=gifts-birthstone-mar_aquamarine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/april-birthstone-diamond-jewelry?gnb=gifts-birthstone-apr_diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/may-birthstone-emerald-jewelry?gnb=gifts-birthstone-may_emerald");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/june-birthstone-pearl-jewelry?gnb=gifts-birthstone-jun_pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/july-birthstone-ruby-jewelry?gnb=gifts-birthstone-jul_ruby");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/august-birthstone-peridot-jewelry?gnb=gifts-birthstone-aug_peridot");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(
				baseUrl + "birthstone-jewelry/september-birthstone-sapphire-jewelry?gnb=gifts-birthstone-sep_sapphire");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/october-birthstone-opal-jewelry?gnb=gifts-birthstone-oct_opal");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/november-birthstone-citrine-jewelry?gnb=gifts-birthstone-nov_citrine");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl
				+ "birthstone-jewelry/december-birthstone-tanzanite-jewelry?gnb=gifts-birthstone-dec_tanzanite");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "birthstone-jewelry/birthstone-by-month?gnb=gifts-birthstone-birthstone_by_month");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "products?dir=asc&order=price&p=1&price=1-500&gnb=gifts-price-1_500");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "products?dir=asc&order=price&p=1&price=500-1000&gnb=gifts-price-500_1000");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "products?dir=asc&order=price&p=1&price=1000-2000&gnb=gifts-price-1000_2000");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "products?dir=asc&order=price&p=1&price=2000-99999&gnb=gifts-price-2000_99999");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/gemstone-jewelry?gnb=gifts-stone-colored_gemstone");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/pearl-jewelry?gnb=gifts-stone-pearl");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "jewelry/diamond-jewelry?gnb=gifts-stone-diamond");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		logger.info(" Page-2 Finish " + driver.getCurrentUrl());
		driver.get(baseUrl + "top-50-gifts?gnb=gifts-top_50_gifts");

		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("newsletter-validate-detail"),
				"Become a preferred subscriber and get a special offer on your first purchase."));
		Thread.sleep(2000);

		long finish = System.currentTimeMillis();

		long totalTime = finish - start;
		logger.info("" + start);
		logger.info("" + finish);
		logger.info("Total Time for page load - " + totalTime);
		logger.info("Now Time - " + dateNowText);

	}
}
