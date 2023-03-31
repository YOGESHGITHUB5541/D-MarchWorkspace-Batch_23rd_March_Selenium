package org.propertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class FacebookEx {

	public static void main(String[] args) {
		ConfigReader cr = new ConfigReader();
		
		String bName = cr.getConfigData("browserName");
		String url = cr.getConfigData("url");
		String emailAddress = cr.getConfigData("emailAddress");
		String pwd = cr.getConfigData("password");
		
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.startUp(bName, url);
		
		driver.findElement(By.id("email")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		driver.findElement(By.xpath("//div[@class='qi72231t o9w3sbdw nu7423ey tav9wjvu flwp5yud tghlliq5 gkg15gwv s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq pbevjfx6 aglvbi8b']//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();	
		
		//Second Way:
//		WebDriver driver = bu.startUp(cr.getConfigData("browserName"), cr.getConfigData("url"));
//	    driver.findElement(By.id("email")).sendKeys(cr.getConfigData("emailAddress"));
//		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(cr.getConfigData("password"));
//		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
//		

	}

}
