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

public class Job_Details_Rooms_Levels {
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
		
		driver.findElement(By.id("com.dki.dki:id/tv_add_documents")).click();
		cf.myWait(2000);
		System.out.println("clicked add Level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("CREATED");
		cf.myWait(3000);
		System.out.println("Level ADDED");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(2000);
		System.out.println("CREATED");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_add_documents")).click();
		cf.myWait(2000);
		System.out.println("clicked add Level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("CREATED 2");
		cf.myWait(3000);
		System.out.println("Level ADDED");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(2000);
		System.out.println("CREATED");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_add_documents")).click();
		cf.myWait(2000);
		System.out.println("clicked add Level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("CREATED 3");
		cf.myWait(3000);
		System.out.println("Level ADDED");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(2000);
		System.out.println("CREATED");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_upload_document")).click();
		cf.myWait(2000);
		System.out.println("clicked add Room");
		
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(2000);
		System.out.println("drop down");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"))
		.click();
		cf.myWait(2000);
		System.out.println("selected level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("room 1");
		cf.myWait(3000);
		System.out.println(" Room name added");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(3000);
		System.out.println("Room Created");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_upload_document")).click();
		cf.myWait(2000);
		System.out.println("clicked add Room");
		
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(2000);
		System.out.println("drop down");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"))
		.click();
		cf.myWait(2000);
		System.out.println("selected level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("room 2");
		cf.myWait(3000);
		System.out.println(" Room name added");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(3000);
		System.out.println("Room Created");
		
		driver.findElement(By.id("com.dki.dki:id/fab_open_camera")).click();
		cf.myWait(2000);
		System.out.println("clicked add button");
		
		driver.findElement(By.id("com.dki.dki:id/tv_upload_document")).click();
		cf.myWait(2000);
		System.out.println("clicked add Room");
		
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(2000);
		System.out.println("drop down");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"))
		.click();
		cf.myWait(2000);
		System.out.println("selected level");
		
		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("room 3");
		cf.myWait(3000);
		System.out.println(" Room name added");
		
		driver.findElement(By.id("com.dki.dki:id/btn_create")).click();
		cf.myWait(3000);
		System.out.println("Room Created");
		
		/*	driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton"))
				.click();
		cf.myWait(5000);
		System.out.println("Clicked add button");

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[11]/android.widget.LinearLayout/android.widget.TextView"))
				.click();

		cf.myWait(3000);
		System.out.println("ADDed level");

		driver.findElement(By.id("com.dki.dki:id/et_room_name")).sendKeys("level 1");

		
		 * driver.findElement(By.id("com.dki.dki:id/tv_client_address")).isDisplayed();
		 
		 driver.findElement(By.id("com.dki.dki:id/tv_contact_number")).isDisplayed();

		driver.findElement(By.id("com.dki.dki:id/tv_email_address")).isDisplayed();*/

		
	}
}
