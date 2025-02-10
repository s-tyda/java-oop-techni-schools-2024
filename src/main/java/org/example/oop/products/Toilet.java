package org.example.oop.products;

public class Toilet extends Product {
    public Toilet(double netto, int qty) {
        super("toilet", netto, qty);
        this.marza = 0.1;
        this.podatek = 1.19;
        this.brutto = this.netto * this.podatek;
    }

    @Override
    public String desc(int i) {
        if (i < this.ilosc) {return this.nazwa + " x " + this.ilosc;}
        else { return "trzeba dokupic wiecej " + this.nazwa + " z ikei";}
    }
}
