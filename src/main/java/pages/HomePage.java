package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebDriver driver=null;
	
	public static WebElement origin(WebDriver driver) {
		WebElement originbtn = driver.findElement(By.id("BE_flight_origin_city"));
		return originbtn;	
	}
	
	public static WebElement arrival(WebDriver driver) {
		WebElement arrivalbtn = driver.findElement(By.id("BE_flight_arrival_city"));
		return arrivalbtn;	
	}
	
	public static WebElement date(WebDriver driver) {
		WebElement dateele = driver.findElement(By.id("BE_flight_origin_date"));
		return dateele;	
	}
	
	public static WebElement search(WebDriver driver) {
		WebElement searchele = driver.findElement(By.xpath("//input[@value='Search Flights']"));
		return searchele;	
	}

}
