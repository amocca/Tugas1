package Latihan2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan buah = new Makanan();
        buah.setNamaHidangan("Buah Naga");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        breakfast.setKonsumsi(buah, air);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Kuning");
        Minuman jus =  new Minuman();
        jus.setNamaHidangan("Jus Wortel");
        lunch.setKonsumsi(nasi, jus);
        listKonsumsi.add(lunch);

        System.out.println("Menu Yang Dikonsumsi Hari ini!");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }

    }
}
