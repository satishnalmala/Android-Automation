package TestCases;

import PageRepository.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import PagesRepository.CommonFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.*;
import java.awt.*;

//import io.appium.java_client.android.AndroidDriver.pressKey;

public class Job_Details_Subdetails {
	static AndroidDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {
		// Set the Desired Capabilities

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		// caps.setCapability("unicodeKeyboard","true");
		// caps.setCapability("resetKeyboard","true");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DKI-Satish\\Downloads\\3.0A-08.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void Testcase1_CreateJob() throws InterruptedException {
		CommonFunctions cf = new CommonFunctions(driver);

		cf.myWait(15000);

		cf.initialPermissions();
		cf.Login();
		cf.myWait(10000);

		driver.findElement(By.id("com.dki.dki:id/et_search_view")).sendKeys("2208DK015");
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/btn_search_all_jobs")).click();
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/tv_download_text")).click();
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/btn_confirm")).click();
		cf.myWait(20000);
		driver.findElement(By.id("com.dki.dki:id/et_search_view")).sendKeys("2208DK015");
		cf.myWait(4000);

		driver.findElement(By.id("com.dki.dki:id/tv_job_id")).click();
		cf.myWait(5000);
		System.out.println("open menu");

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]"))
				.click();
		cf.myWait(5000);
		System.out.println("Clicked detail 1");

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout"))
				.click();

		cf.myWait(3000);
		System.out.println("Clicked detail 2");

		driver.findElement(By.id("com.dki.dki:id/tv_client_name")).isDisplayed();

		driver.findElement(By.id("com.dki.dki:id/tv_client_address")).isDisplayed();

		driver.findElement(By.id("com.dki.dki:id/tv_contact_number")).isDisplayed();

		driver.findElement(By.id("com.dki.dki:id/tv_email_address")).isDisplayed();

		
	}
}
