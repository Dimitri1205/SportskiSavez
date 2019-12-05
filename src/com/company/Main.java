package com.company;

import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;
import osoblje.Zaposleni;
import savez.SportskoDrustvo;
import tim.Tim;

public class Main {

    public static void main(String[] args) {

        Igrac i1 = new Igrac("Milos", "Mitrovic", "Napadac");
        Igrac i2 = new Igrac("Dragan", "Pavlovic", "Odbrana");
        Igrac i3 = new Igrac("Nikola", "Jankovic", "Napadac");
        Igrac i4 = new Igrac("Zoran", "Milenkovic", "Odbrana");
        Igrac i5 = new Igrac("Igor", "Miletic", "Vezni igrac");

        Igrac i6 = new Igrac("Janko", "Mitrovic", "Napadac");
        Igrac i7 = new Igrac("Marko", "Petrovic", "Krilo");
        Igrac i8 = new Igrac("Petar", "Milosevic", "Napadac");
        Igrac i9 = new Igrac("Nebojsa", "Ilijev", "Odbrana");
        Igrac i10 = new Igrac("Vukasin", "Jacimovic", "Bek");

        Igrac i11 = new Igrac("Pavle", "Mitrovic", "Napadac");
        Igrac i12 = new Igrac("Djura", "Kovacevic", "Napadac");
        Igrac i13 = new Igrac("Milos", "Miokovic", "Bek");
        Igrac i14 = new Igrac("Ognjen", "Petrovic", "Bek");
        Igrac i15 = new Igrac("Zarko", "Milcic", "Odbrana");

        Trener t1 = new Trener("Milos", "Nikolic", "Glavni trener");
        Trener t2 = new Trener("Boban", "Pavlovic", "Pomocni trener");
        Trener t3 = new Trener("Milos", "Nikolic", "Tehnicki trener");

        Trener t4 = new Trener("Nikola", "Markovic", "Pomocni trener");
        Trener t5 = new Trener("Jovica", "Arandjelovic", "Glavni trener");
        Trener t6 = new Trener("Petar", "Abramovic", "Zamenski trener");

        Trener t7 = new Trener("Zoran", "Nikolic", "Glavni trener");
        Trener t8 = new Trener("Petar", "Krstic", "Pomocni trener");
        Trener t9 = new Trener("Jovan", "Jovanovic", "Dodatni trener");

        Menadzer m1 = new Menadzer("Nenad", "Krstic");
        Menadzer m2 = new Menadzer("Djuradj", "Ostojic");
        Menadzer m3 = new Menadzer("Jovan", "Pavlovic");

        Tim tim1 = new Tim("Tim1");
        Tim tim2 = new Tim("Tim2");
        Tim tim3 = new Tim("Tim3");

        SportskoDrustvo s1 = new SportskoDrustvo("Sportsko udruzenje", "Adresa Udruzenja");

        tim1.dodajIgraca(i1);
        tim1.dodajIgraca(i2);
        tim1.dodajIgraca(i3);
        tim1.dodajIgraca(i4);
        tim1.dodajIgraca(i5);

        tim1.dodajTrenera(t1);
        tim1.dodajTrenera(t2);
        tim1.dodajTrenera(t3);

        tim1.dodajMenadzera(m1);


        tim2.dodajIgraca(i6);
        tim2.dodajIgraca(i7);
        tim2.dodajIgraca(i8);
        tim2.dodajIgraca(i9);
        tim2.dodajIgraca(i10);

        tim2.dodajTrenera(t4);
        tim2.dodajTrenera(t5);
        tim2.dodajTrenera(t6);

        tim2.dodajMenadzera(m2);


        tim3.dodajIgraca(i11);
        tim3.dodajIgraca(i12);
        tim3.dodajIgraca(i13);
        tim3.dodajIgraca(i14);
        tim3.dodajIgraca(i15);

        tim3.dodajTrenera(t7);
        tim3.dodajTrenera(t8);
        tim3.dodajTrenera(t9);

        tim3.dodajMenadzera(m3);

        s1.dodajTim(tim1);
        s1.dodajTim(tim2);
        s1.dodajTim(tim3);

        System.out.println("Testiranje ugovora:");
        System.out.println("Igrac 1, datum potpisivanja ugovora: ");
        System.out.println(i1.getDatumPotpisivanja());
        System.out.println("Igrac 1, datum isteka ugovora: ");
        System.out.println(i1.getDatumIstekaUgovora());
        System.out.println("=====================");
        System.out.println("Stapmanje saveza s1: ");
        System.out.println("");
        System.out.println(s1);



    }
}
