package com.company;

public class Abiturient {
    private int id;
    private String FIO,
            adress,
            telefon,
            ocenki;
    public Abiturient() {
    }
    public int getId() {
        return id;
    }
    public String getFIO() {
        return FIO;
    }
    public String getAdress() {
        return adress;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getOcenki() {
        return ocenki;
    }
    public Abiturient(int ID, String FIO, String adress, String telefon, String ocenki) {
        this.id = id;
        this.FIO = FIO;
        this.adress = adress;
        this.telefon = telefon;
        this.ocenki = ocenki;
    }
    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", adress='" + adress + '\'' +
                ", telefon='" + telefon + '\'' +
                ", ocenki='" + ocenki + '\'' +

                '}';
    }
}