package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) {
    super(wd);
  }

  public void login(String usermame, String password) {
    type(By.name("user"), usermame);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
    click(By.cssSelector("input[type=\"submit\"]"));
  }
}