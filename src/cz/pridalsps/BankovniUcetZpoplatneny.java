package cz.pridalsps;

import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;

public class BankovniUcetZpoplatneny extends BankovniUcet {
    private double poplatekZaVyber;

    public BankovniUcetZpoplatneny(String cisloUctu, String jmenoMajitele, double poplatekZaVyber) {
        super(cisloUctu, jmenoMajitele);
        this.poplatekZaVyber = poplatekZaVyber;
    }

    @Override
    public void vipisInfo() {
        super.vipisInfo();
        System.out.println("Poplatek za výběr je: " + poplatekZaVyber);
    }

    @Override
    public boolean vyber(double castka) {
        if (castka>0 && getStavUctu()>=(castka+poplatekZaVyber)){
            setStavUctu(getStavUctu()-(castka+poplatekZaVyber));
            return true;
        }
        return false;
    }
}
