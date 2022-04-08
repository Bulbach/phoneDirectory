package com.alex.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
@Entity(name = "human")
@Table(name = "humans")
public class Human {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lastname; // Фамилия
    @Column
    private String firstname;
    @Column
    private String city;
    @Column
    private String street;

    @OneToMany(mappedBy = "human",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Phone> phones;
    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthday;
    {
        phones = new ArrayList<>();
    }

    public Human() {
    }

    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getBithdayValue() {
        return this.birthday != null ? DATE_FORMAT.format(this.birthday) : "";
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phonenum) {
        this.phones = phonenum;
    }
    public void setPhones(Phone phone){
        phones.add(phone);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", phones=" + phones +
                ", birthday=" + birthday +
                '}';
    }
}
