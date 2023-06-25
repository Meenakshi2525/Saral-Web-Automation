package factory;

import org.openqa.selenium.*;

public class ExceptionHandler {

    private static final int MAX_RETRIES = 3;

    public static void clickElementWithRetry(WebElement element) {
        int retries = 0;
        boolean clicked = false;

        while (retries < MAX_RETRIES && !clicked) {
            try {
                element.click();
                clicked = true;
            } catch (ElementClickInterceptedException | NoSuchElementException e) {
                System.out.println("Exception occurred: " + e.getMessage());
                retries++;
            }
        }

        if (!clicked) {
            System.out.println("Failed to click element after " + MAX_RETRIES + " retries");
        }
    }


}
