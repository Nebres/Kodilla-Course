package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://nebres.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task Number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);
        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(2);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(2000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {

        final String TRELLO_URL = "https://trello.com/login";
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("serbenski@o2.pl");
        driverTrello.findElement(By.id("password")).sendKeys("Segment11@");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(4000);

        driverTrello.findElement(By.xpath("//div[@title=\"Things To Do\"]"))
                .click();
        Thread.sleep(4000);

        List<String> webTexts = driverTrello.findElements(By.xpath("//span"))
                .stream()
                .map(WebElement::getText)
                .filter(s -> s.contains(taskName))
                .collect(Collectors.toList());

        driverTrello.close();
        return webTexts.size() > 0;
    }


    private void deleteTestTaskFromCrud(String taskName) throws InterruptedException {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement buttonDeleteTask =
                            theForm.findElement(By.xpath(".//button[4]"));
                    buttonDeleteTask.click();
                });
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
       String taskName = createCrudAppTestTask();
       sendTestTaskToTrello(taskName);
       Assert.assertTrue(checkTaskExistsInTrello(taskName));
       deleteTestTaskFromCrud(taskName);
    }

}





