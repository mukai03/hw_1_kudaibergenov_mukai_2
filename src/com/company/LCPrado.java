package com.company;

public final class LCPrado extends Toyota{
    private String series;

    public LCPrado(int year, String name, String series) {
        super(year, name);
        this.series = series;
    }

    public LCPrado(int year, int volume, String name, String series) {
        super(year, volume, name);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nSERIES: " + getSeries();
    }
}
