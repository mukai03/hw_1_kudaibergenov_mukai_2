package com.company;

public class Toyota extends Car{
    private String name;

    private Toyota(String name) {
        this.name = name;
    }

    public Toyota(int year, String name) {
        super(year);
        this.name = name;
    }

    public Toyota(int year, int volume, String name) {
        super(year, volume);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return "YEAR: " + getYear() +
                "\nNAME: " + getName();
    }

}
