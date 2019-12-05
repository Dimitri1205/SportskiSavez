package osoblje;

import java.time.LocalDate;

public class Igrac extends Zaposleni implements Comparable<Igrac> {
    private String pozicija;
    private LocalDate datumPotpisivanja;
    private LocalDate datumIstekaUgovora;

    public Igrac(String ime, String prezime, String pozicija) {
        super(ime, prezime);
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return pozicija;
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Igrac (" + pozicija + ")";
    }

    @Override
    public LocalDate getDatumPotpisivanja() {
        return datumPotpisivanja;
    }

    @Override
    public LocalDate getDatumIstekaUgovora() {
        return datumIstekaUgovora;
    }

    @Override
    public void potpisiUgovor(LocalDate datumIstekaUgovora) {
        datumPotpisivanja = LocalDate.now();
        this.datumIstekaUgovora = datumIstekaUgovora;
    }

    @Override
    public int compareTo(Igrac o) {
        if (this.pozicija.compareTo(o.getPozicija()) > 0) {
            return 1;
        } else if (this.pozicija.compareTo(o.getPozicija()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
