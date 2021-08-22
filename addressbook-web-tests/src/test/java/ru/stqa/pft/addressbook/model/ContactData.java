package ru.stqa.pft.addressbook.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "addressbook")
public class ContactData {

  @Id
  @Column
  private int id;

  @Column(name = "firstname")
  private String firstname;

  @Column(name = "lastname")
  private String lastname;

  @Column(name = "home")
  @Type(type = "text")
  private String homePhone;

  @Column(name = "mobile")
  @Type(type = "text")
  private String mobilePhone;

  @Column(name = "work")
  @Type(type = "text")
  private String workPhone;

  @Transient
  private String allPhones;

  @Type(type = "text")
  private String address;

  @Type(type = "text")
  private String email;

  @Column (name = "photo")
  @Type(type = "text")
  private String photo;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "address_in_groups",
          joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
  private Set<GroupData> groups = new HashSet<GroupData>();

  public Groups getGroups() {
    return new Groups(groups);
  }

  public File getPhoto(){
    return new File(photo);
  }

  public ContactData withPhoto(File photo){
    this.photo = photo.getPath();
    return this;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withName(String name) {
    this.firstname = name;
    return this;
  }

  public ContactData withSurname(String surname) {
    this.lastname = surname;
    return this;
  }

  public ContactData withTelephone(String telephone) {
    this.homePhone = telephone;
    return this;
  }

  public ContactData withEmail(String email) {
    this.email = email;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return firstname;
  }

  public String getSurname() {
    return lastname;
  }

  public String getTelephone() {
    return homePhone;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", name='" + firstname + '\'' +
            ", surname='" + lastname + '\'' +
            ", homePhone='" + homePhone + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return id == that.id &&
            Objects.equals(firstname, that.firstname) &&
            Objects.equals(lastname, that.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstname, lastname);
  }
}
