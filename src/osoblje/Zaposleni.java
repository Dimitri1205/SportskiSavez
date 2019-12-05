package osoblje;

import java.time.LocalDate;

public abstract class Zaposleni extends Osoba {

    public Zaposleni(String ime, String prezime) {
        super(ime, prezime);
    }

    abstract LocalDate getDatumPotpisivanja();
    abstract LocalDate getDatumIstekaUgovora();
    abstract void potpisiUgovor(LocalDate datumIstekaUgovora);
}
