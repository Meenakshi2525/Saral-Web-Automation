package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WardPageObjects {

    WebDriver driver;
    By wardAddEntryButton = By.xpath("(//h5[text()='Ward']/following::button[contains(., 'Add Entry')])[1]");

    By wardFilters = By.xpath("//div[@class='ng-value-container']");





    public WardPageObjects(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getWardAddEntryEle(){
        return driver.findElement(wardAddEntryButton);
    }

    public List<WebElement> getWardFilterEles(){
       return  driver.findElements(wardFilters);
    }

    public WebElement getSelectStateEle(String stateName){
        return driver.findElement(By.xpath("//div[contains(text(),'" + stateName + "')]"));

    }

    public WebElement getULBTypeEle(String ULBName){
        return driver.findElement(By.xpath("//div[contains(text(),'" + ULBName + "')]"));
    }

    public WebElement getAdministrativeDistrictEle(String ADName){
        return driver.findElement(By.xpath("//div[contains(text(),'" + ADName + "')]"));
    }

    public WebElement getLocalBodyEle(String localBodyName){
        return driver.findElement(By.xpath("//div[contains(text(),'" + localBodyName + "')]"));
    }

    public WebElement getWardEle(String wardName){
        return driver.findElement(By.xpath("//div[contains(text(),'" + wardName + "')]"));
    }

    public WebElement getOrganisationUnitEle(String organisationUnitName){
        return driver.findElement(By.xpath("(//div[contains(text(),'" + organisationUnitName + "')])[2]"));

    }

    public WebElement getOrganisationSubUnitEle(String organisationSubUnitName){
        return driver.findElement(By.xpath("(//div[contains(text(),'" + organisationSubUnitName + "')])[2]"));

    }


}
