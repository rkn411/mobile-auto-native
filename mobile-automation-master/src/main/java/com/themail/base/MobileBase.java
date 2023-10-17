package com.themail.base;

import org.openqa.selenium.support.PageFactory;

import com.themail.drivermanager.DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileBase {
	public AppiumDriver<MobileElement> appiumDriver;
	public MobileBase(){
		appiumDriver = DriverManager.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
}
