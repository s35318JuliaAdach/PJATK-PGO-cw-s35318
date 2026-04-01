public class Main {
    public static void main(String[] args) {
        Biblioteka mojaBibl = new Biblioteka(5);
        Ksiazka k1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 297, true);
        Ksiazka k2 = new Ksiazka("Lalka", "Bolesław Prus", 300, true);
        Ksiazka k3 = new Ksiazka("Wesele", "Stanisław Wyspiański", 300, true);
        mojaBibl.dodajKsiazke(k1);
        mojaBibl.dodajKsiazke(k2);
        Czytelnik osoba = new Czytelnik("Ola", "Kot", 123);
        System.out.println("Czy jest książka");
        Ksiazka szukana = mojaBibl.znajdz("Lalka");
        if (szukana != null && szukana.czyDostepna()) {
            szukana.wypozycz();
            osoba.zwiekszLiczbeWypozyczen();
            System.out.println("Wypożyczono książkę!");
        }
        mojaBibl.wypiszDostepne();
        osoba.wypiszDane();
    }
}
