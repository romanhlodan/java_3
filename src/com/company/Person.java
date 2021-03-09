package com.company;

import java.util.Scanner;

public class Person {
    private String surname;
    private String name;
    private int age;
    public Pets pets;

    public void post(){
        System.out.println("Введіть логін і пароль");
        Scanner s = new Scanner(System.in);
       String login = s.nextLine();
       String password = s.nextLine();
       if (login.equals("root") && password.equals("root")){
           System.out.println("Ви залогіненні");
       }else {
           System.out.println("Невірні дані");
       }
    }

    public Person() {
    }

    public Person(String surname, String name, int age, String klich, int vik) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.pets = new Pets(klich,vik);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pets +
                '}';
    }
}
