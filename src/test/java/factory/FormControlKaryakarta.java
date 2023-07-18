package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;
import resources.SangathanPageObjects;

import javax.management.relation.Relation;

public class FormControlKaryakarta {

    static WebDriver driver;
    static JavascriptExecutor js;
    static WebDriverWait wait, wait2;
    static NgWebDriver ngDriver;
    static ElementUtils elementUtils;
    static WaitUtils load_wait;

    static SangathanPageObjects sangathanPageObjects;

    public static void main(String[] args) throws InterruptedException {


    }

    public FormControlKaryakarta(WebDriver driver) {

        elementUtils = new ElementUtils(driver);
    }

    public static void enterName(String name) {

        driver = DriverFactory.getDriver();

        // creating object for loading web page.
        load_wait = new WaitUtils();

        sangathanPageObjects = new SangathanPageObjects(driver);
        // Name WebElement....
        WebElement nameEle = sangathanPageObjects.getNameEle();
        nameEle.clear();
        nameEle.sendKeys(name);
    }

    public static void getEnteredName(){

    }



    public static void enterRelationName(String relationName) {

        // Relation Name WebElement....
        WebElement relationNameEle = sangathanPageObjects.getFatherNameEle();
        relationNameEle.clear();
        relationNameEle.sendKeys(relationName);
        // elementUtils.typeTextIntoElement(relationNameEle, relationName, 10);

    }

    public static void getEnteredRelationName(){

    }

    public static void clickOnDesignation() {

        // designation WebElement....
        WebElement designationEle = sangathanPageObjects.getDesignationClickEle();
        js = (JavascriptExecutor) driver;

        ExceptionHandler.clickElementWithRetry(designationEle);

        load_wait.waitForPageLoad();
        //elementUtils.clickOnElement(designationEle, 10);

    }

    public static void selectDesignation(String designation) {

        // designation value WebElement....
        WebElement selectDesignationNameEle = driver
                .findElement(By.xpath("//div//span[contains(text(),'" + designation + "')]"));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", selectDesignationNameEle);

    }

    public static void getSelectedDesignation(){

    }

    public static void clickOnHasSmartPhone() {

        // has smart phone WebElement....
        WebElement hasSmartPhone = driver.findElement(By.xpath("//*[contains(text(),'Has Smartphone')]"));
        js = (JavascriptExecutor) driver;
        hasSmartPhone.click();
        load_wait.waitForPageLoad();

    }

    public static void selectHasSmartPhone(String hasSmartPhone) {

        // has smart phone value WebElement....
        WebElement HasSmartPhoneValueEle = driver
                .findElement(By.xpath("//div//span[contains(text(),'" + hasSmartPhone + "')]"));
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", HasSmartPhoneValueEle);

    }

    public static void getSelectedHasSmartPhone(){

    }

    public static void enterPrimaryMemberId(String primaryMemberId) {
        // primary member id webElement...
        WebElement PrimaryMemberIdEle = driver.findElement(By.xpath("//input[@placeholder='Primary Member Id']"));
        PrimaryMemberIdEle.sendKeys(primaryMemberId);

    }

    public static void getEnteredPrimaryMemberId(){

    }

    public static void enterAge(String age) {

        // age WebElement....
        WebElement AgeEle = driver.findElement(By.xpath("//input[@placeholder='Age']"));
        AgeEle.sendKeys(age);
    }

    public static void getEnteredAge(){

    }


    public static void enterDob(String dob) {

        // dob WebElement....
        WebElement dobEle = driver.findElement(By.xpath("//input[@data-placeholder='Dob']"));
        dobEle.sendKeys(dob);

    }

    public static String getEnteredDob() {

        // get karyakarta dob......
        WebElement dobEle = driver.findElement(By.xpath("//input[@data-placeholder='Dob']"));
        String copiedDobAfterEnteredAge = dobEle.getAttribute("value");
        return copiedDobAfterEnteredAge;

    }

    public static void enterBloodGroup(String bloodGroup) {

        // blood group WebElement....
        WebElement BloodGroupEle = sangathanPageObjects.getbloodGroupEle();
        BloodGroupEle.sendKeys(bloodGroup);

    }

    public static void getEnteredBloodGroup(){

    }

    public static void enterPhoneNumber(String phoneNumber) {

        // phone number WebElement....
        // Phone Number
        WebElement PhoneNumberEle = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
        PhoneNumberEle.clear();
        PhoneNumberEle.sendKeys(phoneNumber);

    }

    public static void getEnteredPhoneNumber(){

    }

    public static void clickOnEnterMoreDetailsButton() {

        WebElement extraDetailsClickEle = sangathanPageObjects.getExtraDetailsEle();
        ExceptionHandler.clickElementWithRetry(extraDetailsClickEle);

    }

    public static void enterEmail(String email) {

        WebElement emailEle = sangathanPageObjects.getEmailEle();
        emailEle.clear();
        emailEle.sendKeys(email);

    }

    public static void getEnteredEmail(){

    }

