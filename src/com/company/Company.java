package com.company;

import java.util.Arrays;

public class Company {
   private String name;
   private String depart [];
   private String stuff [];

    public Company() {
    }

    public Company(String name, String[] depart, String[] stuff) {
        this.name = name;
        this.depart = depart;
        this.stuff = stuff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepart() {
        return depart;
    }

    public void setDepart(String[] depart) {
        this.depart = depart;
    }

    public String[] getStuff() {
        return stuff;
    }

    public void setStuff(String[] stuff) {
        this.stuff = stuff;
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", depart=" + Arrays.toString(depart) +
                ", stuff=" + Arrays.toString(stuff) +
                '}';
    }
}
