package com.company;

public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota(2022, "200");
        System.out.println(toyota.getInfo());
        LCPrado lcPrado = new LCPrado(2021, 6, "150", "LIMITED EDITION");
        System.out.println(lcPrado.getInfo());
        LCPrado lcPrado1 = new LCPrado(2020, 4, "100", "SPORT");
        System.out.println(lcPrado1.getInfo());
    }
}
