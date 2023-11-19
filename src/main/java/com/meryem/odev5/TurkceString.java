package com.meryem.odev5;

public class TurkceString {
    private String icerik;

    public TurkceString(String icerik) {
        this.icerik = icerik;
    }

    public char karakterAl(int index) {
        if (index < 0 || index >= icerik.length()) {
            throw new IndexOutOfBoundsException("Geçersiz indeks!");
        }
        return icerik.charAt(index);
    }

    public int indexBul(String karakter) {
        return icerik.indexOf(karakter);
    }

    public String altIfade(int baslangic, int bitis) {
        if (baslangic < 0 || bitis > icerik.length() || baslangic > bitis) {
            throw new IndexOutOfBoundsException("Geçersiz başlangıç veya bitiş değeri");
        }
        return icerik.substring(baslangic, bitis);
    }

    public static void main(String[] args) {
        TurkceString metin = new TurkceString("yarın sınav var");

        char karakter = metin.karakterAl(5);
        System.out.println("5. indeksteki karakter: " + karakter);

        int index = metin.indexBul("v");
        System.out.println("y karakterinin indeksi: " + index);

        String altMetin = metin.altIfade(7, 16);
        System.out.println("7 ile 16 arasındaki alt ifade: " + altMetin);
    }
}
