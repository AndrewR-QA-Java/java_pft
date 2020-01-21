package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test(enabled=false)
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    if (app.group().isThereAGroupForContact()) {
      app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "777333222", "email@email.com", "Pushkina street 1", "test1"), true);
    } else {
      app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "777333222", "email@email.com", "Pushkina street 1", null), true);
    }
    app.getContactHelper().submitContactCreation();
    app.goTo().gotoHomePage();
  }
}