package com.cades.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class BaseTest {
	public static void main(String[] args) {

		System.out.println("Hello");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}
}
