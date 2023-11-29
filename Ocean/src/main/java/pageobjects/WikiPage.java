package pageobjects;

import org.openqa.selenium.By;
import resuable.BrowserInvocation;

public class WikiPage extends BrowserInvocation {


    public static String getSpeValue(int rowIndex, int columnIndex){

      String value=  driver.findElement(By.xpath("//table[@class='wikitable']/tbody/tr["+rowIndex+"]/td["+columnIndex+"]")).getText();

      return value;

    }

    public static String getRowValue(String name){

      return  driver.findElement(By.xpath("//table[@class='wikitable']/tbody/tr/td[normalize-space(text())='"+name+"']/following-sibling::td")).getText();
    }

    public static String getColunValue(int columnIndex){

       return driver.findElement(By.xpath("//table[@class='wikitable']/tbody/tr/td["+columnIndex+"]")).getText();
    }


}
