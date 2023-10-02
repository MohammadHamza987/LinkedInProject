package com.tutorialsninja.automation.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.tutorialsninja.automation.base.Base;


public class Browser {

	public static Logger log = Logger.getLogger(Browser.class);

	public static void startBrowser() {
		String browser = Base.reader.getBrowser().toLowerCase();
		log.info("Selected Browser is: " + browser);
		WebDriver driver = new ChromeDriver();

		switch (browser) {

		case "chrome":
			driver.get("https://tutorialsninja.com/demo/");

		case "ie":

		case "htmlunit":

		default:

		}

	}

	public static void maximize() {
	}

}
