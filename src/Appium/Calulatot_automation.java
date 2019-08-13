  package Appium;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calulatot_automation {

	public static void main(String[] args) throws IOException
	{
		// details of AVD and APP
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, " ");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("plotformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		// start Appium server
		
		Runtime.getRuntime().exec("cmd.exe/c start cmd.exe/k \"appium -a 0.0.0.0 -p 4723\"");
		
		URL u = new URL ("http://0.0.0.0:4723/wd/hub");
		
		
		// create driver object
		
		AndroidDriver driver;
		while (2>1)  // infinite loop
		{
			try
			{
				driver = new AndroidDriver(u,dc);
				break;
			}
			catch(Exception ex)
			{
			
			}
		}
		
			
		// locate and operate elements
		try
		{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='9']")).click();
		driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
		driver.findElement(By.xpath("//*[@text='4']")).click();
		driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
		
		String x = driver.findElement(By.xpath("//*[@class='android.widget.EditText'")).getAttribute("text");
		System.out.println(x);
				
		driver.closeApp();
		
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	// stop aapium server
		
		Runtime.getRuntime().exec("taskkill/F/IM node.exe");
		Runtime.getRuntime().exec("taskkill/F/IM cmd.exe");
		
	}

}
