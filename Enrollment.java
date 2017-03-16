package tema;

import java.util.ArrayList;
import java.util.List;


public class Enrollment {
    private String nume;
    private String prenume;
    private int id;
    private String dataNasterii;
    private String adresa;
    private String materie;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMaterie() {
        return materie;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", id=" + id +
                ", dataNasterii='" + dataNasterii + '\'' +
                ", adresa='" + adresa + '\'' +
                ", materie='" + materie + '\'' +
                '}';
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }
}
