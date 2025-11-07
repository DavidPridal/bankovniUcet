package cz.pridalsps;

public class BankovniUcet {
    private final String cisloUctu;
    private String jmenoMajitele;
    private double stavUctu;

    public BankovniUcet(String cisloUctu, String jmenoMajitele) {
        this.cisloUctu = cisloUctu;
        this.jmenoMajitele = jmenoMajitele;
        this.stavUctu = 0;
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public double getStavUctu() {
        return stavUctu;
    }

    public void setStavUctu(double stavUctu) {
        this.stavUctu = stavUctu;
    }

    public boolean vyber(double castka){
        if (castka > 0 && stavUctu >= castka){
            stavUctu-=castka;
            return true;
        }
        return false;
    }
    public boolean vloz(double castka) {
        if (castka > 0) {
            stavUctu+=castka;
            return true;
        }
        return false;
    }
    public void vipisInfo(){
        System.out.println("Číslo účtu: " + cisloUctu);
        System.out.println("Jmeno majitele: " + jmenoMajitele);
        System.out.println("Stav účtu: " + stavUctu);
    }
}
