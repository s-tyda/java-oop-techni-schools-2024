package org.example.oop.products;

public class Milk extends Product{

    public Milk(String nazwa, double netto, int ilosc) {
        super(nazwa, netto, ilosc);
        this.marza = 0.1;
        this.podatek = 1.05;
        this.brutto = this.netto * this.podatek;
    }

    @Override
    public String desc(int i) {
        if (i < this.ilosc) {
            return nazwa + "X" + ilosc;
        } else {
            return "potrzebna dostawa" + this.nazwa;
        }
    }
}
