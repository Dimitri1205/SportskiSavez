# SportskiSavez
Zavrsni ispit IT OiP

//Napisati aplikaciju za sportski savez na programskom jeziku java.

//U paketu osoblje postoji Osoba. Osoba ima ime i prezime.

//U paketu osoblje postoji Zaposleni. Zaposleni je Osoba i realizuje sledeće metode:

//• LocalDate getDatumPotpisivanja()

//• LocalDate getDatumIstekaUgovora()

//• void potpisiUgovor(LocalDate datumIstekaUgovora).

//U paketu osoblje postoji Igrac. Igrac je Zaposleni koji ima poziciju.

//• Ispisuje se u formatu: Ime i prezime – Igrac (pozicija)

//U paketu osoblje postoji Trener. Trener je Zaposleni koji ima zaduzenje.

//• Ispisuje se u formatu: Ime i prezime - Trener (zaduzenje)

//U paketu osoblje postoji Menadzer koji je Zaposleni.

//• Ispisuje se u formatu: Ime i prezime - Menadzer

//U paketu savez postoji Tim. Tim ima naziv, listu igrača, listu trenera, jednog menadžera i datum osnivanja. Liste igraca i trenera se stvaraju prazne. Igrac, trener i menadžer se kasnije mogu dodati u tim i pritom takođe potpisuju ugovor.

//• Ispisuje se u formatu: 

//Tim - Naziv tima (dan.mesec.godina osnivanja) 

//- Menadzer 

//- Igrac1 

//- Igrac2 

//- Trener1 

//- Trener2 ... 

//(Igrače i trenere sortirati po pozicijama/zaduzenjima pre ispisa)


//U paketu savez postoji SportskoDrustvo. SportskoDrustvo ima naziv, adresu i listu timova. Lista timova se stvara prazna, a timovi se kasnije dodaju jedan po jedan.

//• Može se vratiti ukupan broj igrača u sportskom društvu.

//• Može se vratiti ukupan broj trenera u sportskom društvu.

//• Može se vratiti ukupan broj menadžera u sportskom društvu.

//• Ispisuje se u formatu: 
//Sportsko društvo: naziv, adresa 

//-------------------------------------------------- 

//Broj igrača: X Broj trenera: Y Broj menadžera: Z 

//-------------------------------------------------- 

//Tim1 

//-------------------------------------------------- 

//Tim2 

//-------------------------------------------------- 

//Tim3 

//-------------------------------------------------- …

//Napisati glavni program koji ispituje funkcionalnosti ovih klasa.

//Pomoć za rad sa datumima:

//LocalDate datumPotpisivanja = LocalDate.now();

//LocalDate datumIsteka = LocalDate.of(2020, 12, 30);

//LocalDate datumOsnivanja = LocalDate.of(1945, 5, 3);

//dan = datumOsnivanja.getDayOfMonth();

//mesec = datumOsnivanja.getMonthValue();

//godina = datumOsnivanja.getYear();
