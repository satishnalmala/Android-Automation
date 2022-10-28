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


public class Create_Job_Android  { 
	static AndroidDriver driver;

	@BeforeTest	
	public void setup() throws MalformedURLException
		{
		// Set the Desired Capabilities

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		//caps.setCapability("unicodeKeyboard","true");
		//caps.setCapability("resetKeyboard","true");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\DKI-Satish\\Downloads\\3.0A-08.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		}
	@SuppressWarnings("deprecation")
	@Test
	public void Testcase1_CreateJob() throws InterruptedException
	{
		CommonFunctions cf = new CommonFunctions(driver);

		cf.myWait(15000);

		cf.initialPermissions();
		cf.Login();
		
		// Create Job
		driver.findElement(By.id("com.dki.dki:id/fab_create_job")).click();
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/et_name")).sendKeys("testingAndroid");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_address")).sendKeys("2360 bristol circle");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_unit")).sendKeys("401");
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_city")).sendKeys("oakville");
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/sp_province")).click();//Provience
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[10]"))
				.click();
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_postal_code")).sendKeys("L6H6M5");
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/sp_country")).click();//Country
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"))
				.click();
		cf.myWait(3000);

		driver.findElement(By.id("com.dki.dki:id/et_email")).sendKeys("dkisatishnalmala1@gmail.com");

		driver.findElement(By.id("com.dki.dki:id/bt_add")).click();
		cf.myWait(3000);
		System.out.println("Create Job 1st Screen completed");

		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(3000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"))
				.click();
		cf.myWait(3000);
		// Phone no
		driver.findElement(By.id("com.dki.dki:id/et_phone")).sendKeys("2398729430");
		cf.myWait(3000);
		// Ext
		driver.findElement(By.id("com.dki.dki:id/et_ext")).sendKeys("+1");
		cf.myWait(3000);

		// Add Button
		driver.findElement(By.id("com.dki.dki:id/btn_add")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click();
		cf.myWait(3000);

		System.out.println("Add Phone popup completd");
		
		driver.findElement(By.id("com.dki.dki:id/btn_cpy_address")).click(); 
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click(); //Click Next
		cf.myWait(3000);
		
		// Add Button
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView")).click();
		cf.myWait(3000);
		//Step 3 claim Info
		
		//Emergency
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("android:id/button1")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/et_claim_no")).sendKeys("Q123987");
		cf.myWait(3000);
		//received from
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")).click();
		cf.myWait(3000);
		//Type of Work
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[4]/android.widget.TextView")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
		cf.myWait(3000);
		//CAT
		driver.findElement(By.id("com.dki.dki:id/rb_top_yes")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/et_cat_code")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/et_cat_code")).sendKeys("test123");
		cf.myWait(3000);
		
		driver.hideKeyboard();
		
		//Contacted
		driver.findElement(By.id("com.dki.dki:id/rb_bottom_yes")).click();
		cf.myWait(3000);
		//Next
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click();
		cf.myWait(3000);
		//Loss location
		
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/et_cause_of_loss")).sendKeys("Loss cause");
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/et_loss_description")).sendKeys("Loss description added");
		cf.myWait(3000);
		
		//Next
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click();
		cf.myWait(3000);
		
		
		System.out.println("Step 4 completed");		
		//Internal Staff
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/tv_name")).click();
		cf.myWait(3000);
				
		driver.findElement(By.id("com.dki.dki:id/ac_project_manager")).sendKeys("Sat");
		cf.myWait(3000);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(179,966)).release().perform();
//        touchAction.tap(PointOption.point(1280, 1013)).perform();

		/*
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		cf.myWait(3000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		*/
		//driver.longPressKey(67);
		/*
		WebElement dp_down = driver.findElement(By.id("com.dki.dki:id/ac_project_manager"));
		dp_down.sendKeys(Keys.ARROW_DOWN);
		cf.myWait(3000);
		System.out.println("Down");
		dp_down.sendKeys(Keys.RETURN);
		System.out.println("Enter");
		*/
		//driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Satish Nalmala')]")).click();
		//driver.findElement(By.xpath("//*[contains(@label,'Satish Nalmala)]")).click();
		
		
		
		//tech
		driver.findElement(By.id("com.dki.dki:id/ac_technicians")).click();
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/ac_technicians")).sendKeys("Sat");
		cf.myWait(3000);
		touchAction.press(PointOption.point(526,1330)).release().perform();
		cf.myWait(3000);
		//driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		//Other Staff
		driver.findElement(By.id("com.dki.dki:id/ac_other_staff")).click();
		cf.myWait(3000);
		driver.findElement(By.id("com.dki.dki:id/ac_other_staff")).sendKeys("Satish");
		cf.myWait(3000);
		touchAction.press(PointOption.point(504,1330)).release().perform();
		
			
		//Next
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click();
		cf.myWait(3000);
		
		System.out.println("Screen 5 complted");
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		cf.myWait(3000);
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView")).click();
		cf.myWait(3000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		cf.myWait(3000);
		
		driver.findElement(By.id("com.dki.dki:id/btn_next")).click();
		cf.myWait(3000);
			
		
	}
}

//driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
