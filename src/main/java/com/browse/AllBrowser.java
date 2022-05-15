package com.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {
	public static void main(String[] args) {
		openbrowser("Firefox");
	}
	
	public static WebDriver web=null;
	public static WebDriver openbrowser(String site) {
		
		
		if(site.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver.exe");
		web= new ChromeDriver();
		}
		else if (site.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Driver\\geckodriver.exe");
			web=new FirefoxDriver();
		}
		web.get("https://www.osaconsultingtech.com/");
		web.manage().window().maximize();
		return web;
		
	}

}
