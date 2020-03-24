package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String name;
  private final String surname;
  private final String telephone;
  private final String email;
  private final String address;
  private String group;

  public ContactData(int id, String name, String surname, String telephone, String email, String address, String group) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.telephone = telephone;
    this.email = email;
    this.address = address;
    this.group = group;
  }

   public ContactData(String name, String surname, String telephone, String email, String address, String group) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.surname = surname;
    this.telephone = telephone;
    this.email = email;
    this.address = address;
    this.group = group;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
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

  public String getAddress() {
    return address;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(name, that.name) &&
            Objects.equals(surname, that.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            '}';
  }
}
