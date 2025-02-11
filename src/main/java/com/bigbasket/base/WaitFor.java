package com.bigbasket.base;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {
	public static FluentWait<WebDriver> wait;
	public static WebDriverWait wait1;
	static {
		wait = new FluentWait<WebDriver>(Keyword.driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.ignoring(NoSuchElementException.class);
		wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(20));
		wait1.ignoring(ElementNotInteractableException.class);
	}

	public static void elementTobeVisible(WebElement element) {
		wait1.until(ExpectedConditions.visibilityOf(element));

	}
	public static void visibilityOfElement(WebElement element) {
		try {
			wait1.until(ExpectedConditions.visibilityOf(element));
		} catch (StaleElementReferenceException e) {

			wait1.until(ExpectedConditions.visibilityOf(element));
		}
	} 

	// Wait until all elements are visible
	public static List<WebElement> visibilityOfElements(List<WebElement> elements) {
		try {
			wait1.until(ExpectedConditions.visibilityOfAllElements(elements));
			return elements;
		} catch (StaleElementReferenceException e) {
			wait1.until(ExpectedConditions.visibilityOfAllElements(elements));
			return elements;
		}
	}
	
	 public static void untilUrlLoad(String url) {
			WebDriverWait wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.urlContains(url));

		}

	public static void elementToBeClickable(WebElement element) {
		wait1.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static void elementToBeDisplayed(WebElement element) {
		wait1.until(ExpectedConditions.visibilityOf(element));
	}

}

