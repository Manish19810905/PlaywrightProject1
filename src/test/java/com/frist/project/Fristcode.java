package com. frist.project;

import java. awt.Dimension;
import java.awt.Toolkit;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Fristcode {

	public static void main(String[] args) {
	
		Playwright playwright = Playwright.create();
		
		LaunchOptions ip = new LaunchOptions();
		ip.setChannel("chrome");
		ip.setHeadless(false);
		Browser browser = playwright.chromium().launch(ip);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int hight = (int)screenSize.getHeight();
		System.out.println(width+":"+hight);
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, hight));
		
		
		
		Page page = context.newPage();
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		String title = page.title();
		System.out.println("Title is----->"   +title);
		String url = page.url();
		System.out.println("URL is ----->"    + url);
		
		
		
		
		
		//login tab(https://automationexercise.com/)
//		Locator loginTab = page.locator("text=Signup / Login");
//		loginTab.click();
//		
//		// login function
//		Locator emailFilled = page.locator("xpath=//input[@data-qa='login-email']");
//		emailFilled.fill("umanish321@gmail.com");
//		String entredUser = emailFilled.inputValue();
//		System.out.println("User name is-------->"+entredUser);
//		
//		Locator passwordFilled = page.locator("xpath=//input[@type='password']");
//		passwordFilled.fill("Myra@2020");
//		String enteredPassword = passwordFilled.inputValue();
//		System.out.println("Password is-------->"+enteredPassword);
//		
//		Locator loginButton = page.locator("xpath=//button[@data-qa='login-button']");
//		loginButton.click();
//		
//		//home page validation
//		Locator homePageText = page.locator("text=Logged in as Manish Upadhyay");
//		String homepageLanding = homePageText.textContent();
//		System.out.println("User landing on home page------."+homepageLanding);
//		
//		Assert.assertEquals(" Logged in as Manish Upadhyay", homepageLanding);
//		//logout
//		Locator logOutTab = page.locator("text=Logout");
//		logOutTab.click();
		
		
		
			
		// JS pop handle- handle automatically (https://the-internet.herokuapp.com/javascript_alerts)
//		Locator JSpopUp = page.locator("text=Click for JS Alert");
//		JSpopUp.click();
//		Locator result = page.locator("#result");
//		String resultText = result.textContent();
//		System.out.println(resultText);
//		Assert.assertEquals("You successfully clicked an alert", resultText);
		
		//popup accept or dismiss
//		page.onDialog(dialog -> {String popUpMessage = dialog.message();
//		System.out.println(popUpMessage);
//		dialog.accept();
//		});
//		
//		Locator JS = page.locator("text=Click for JS Confirm");
//		JS.click();
//		Locator result1 = page.locator("#result");
//		String resultText1 = result1.textContent();
//		System.out.println(resultText1);
//		Assert.assertEquals("You clicked: Ok", resultText1);
		
		//popup Prompt
//		String popMassageentered = "Hi this is Mizash";
//		page.onDialog(dialog -> {String popUpMessage = dialog.message();
//		System.out.println(popUpMessage);
//		dialog.accept(popMassageentered);
//		});
//		
//		Locator JS2 = page.locator("text=Click for JS Prompt");
//		JS2.click();
//		Locator result2 = page.locator("#result");
//		String resultText2 = result2.textContent();
//		System.out.println(resultText2);
//		Assert.assertEquals("You entered: "+popMassageentered, resultText2);
	
		
	
		
//		page.close();
//		browser.close();
//		playwright.close();
		
		
		

	}

}
