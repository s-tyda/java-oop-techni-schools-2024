package org.example.oop.products;

public class Bread extends Product{

    public Bread(String nazwa, double netto, int ilosc) {
        super(nazwa, netto, ilosc);
        this.podatek = 1.05;
        this.marza = 0.1;
        this.brutto = this.netto * this.podatek;
    }

    public String desc(int i) {
        if (i < this.ilosc) {
            return this.nazwa + "piekarnia";
        }
        return "";
    }

}
