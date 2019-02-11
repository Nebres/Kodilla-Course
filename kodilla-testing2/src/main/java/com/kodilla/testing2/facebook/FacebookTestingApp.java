package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FIRSTNAME_INPUT = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\")" +
            "and (@name=\"firstname\")]";
    public static final String XPATH_LASTNAME_INPUT = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\")" +
            "and (@name=\"lastname\")]";
    public static final String XPATH_EMAIL_INPUT = "//input[contains(@class, \"inputtext _58mg _5dba _2ph-\")" +
            "and (@name=\"reg_email__\")]";
    public static final String XPATH_WAIT_FOR = "//span[contains(@class, \"_5k_4\")]";
    public static final String SELECT_DAY_INPUT = "//select[contains(@id, \"day\")]";
    public static final String SELECT_MONTH_INPUT = "//select[contains(@id, \"month\")]";
    public static final String SELECT_YEAR_INPUT = "//select[contains(@id, \"year\")]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://pl-pl.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME_INPUT));
        firstnameField.sendKeys("Przemek");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME_INPUT));
        lastnameField.sendKeys("Serbeński");

        WebElement emailField = driver.findElement(By.xpath(XPATH_EMAIL_INPUT));
        emailField.sendKeys("email@mail.com.pl");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDayField = driver.findElement(By.xpath(SELECT_DAY_INPUT));
        Select selectDay = new Select(selectDayField);
        selectDay.selectByValue("12");

        WebElement selectMonthField = driver.findElement(By.xpath(SELECT_MONTH_INPUT));
        Select selectMonth = new Select(selectMonthField);
        selectMonth.selectByValue("2");

        WebElement selectYearField = driver.findElement(By.xpath(SELECT_YEAR_INPUT));
        Select selectYear = new Select(selectYearField);
        selectYear.selectByValue("1984");
    }

}
