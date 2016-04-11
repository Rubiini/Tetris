package tetris.logiikka;

import tetris.palat.Palat;
import tetris.palat.Pelialusta;
import tetris.palat.Palikka;

/**
 * Vastaa pelin logiikasta.
 *
 * @author samukaup
 */
public class Logiikka {

    private PalikanArpoja arpoja;
    private Pelialusta pelialusta;
    private Palikka palikka;
    private int n;
    private int m;

    public Logiikka(Pelialusta pelialusta) {
        this.pelialusta = pelialusta;
        arpoja = new PalikanArpoja();
        palikka = arpoja.arvoPala();
    }

    public boolean lisataankoPalaPelialustaan() {
        if (tormaakoPalikka()) {
            lisaaPalaPelialustaan();
            return true;
        }
        return false;
    }

    public boolean tormaakoPalikka() {
        pelialusta.liikuAlas();
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (palikanOsa(y, x)) {
                    return tormays(y, x);
                }
            }
        }
        return false;
    }

    public boolean palikanOsa(int y, int x) {
        int arvo = palikka.getKoordinaatti(y, x);
        if (arvo > 1) {
            return true;
        }
        return false;
    }

    public boolean tormays(int y, int x) {
        paivitaSijainti();
        if (tormaysLattiaan(x, y)) {
            return true;
        }
        if (tormaysOikeaanSeinaan(x, y)) {
            return true;
        }
        if (tormaysVasempaanSeinaan(x, y)) {
            return true;
        }
        return false;
    }

    public void lisaaPalaPelialustaan() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (palikanOsa(y, x)) {
                    pelialusta.setKoordinaatti(y + m, x + n, palikka.getKiintopiste());
                }
            }
        }
    }

    public boolean tormaysLattiaan(int x, int y) {
        if (pelialusta.getKoordinaatti(y + m, x + n) > 1) {
            pelialusta.liikuYlos();
            paivitaSijainti();
            System.out.println("lattia");
            return true;
        }
        return false;
    }

    public boolean tormaysVasempaanSeinaan(int x, int y) {
        if (x + n == 0) {
            pelialusta.liikuOikealle();
            paivitaSijainti();
            System.out.println("vasuri");
            return true;
        }
        return false;
    }

    public boolean tormaysOikeaanSeinaan(int x, int y) {
        if (x + n == 11) {
            pelialusta.liikuVasemmalle();
            paivitaSijainti();
            System.out.println("oikee");
            return true;
        }
        return false;
    }

    public void paivitaSijainti() {
        n = pelialusta.getX();
        m = pelialusta.getY();
    }

}
