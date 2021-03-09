package com.company;

public class Application{
    private int number;
    private String data;
    Client client;

    public Application() {
    }

    public Application(int number, String data, Client client) {
        this.number = number;
        this.data = data;
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Application{" +
                "number=" + number +
                ", data='" + data + '\'' +
                ", client=" + client +
                '}';
    }
}
