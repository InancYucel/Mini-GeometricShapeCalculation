package com.company;

public class Daire extends Sekil{

    private int yariCap;

    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {

        System.out.println(getIsim() + "in alanı " + (Math.PI * yariCap * yariCap));

    }


}
