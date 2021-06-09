package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerDesktop;
import com.nopcommerce.demo.pages.SortingByPosition;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickOnHomePage extends TestBase {

ComputerDesktop computerDesktop = new ComputerDesktop();
SortingByPosition sortingByPosition = new SortingByPosition();
@Test
////1.Test name verifyProductArrangeInAlphaBaticalOrder()
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
    computerDesktop.hoveroncomputer();
    sortingByPosition.clickonsort();
    String expectedMessage = "Name: Z to A";
    String actualMessage = sortingByPosition.gettextfromelemrnt(By.xpath("//div[@class='products-container']/parent::div[1]/div[1]/div[2]/select/option[3]"));
    Assert.assertEquals(actualMessage,expectedMessage);


}
}