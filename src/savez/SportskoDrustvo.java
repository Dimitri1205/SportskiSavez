package savez;

import tim.Tim;

import java.util.ArrayList;

public class SportskoDrustvo {

    private String naziv, adresa;
    private ArrayList<Tim> listaTimova;

    public SportskoDrustvo(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        listaTimova = new ArrayList<>();
    }

    public void dodajTim (Tim tim) {
        listaTimova.add(tim);
    }

    public int ukupanBrojIgraca () {
        int suma = 0;
        for (Tim t: listaTimova) {
            suma += t.brojIgraca();
        }
        return suma;
    }

    public int ukupanBrojTrenera () {
        int suma = 0;
        for (Tim t: listaTimova) {
            suma += t.brojTrenera();
        }
        return suma;
    }

    public int ukupanBrojMenadzera () {
        return listaTimova.size();
    }

    @Override
    public String toString() {
        String tekst = "Sportsko drustvo: " + naziv + ", " + adresa;
        tekst += "\n----------------------------";
        tekst += "\n Ukupan broj igraca: " + ukupanBrojIgraca();
        tekst += "\n Ukupan broj trenera: " + ukupanBrojTrenera();
        tekst += "\n Ukupan broj menadzera: " + ukupanBrojMenadzera();
        for (Tim t: listaTimova) {
            tekst += "\n----------------------------";
            tekst += "\n" + t;
        }
        return tekst;
    }
}
