package com.example.oblig2data1700;


public class Biletter {
    private String film;
    private String antall;
    private String navn;
    private String telefon;
    private String epost;

    public Biletter (String film, String antall, String navn, String telefon, String epost){
        this.film = film;
        this.antall = antall;
        this.navn = navn;
        this.telefon = telefon;
        this.epost = epost;
    }

    public Biletter(){}

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
