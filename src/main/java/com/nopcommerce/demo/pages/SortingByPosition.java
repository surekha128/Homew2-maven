package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

//1.3 Select Sort By position "Name: Z to A"
//	1.4 Verify the Product will arrange in Descending order.
public class SortingByPosition extends Utility {

    public void clickonsort() throws InterruptedException {
       clickonelement(By.id("products-orderby"));
       clickonelement(By.xpath("//div[@class='product-sorting']/select/child::option[3]"));

    }

}
