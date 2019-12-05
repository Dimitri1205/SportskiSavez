package osoblje;

import java.time.LocalDate;

public class Trener extends Zaposleni implements Comparable<Trener> {

    private String zaduzenje;
    private LocalDate datumPotpisivanja;
    private LocalDate datumIstekaUgovora;

    public Trener(String ime, String prezime, String zaduzenje) {
        super(ime, prezime);
        this.zaduzenje = zaduzenje;
    }

    public String getZaduzenje() {
        return zaduzenje;
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Trener (" + zaduzenje + ")";
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
    public int compareTo(Trener o) {
        if (this.zaduzenje.compareTo(o.getZaduzenje()) > 0) {
            return 1;
        } else if (this.zaduzenje.compareTo(o.getZaduzenje()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
