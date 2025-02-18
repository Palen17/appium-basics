import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionUsingOptions.initializeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By alertViews = AppiumBy.accessibilityId("Accessibility");

        wait.until(ExpectedConditions.visibilityOfElementLocated(alertViews)).click();

        //driver.findElement(alertViews).click();

    }

}
