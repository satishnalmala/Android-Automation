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

public class Job_Details_Rooms_uploadmedia {
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

		driver.findElement(By.id("com.dki.dki:id/et_search_view")).sendKeys("2208DK017");
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/btn_search_all_jobs")).click();
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/tv_download_text")).click();
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/btn_confirm")).click();
		cf.myWait(20000);
		driver.findElement(By.id("com.dki.dki:id/et_search_view")).sendKeys("2208DK017");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/tv_job_id")).click();
		cf.myWait(3000);
		System.out.println("open menu");

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout"))
		.click();
		cf.myWait(2000);
		System.out.println("selected rooms");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_upload_image")).click();
		cf.myWait(2000);
		driver.findElement(By.id("com.dki.dki:id/tv_upload_image")).click();
		cf.myWait(2000);
		System.out.println("clicked image upload");
		
		/*driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[3]"))
		.click();
		cf.myWait(2000);
		System.out.println("clicked upload image");*/
		
		driver.findElement(By.id("com.dki.dki:id/ib_gallery")).click();
		cf.myWait(2000);
		System.out.println("selected gallery");
		
		driver.findElement(By.id("com.android.documentsui:id/icon_thumb")).click();
		cf.myWait(2000);
		System.out.println("selected image");
		
		driver.findElement(By.id("com.dki.dki:id/upload")).click();
		cf.myWait(2000);
		System.out.println("image uploaded");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[1]/android.widget.TextView"))
		.click();
		cf.myWait(2000);
		System.out.println("clicked level");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"))
		.click();
		cf.myWait(2000);
		System.out.println("selected level");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[2]/android.widget.TextView"))
		.click();
		cf.myWait(2000);
		System.out.println("clicked room");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"))
		.click();
		cf.myWait(2000);
		System.out.println("selected room");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[3]/android.widget.TextView"))
		.click();
		cf.myWait(2000);
		System.out.println("clicked job type");
		
		driver.findElement(By.id("android:id/text1")).click();
		cf.myWait(2000);
		System.out.println("job selected");
		
		driver.findElement(By.id("android:id/button1")).click();
		cf.myWait(2000);
		System.out.println("clecked ok button");
		
		driver.findElement(By.id("com.dki.dki:id/et_media_description")).sendKeys("Description added");
		cf.myWait(2000);
		System.out.println("added comments");
		
		driver.findElement(By.id("com.dki.dki:id/btn_upload")).click();
		cf.myWait(2000);
		System.out.println("clicked upload button");
		
	}
}
