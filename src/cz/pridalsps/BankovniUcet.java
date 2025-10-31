package cz.pridalsps;

public class BankovniUcet {
    private final String cisloUctu;
    private String jmenoMajitele;
    private double stavUctu;

    public BankovniUcet(String cisloUctu, String jmenoMajitele, double stavUctu) {
        this.cisloUctu = cisloUctu;
        this.jmenoMajitele = jmenoMajitele;
        this.stavUctu = 0;
    }

    public void vipisInfo(){
        System.out.println("Číslo účtu: " + cisloUctu);
        System.out.println("Jmeno majitele: " + jmenoMajitele);
        System.out.println("Stav účtu: " + stavUctu);
    }
}
