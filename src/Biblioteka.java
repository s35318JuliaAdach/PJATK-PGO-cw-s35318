public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int licznik;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.licznik = 0;
    }

    public void dodajKsiazke(Ksiazka k) {
        if (licznik < ksiazki.length) {
            ksiazki[licznik] = k;
            licznik++;
        }
    }

    public void wypiszDostepne() {
        System.out.println("--- Książki na półkach: ---");
        for (int i = 0; i < licznik; i++) {
            if (ksiazki[i].czyDostepna()) ksiazki[i].wypiszInfo();
        }
    }

    public Ksiazka znajdz(String tytul) {
        for (int i = 0; i < licznik; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) return ksiazki[i];
        }
        return null;
    }
}
