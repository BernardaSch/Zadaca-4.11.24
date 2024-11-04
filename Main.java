public class Main {
    public static void main(String[] args) {

        Polaznik polaznik1 = new Polaznik("Marko", "Marković");
        Polaznik polaznik2 = new Polaznik("Ivana", "Ivanković", 38, "Ž");
        Polaznik polaznik3 = new Polaznik();

        System.out.println("Prvi polaznik: " + polaznik1.getIme() + " " + polaznik1.getPrezime());
        polaznik2.setDob(40);
        System.out.println("Drugi polaznik: " + polaznik2.getIme() + " " + polaznik2.getPrezime() + " " + polaznik2.getDob() + " " + polaznik2.getSpol());
        polaznik3.setIme("Pavao");
        polaznik3.setPrezime("Pavičić");
        System.out.println("Treći polaznik: " + polaznik3.getImeIPrezime());
    }
}

