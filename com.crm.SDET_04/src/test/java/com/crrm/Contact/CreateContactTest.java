package com.crrm.Contact;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.ObjectRepository.ContactPage;
import com.crm.comcast.ObjectRepository.CreateNewContactPage;
import com.crm.comcast.ObjectRepository.HomePage;
import com.crm.comcast.genericUtilities.BaseClass1;

@Listeners(com.crm.comcast.genericUtilities.listnerImplementation.class)
public class CreateContactTest extends BaseClass1
{
	@Test
	public void CreateContactTest1()
	{
	  	//Hi.....
		//get random number
		 int ranNumber = JLib.getRandomNumber();
		
		HomePage hp=new HomePage(driver);	
		hp.getContactsLnk().click();
		
		ContactPage con = new ContactPage(driver);
		con.getCreateContactLkup().click();
		Assert.fail();
		
		CreateNewContactPage cncp= new CreateNewContactPage(driver);
		WebElement cdd = cncp.getFnameDD();
		WLib.selectDropDownByVissibleText(cdd, "Mr.");
		
		cncp.getFirstname().sendKeys("Shrishyl"+ranNumber);
		cncp.getLastname().sendKeys("L");
		cncp.getSavebtn().click();
		//hp.SignOut(driver);
		//hp.getSignOutLnk().click();
		driver.quit();
				
	}
}
