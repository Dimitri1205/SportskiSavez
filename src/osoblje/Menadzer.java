package osoblje;

import java.time.LocalDate;

public class Menadzer  extends Zaposleni {

    private LocalDate datumPotpisivanja;
    private LocalDate datumIstekaUgovora;

    public Menadzer(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Menadzer";
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
}
