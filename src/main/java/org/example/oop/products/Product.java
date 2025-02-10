package org.example.oop.products;

// s_tyda

abstract class Product {
    protected String nazwa;
    protected double netto;
    protected double brutto;
    protected double podatek;
    protected double marza;
    protected int ilosc;

    public Product (String nazwa, double netto, int ilosc) {
        this.nazwa = nazwa;
        this.netto = netto;
        this.ilosc = ilosc;
    }

    public abstract String desc(int i);
    public double total() {
        return this.brutto * (1 + this.marza) * this.ilosc;
    }

    public boolean sell(int i) {
        if (i <= this.ilosc){
            this.ilosc -= i;
            return true;
        }
        return false;
    }

    public static double wartoscProduktow(Product[] products) {
        double suma = 0;
        for (Product p:products) {
            suma += p.total();
        }
        return suma;
    }
}
