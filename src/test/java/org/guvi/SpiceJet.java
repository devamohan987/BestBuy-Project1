package org.guvi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.spicejet.com/");

		// Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();

		Thread.sleep(1000);
		// Switch to the popup window (if any)
		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}

		driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-1p0dtai r-18u37iz r-1d2f490 r-u8s1d r-zchlnj r-ipm5af']/div[@class='css-1dbjc4n r-14lw9ot r-1p0dtai r-1pcd2l5 r-wk8lta r-u8s1d r-zchlnj r-ipm5af']/div[@class='css-1dbjc4n r-156q2ks']/div[@class='css-1dbjc4n r-wk8lta r-1xcajam']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-18u37iz']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-p1pxzi']/div[2]"))
				.click(); //

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deva2002@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("deva@2002");
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();

		Thread.sleep(5000);

		// Write code to search for flights by entering dummy origin and destination information for below types of trips.


		WebElement toInput = driver
				.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']"));
		toInput.clear();
		toInput.sendKeys("DEL");
		Thread.sleep(1000);

		WebElement fromInput = driver
				.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']"));
		fromInput.clear();
		fromInput.sendKeys("BLR");

		Thread.sleep(2500);

		// Click the calendar
		WebElement datePicker = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		datePicker.click();

		WebElement searchflight = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']"));
		searchflight.click();

		// 6. Write code to select a flight and proceed to the booking page.

		Thread.sleep(2000);

		WebElement proceed = driver.findElement(By.xpath(
				" //div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']"));
		proceed.click();

		// Write code to fill out the booking form with dummy passenger and payment information. 
		// PASSENGER PAGE
		// contact details

		Thread.sleep(3500);

		WebElement firstname = driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']"));
		firstname.clear();
		firstname.sendKeys("deva");

		WebElement lasstname = driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']"));
		lasstname.clear();
		lasstname.sendKeys("M");

		WebElement phno = driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']"));
		phno.clear();
		phno.sendKeys("6369942666");

		WebElement email = driver
				.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']"));
		email.clear();
		email.sendKeys("deva2002@gmail.com");

		WebElement town = driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']"));
		town.clear();
		town.sendKeys("chennai");

		Thread.sleep(3500);

		// PASSENGER INFORMATION

		WebElement select1 = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//div[@class='css-1dbjc4n r-zso239']"));
		select1.click();

		WebElement con = driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']"));
		con.click();

		// ADDS ON PAGE

		Thread.sleep(3500);

		WebElement con2 = driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
		con2.click();

		Thread.sleep(3000);
		WebElement selectnow = driver.findElement(By.xpath("//span[@id='selectfrompopup']"));
		selectnow.click();

		WebElement done = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']"));
		done.click();

		Thread.sleep(3000);
		WebElement con3 = driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]"));
		con3.click();

		// PAYMENT PAGE

		Thread.sleep(3500);

		WebElement cardnumber = driver.findElement(By.xpath("//input[@id='card_number']"));
		cardnumber.sendKeys("1234 5678 9012 3456");

		WebElement cardholder = driver.findElement(By.xpath("//input[@id='name_on_card']"));
		cardholder.sendKeys("Deva");

		WebElement expirymonth = driver.findElement(By.xpath("//input[@id='name_on_card']"));
		expirymonth.sendKeys("15");

		WebElement expiryyear = driver.findElement(By.xpath("//input[@id='name_on_card']"));
		expiryyear.sendKeys("2030");

		WebElement cvv = driver.findElement(By.xpath("//input[@id='name_on_card']"));
		cvv.sendKeys("465");

		// Write code to verify that the booking was successful by checking the resulting web page for the booking confirmation message.

		WebElement confirmation_message = driver.findElement(By.xpath("//div[@data-testid='common-proceed-to-pay']"));
		if (confirmation_message.getText() == "Booking is Successful") {
			System.out.println("Booking was successful!");
		} else {
			System.out.println("Booking wasn't successful!");
		}

	}
	
}
