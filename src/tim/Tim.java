package tim;

import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Tim {

    private String naziv;
    private int dan, mesec, godina;
    private ArrayList<Igrac> listaIgraca;
    private ArrayList<Trener> listaTrenera;
    private Menadzer menadzer;


    public Tim(String naziv) {
        this.naziv = naziv;
        LocalDate datumOsnivanja = LocalDate.of(1945, 5, 3);
        this.dan = datumOsnivanja.getDayOfMonth();
        this.mesec = datumOsnivanja.getMonthValue();
        this.godina = datumOsnivanja.getYear();
        listaIgraca = new ArrayList<>();
        listaTrenera = new ArrayList<>();
    }

    public void dodajIgraca (Igrac igrac) {
        LocalDate datumIsteka = LocalDate.of(2020, 12,30);
        igrac.potpisiUgovor(datumIsteka);
        listaIgraca.add(igrac);
    }

    public void dodajTrenera (Trener trener) {
        LocalDate datumIsteka = LocalDate.of(2020, 12,30);
        trener.potpisiUgovor(datumIsteka);
        listaTrenera.add(trener);
    }

    public void dodajMenadzera (Menadzer menadzer) {
        LocalDate datumIsteka = LocalDate.of(2020, 12,30);
        menadzer.potpisiUgovor(datumIsteka);
        this.menadzer = menadzer;
    }

    @Override
    public String toString() {
        String tekst = "Tim: " + naziv + " (" + dan +", " + mesec + ", " + godina + ")\n";
        tekst += menadzer;
        Collections.sort(listaIgraca);
        for (Igrac i: listaIgraca) {
            tekst += "\n" + i;
        }
        Collections.sort(listaTrenera);
        for (Trener t: listaTrenera) {
            tekst += "\n" + t;
        }
        return  tekst;
    }

    public int brojIgraca () {
        return listaIgraca.size();
    }

    public int brojTrenera () {
        return listaTrenera.size();
    }
}
