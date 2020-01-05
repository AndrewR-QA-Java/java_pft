package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessibilityHelper01 extends HelperBase01 {

  public AccessibilityHelper01(WebDriver wd) {
    super(wd);
  }

  public void fillSearchRequest(String query) {
    type(By.cssSelector("input[name=\'q\']"), query);
  }

  public void submitSearchRequest() {
    sendKeyToElement(By.cssSelector("input[name=\'q\']"), Keys.ENTER);
  }

  public void selectFirstResult() {
    click(By.xpath("//*/text()[normalize-space(.)='Topdanmark Forsikring og Pension']/parent::*"));
  }

  public void validateTheResult(String validation_string) {
    Assert.assertEquals(wd.findElement(By.xpath("(//a[contains(@href, 'https://mit.topdanmark.dk/forside')])[2]")).getText(), validation_string);
  }
}
