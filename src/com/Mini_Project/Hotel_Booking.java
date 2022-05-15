package com.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");		
    WebDriver driver = new ChromeDriver();
    driver.get("https://adactinhotelapp.com/");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Ramyakannan");
		
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("$1385$");
		
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	Thread.sleep(2000);
	
	WebElement location = driver.findElement(By.xpath("//select[@name='location']/option[6]"));
	location.click();
	
	Thread.sleep(2000);
	
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']/option[3]"));
	hotel.click();
	
	Thread.sleep(2000);
	
	WebElement room_type = driver.findElement(By.name("room_type"));
	Select s = new Select(room_type);
	s.selectByIndex(2);
	
	Thread.sleep(2000);
	
	WebElement no_room = driver.findElement(By.name("room_nos"));
	Select sr = new Select(no_room);
	sr.selectByValue("2");
	
	Thread.sleep(2000);
	
	WebElement date_in = driver.findElement(By.name("datepick_in"));
	date_in.clear();
	date_in.sendKeys("08/05/2022");
	
	Thread.sleep(2000);
	
	WebElement date_out = driver.findElement(By.name("datepick_out"));
	date_out.clear();
	date_out.sendKeys("13/05/2022");
	
	Thread.sleep(2000);
	
	WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']/option[3]"));
	adult_room.click();
	
	Thread.sleep(2000);
	
	WebElement child_room = driver.findElement(By.xpath("//select[@name='child_room']/option[2]"));
	child_room.click();
	
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	
	Thread.sleep(2000);
	
	WebElement radio_button = driver.findElement(By.id("radiobutton_0"));
	radio_button.click();
	
	Thread.sleep(2000);
	
	WebElement cnt = driver.findElement(By.id("continue"));
	cnt.click();
	
	Thread.sleep(2000);
	
	WebElement first_name = driver.findElement(By.id("first_name"));
	first_name.sendKeys("Subitha");
	
	Thread.sleep(2000);
	
	WebElement last_name = driver.findElement(By.id("last_name"));
	last_name.sendKeys("Jhon");
	
	Thread.sleep(2000);
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("34B, Melapudhu St, Ambasamudram, Tirunelveli");
	
	Thread.sleep(2000);
	
	WebElement cc_num = driver.findElement(By.id("cc_num"));
	cc_num.sendKeys("1301200008052000");
	
	Thread.sleep(2000);
	
	WebElement cc_type = driver.findElement(By.id("cc_type"));
	Select srj = new Select(cc_type);
	srj.selectByVisibleText("VISA");
	
	Thread.sleep(2000);

	WebElement cc_exp_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']/option[6]"));
	cc_exp_month.click();
	
	Thread.sleep(2000);
	
	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
	Select rs = new Select(cc_exp_year);
	rs.selectByValue("2022");
	
	Thread.sleep(2000);
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("8513");
	
	Thread.sleep(2000);
	
	WebElement book_now = driver.findElement(By.id("book_now"));
	book_now.click();
	
	Thread.sleep(2000);
	
	WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
	logout.click();
	
	}
}




