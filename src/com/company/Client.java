package com.company;

public class Client{
    private String surname;
    private String name;
    private String birthday;
    Passport passport;

    public Client() {
    }

    public Client(String surname, String name, String birthday) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
    }

    public Client(String surname, String name, String birthday, Passport passport) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.passport = passport;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", passport=" + passport +
                '}';
    }
}