    public static void selectGender(String gender) throws InterruptedException {

        String selectGender;
        if (gender.equals("Male") || gender.equals("Female")) {
            selectGender = gender.toLowerCase();
        } else {
            // make Other to others
            selectGender = gender.toLowerCase() + "s";
        }
        WebElement genderEle = driver.findElement(By.xpath("//input[@value='" + selectGender + "']"));
        WebElement genderLevelTxt = driver.findElement(By.xpath("//label[contains(text(),'Gender')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", genderLevelTxt);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", genderEle);


    }

    public static void getSelectedGender(){

    }

    public static void enterWhatsAppNumber(String whatsAppNumber) {

        WebElement whatsAppNumberEle = sangathanPageObjects.getWhatsAppNumber();
        whatsAppNumberEle.clear();
        whatsAppNumberEle.sendKeys(whatsAppNumber);
    }

    public static void getEnteredWhatsAppNumber(){

    }

    public static void enterKaryakartaDOB() {
        WebElement dobEle = sangathanPageObjects.getDOBEle();
        dobEle.sendKeys();

    }



    public static void enterSTDCode(String stdCode) {
        WebElement stdCodeEle = sangathanPageObjects.getSTDCodeEle();
        stdCodeEle.clear();
        stdCodeEle.sendKeys(stdCode);

    }

    public static void enterLandlineNumber(String landlineNumber) {
        WebElement landlineEle = sangathanPageObjects.getLandlineEle();
        landlineEle.clear();
        landlineEle.sendKeys(landlineNumber);

    }

    public static void clickOnCategory() {
        WebElement selectCategoryEle = sangathanPageObjects.getSelectCategoryEle();
        ExceptionHandler.clickElementWithRetry(selectCategoryEle);
    }

    public static void selectCategory() {


    }

    public static void clickOnCaste() {


    }

    public static void selectCaste() {

    }


    public static void enterFullAddress(String fullAddress) {
        WebElement fullAddressEle = sangathanPageObjects.getFullAddressEle();
        fullAddressEle.clear();
        fullAddressEle.sendKeys(fullAddress);
    }

    public static void enterVillage(String village) {
        WebElement villageEle = sangathanPageObjects.getVillageEle();
        villageEle.clear();
        villageEle.sendKeys(village);

    }

    public static void enterTaluka(String taluka) {
        WebElement talukaEle = sangathanPageObjects.getTaluka_Tehsil_Ele();
        talukaEle.clear();
        talukaEle.sendKeys(taluka);
    }

    public static void clickOnDistrict() {
        WebElement clickDistrictEle = sangathanPageObjects.getSelectDistrictEle();
        ExceptionHandler.clickElementWithRetry(clickDistrictEle);
    }

    public static void selectDistrict(String district) {
        WebElement selectDistrictEle = sangathanPageObjects.getDistrictValueEle(district);
        ExceptionHandler.clickElementWithRetry(selectDistrictEle);
    }

    public static void enterPinCode(String pinCode) {

        WebElement pincodeEle = sangathanPageObjects.getPincodeEle();
        pincodeEle.sendKeys(pinCode);
    }

    public static void clickOnEducation() {

        WebElement selectEducationEle = sangathanPageObjects.getSelectEducationEle();
        ExceptionHandler.clickElementWithRetry(selectEducationEle);

    }

    public static void selectEducation(String education) {

        WebElement EducationValueEle = sangathanPageObjects.getEducationValueEle(education);
        js.executeScript("arguments[0].click();", EducationValueEle);
        load_wait.waitForPageLoad();


    }

    public static void clickOnProfession() {

        WebElement selectProfessionEle = sangathanPageObjects.getSelectProfessionEle();
        ExceptionHandler.clickElementWithRetry(selectProfessionEle);

    }

    public static void selectProfession(String profession) {

        WebElement ProfessionValueEle = sangathanPageObjects.getProfessionValueEle(profession);
        js.executeScript("arguments[0].click();", ProfessionValueEle);
        load_wait.waitForPageLoad();

    }

    public static void clickOnHasBike() {

        WebElement BikeEle = sangathanPageObjects.getSelectBikeEle();
        BikeEle.click();

    }

    public static void selectHasBike(String bike) {


        WebElement bikeValueEle = null;
        // Select yes or no for bike
        if (bike.equals("Yes")) {
            bikeValueEle = driver.findElements(By.className("ng-option-label")).get(0);
        } else {
            bikeValueEle = driver.findElements(By.className("ng-option-label")).get(1);
        }
        js.executeScript("arguments[0].click();", bikeValueEle);
        load_wait.waitForPageLoad();

    }

    public static void clickOnHasCar() {

        WebElement CarEle = sangathanPageObjects.getSelectCarEle();
        CarEle.click();

    }

    public static void selectHasCar(String car) {

        WebElement carValueEle = null;
        if (car.equals("Yes")) {
            carValueEle = driver.findElements(By.className("ng-option-label")).get(0);
        } else {
            carValueEle = driver.findElements(By.className("ng-option-label")).get(1);
        }
        js.executeScript("arguments[0].click();", carValueEle);
        load_wait.waitForPageLoad();

    }

    public static void clickOnVidhanSabhaHeSheVotes() {

        WebElement VidhanSabhawhereHe_SheVotesEle = sangathanPageObjects.getSelectVidhanSabhaWhereHeSheVotesEle();
        VidhanSabhawhereHe_SheVotesEle.click();

    }

    public static void selectVidhanSabhaHeSheVotes(String vidhanSabha) {

        WebElement VidhanSabhawhereHe_SheVotesValueEle = sangathanPageObjects.getVidhanSabhaWhereHeSheVotesValueEle(vidhanSabha);
        js.executeScript("arguments[0].click();", VidhanSabhawhereHe_SheVotesValueEle);
        load_wait.waitForPageLoad();

    }

    public static void enterBoothWhereHeSheVotes(String boothWhereHeSheVotes) {

        WebElement BoothwhereHe_SheVotesValueEle = sangathanPageObjects.getBoothWhereHeSheVotesEle();
        BoothwhereHe_SheVotesValueEle.clear();
        BoothwhereHe_SheVotesValueEle.sendKeys(boothWhereHeSheVotes);

    }

    public static void enterVoterId(String voterId) {

        WebElement voterIdValueEle = driver.findElement(By.xpath("//input[contains(@placeholder, 'ex. UTC026351')]"));
        voterIdValueEle.sendKeys(voterId);

    }

    public static void enterAadharNumber(String aadharNumber) {

        //Aadhar Number WebElement..
        WebElement AadhaarNumberEle = sangathanPageObjects.getAadharNumberEle();
        AadhaarNumberEle.clear();
        AadhaarNumberEle.sendKeys(aadharNumber);

    }

    public static void enterPannaNumber(String pannaNumber) {

        WebElement PannaNumberEle = sangathanPageObjects.getPannaNumberEle();
        PannaNumberEle.clear();
        PannaNumberEle.sendKeys(pannaNumber);



    }

    public static void enterRationCardNumber(String rationCardNumber) {

        WebElement RationCardNumberEle = sangathanPageObjects.getRationCardNumber();
        RationCardNumberEle.sendKeys(rationCardNumber);

    }

    public static void enterFacebookProfile(String facebookProfile) {

        WebElement FacebookProfileEle = sangathanPageObjects.getFacebookProfileEle();
        FacebookProfileEle.sendKeys(facebookProfile);
    }

    public static void enterTwitterProfile(String twitterProfile) {

        WebElement TwitterProfileEle = sangathanPageObjects.getTwitterProfileEle();
        TwitterProfileEle.sendKeys(twitterProfile);

    }

    public static void enterInstagramProfile(String instagramProfile) {

        WebElement InstagramProfileEle = sangathanPageObjects.getInstagramProfileEle();
        InstagramProfileEle.sendKeys(instagramProfile);

    }

    public static void enterLinkedinProfile(String linkedinProfile) {

        WebElement LinkedInProfileEle = sangathanPageObjects.getLinkedinProfileEle();
        LinkedInProfileEle.sendKeys(linkedinProfile);

    }

    public static void uploadImage(String image) {

        WebElement photoEle = sangathanPageObjects.getPhotoEle();
        photoEle.sendKeys(image);



    }

    public static void clickOnSalutation() {

        WebElement SalutationEle = sangathanPageObjects.getSelectSalutationEle().get(1);
        ExceptionHandler.clickElementWithRetry(SalutationEle);

    }

    public static void selectSalutation(String salutation) {

        WebElement salutationValueEle = sangathanPageObjects.getSalutationValueEle(salutation);
        js.executeScript("arguments[0].click();", salutationValueEle);

    }

    public static void enterSubCaste(String subCaste) {

        WebElement SubCasteEle = sangathanPageObjects.getSubCasteEle();
        SubCasteEle.sendKeys(subCaste);

    }

    public static void enterQualification(String qualification) {

        WebElement QualificationEle = sangathanPageObjects.getQualificationEle();
        QualificationEle.sendKeys(qualification);

    }

    public static void clickOnReligion() {

        WebElement ReligionEle = sangathanPageObjects.getReligionEle().get(1);
        ExceptionHandler.clickElementWithRetry(ReligionEle);


    }

    public static void selectReligion(String religion) {

        WebElement ReligionEleValueEle = sangathanPageObjects.getReligionValueEle(religion);
        js.executeScript("arguments[0].click();", ReligionEleValueEle);

    }

    public static void enterActiveMemberId(String activeMemberId) {

        WebElement ActiveMemberIdValueEle = sangathanPageObjects.getActiveMemberIDEle();
        ActiveMemberIdValueEle.sendKeys(activeMemberId);

    }

    public static void clickOnPartyZila() {

    }

    public static void selectPartyZila() {

    }

    public static void clickOnPartyMandal() {

    }

    public static void selectPartyMandal() {

    }

    public static void clickOnAddEntryButton(){
        WebElement addButtonEle = sangathanPageObjects.getAddButtonEle();
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addButtonEle);
    }



}
