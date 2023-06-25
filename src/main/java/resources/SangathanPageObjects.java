
package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SangathanPageObjects {

    WebDriver driver;

//    public WardPageObject(WebDriver driver) {
//        driver = this.driver;
//    }

    By SangathanDataEntryEle = By.className("data-entry-card-titles");

    By karyakartaDataLevelText = By.xpath("//mat-card-content//div/h5");

    By searchButton = By.xpath("//button[@color='primary']/child::span[contains(text(),'Search')]");

    By extraDetails = By.xpath("");

    By nameEle = By.xpath("//input[@placeholder='Name']");

    By fatherNameEle = By.xpath("");


    public SangathanPageObjects(WebDriver driver) {

        this.driver = driver;

    }

    public List<WebElement> getSangathanDataEntryEle() {
        return driver.findElements(SangathanDataEntryEle);
    }

    public List<WebElement> getKaryakartaDataLevelText() {
        return driver.findElements(karyakartaDataLevelText);
    }

    public WebElement getSearchButtonEle(){
        return driver.findElement(searchButton);
    }
    public WebElement getExtraDetailsEle(){
        return driver.findElement(extraDetails);
    }

    public WebElement getNameEle() {
        return driver.findElement(nameEle);
    }


}
