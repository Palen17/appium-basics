import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSessionUsingOptions {

    public static AppiumDriver initializeDriver() throws Exception {

        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +  File.separator + "resources" +  File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Pixel_7")
                .setAutomationName("uiautomator2")
                .setApp(appUrl)
                //.setAppPackage("io.appium.android.apis")
                //.setAppActivity("io.appium.android.apis.accessibility.CustomViewAccessibilityActivity")
                .setAvd("Pixel_7")
                .setAvdLaunchTimeout(Duration.ofSeconds(2000))
                .setUnlockType("pin")
                .setUnlockKey("1111");

        URL url = new URL("http://0.0.0.0:4723");

        return new AndroidDriver(url, options);

    }
}
