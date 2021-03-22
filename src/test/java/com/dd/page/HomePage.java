package com.dd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    WebDriver driver;
	public HomePage (WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	


	



	@FindBy(xpath="//div[@class='selectedMenuButton']")
	WebElement getcbar_menu;
	public WebElement getcbar_menu(){
		
		
		return getcbar_menu;
	}
	@FindBy(xpath= "//span[contains(text(),'SHOP BY DEPARTMENT')]")
	WebElement getcbar_depart;
	public WebElement getcbar_depart(){
		return getcbar_depart;
		
		
	}
	@FindBy(xpath= "//span[contains(text(),'Men')] ")
	WebElement getcbar_men;
	public WebElement getcbar_men(){
		return getcbar_men;
	}
	
	
	@FindBy(xpath= "(//span[starts-with(@class,'m-j-cm-element-text')])[4] ")
	WebElement getcbar_cloth;
	public WebElement getcbar_cloth(){
		return getcbar_cloth;
	}
	
	
	@FindBy(xpath= "(//span[starts-with(@class,'m-j-cm-element-text')])[5] ")
	WebElement getcbar_all;
	public WebElement getcbar_all(){
		return getcbar_all;
		
		
	}
	
	@FindBy(xpath= "(//span[contains(text(),'T-Shirts')] ")
	WebElement getcbar_s;
	public WebElement getcbar_s(){
		return getcbar_s;
		
		
	}
		
	

}
