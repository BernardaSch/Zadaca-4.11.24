public class Polaznik {

    private String ime;
    private String prezime;
    private int dob;
    private String spol;

    public Polaznik (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Polaznik (String ime, String prezime, int dob, String spol) {
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.spol = spol;
    }

    public Polaznik() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getImeIPrezime() {
        return this.ime + " " + this.prezime;
    }
}
