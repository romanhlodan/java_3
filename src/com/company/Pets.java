package com.company;

public class Pets {
    private String klich;
    private int vik;

    public void gav(){
        System.out.println("Gav gav");
    }

    public void suk(){
        System.out.println("Suk suk");
    }

    public Pets() {
    }

    public Pets(String klich, int vik) {
        this.klich = klich;
        this.vik = vik;
    }

    public String getKlich() {
        return klich;
    }

    public void setKlich(String klich) {
        this.klich = klich;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "klich='" + klich + '\'' +
                ", vik=" + vik +
                '}';
    }
}
