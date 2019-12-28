package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String surname;
  private final String telephone;
  private final String email;
  private final String address;

  public ContactData(String name, String surname, String telephone, String email, String address) {
    this.name = name;
    this.surname = surname;
    this.telephone = telephone;
    this.email = email;
    this.address = address;
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

  public String getEmail() { return email; }

  public String getAddress() { return address; }
}
