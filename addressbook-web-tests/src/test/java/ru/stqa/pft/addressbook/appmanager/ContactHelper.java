package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.ContactData;
import static org.testng.Assert.*;

public class ContactHelper extends HelperBase {

  public ContactHelper(ChromeDriver wd) {
    super(wd);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getSurname());
    type(By.name("home"), contactData.getTelephone());
    type(By.name("email"), contactData.getEmail());
    type(By.name("address"), contactData.getAddress());
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Record successful deleted'])"));
  }
}

