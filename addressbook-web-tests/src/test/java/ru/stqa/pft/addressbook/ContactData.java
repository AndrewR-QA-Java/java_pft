package ru.stqa.pft.addressbook;

public class ContactData {
  private final String name;
  private final String surname;
  private final String telephone;
  private final String email;

  public ContactData(String name, String surname, String telephone, String email) {
    this.name = name;
    this.surname = surname;
    this.telephone = telephone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getEmail() {
    return email;
  }
}
