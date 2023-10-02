package com.tutorialsninja.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tutorialsninja.automation.config.ConfigurationReader;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.util.PathHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Base {
	public static WebDriver driver = new ChromeDriver();

	public static Logger log = Logger.getLogger(Base.class);

	public static ConfigurationReader reader;

	@Before
	public void setUp() {
		driver.get("https://tutorialsninja.com/demo/");

	}

	@After
	public void closeBrowser() {

		driver.quit();
	}
}
