package com.company;

public class Passport {
    private String series;
    private int numbers;
    private String view;

    public Passport() {
    }

    public Passport(String series, int numbers, String view) {
        this.series = series;
        this.numbers = numbers;
        this.view = view;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", numbers=" + numbers +
                ", view='" + view + '\'' +
                '}';
    }
}
