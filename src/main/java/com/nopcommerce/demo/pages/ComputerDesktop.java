package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
//1.Test name verifyProductArrangeInAlphaBaticalOrder()
//	1.1 Click on Computer Menu.
//	1.2 Click on Desktop
public class ComputerDesktop extends Utility {


    public void hoveroncomputer() throws InterruptedException {

        mouseHoverToElement(By.xpath("//div[@class='header-menu']/child::ul[@class='top-menu notmobile']/child::li[1]"));
        clickonelement(By.xpath("//div[@class='header-menu']/ul[1]/child::li[1]/ul[1]/li[1]"));

    }

}
