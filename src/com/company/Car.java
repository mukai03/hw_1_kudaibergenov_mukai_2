package com.company;

public class Car {
    private int year;
    private int volume;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, int volume) {
        this.year = year;
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }
}
