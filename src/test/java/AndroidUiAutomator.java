import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidUiAutomator {

        public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionUsingOptions.initializeDriver();

            WebElement myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
            System.out.println(myElement.getText());

            myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(2);
            System.out.println(myElement.getText());

            myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Accessibility\")"));
            System.out.println(myElement.getText());

            myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).get(1);
            System.out.println(myElement.getText());




//        WebElement myElement = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
//        System.out.println(myElement.getText());
//
//        myElement = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
//        System.out.println(myElement.getText());
//
//        myElement = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
//        System.out.println(myElement.getText());
//
//        myElement = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
//        System.out.println(myElement.getText());
//
//        myElement = driver.findElement(AppiumBy.xpath("//*[@text=\"Accessibility\"]"));
//        System.out.println(myElement.getText());

    }

}
