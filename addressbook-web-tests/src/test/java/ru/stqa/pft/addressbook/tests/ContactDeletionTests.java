package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

  @Test(enabled = false)
  public void testContactDeletion() throws Exception {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("ivan", "ivanov", null, null, null, "test1"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
//    app.getContactHelper().selectContact(before.size()-1);
//    app.getContactHelper().deleteSelectedContacts();
//    app.getContactHelper().returnToHomePage();
//    List<ContactData> after = app.getContactHelper().getContactList();
//    Assert.assertEquals(after.size(), before.size() - 1);
//
//    before.remove(before.size() - 1);
//    Assert.assertEquals(before, after);
  }
}
