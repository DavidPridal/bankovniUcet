package cz.pridalsps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Projekt se tridou BankovniUcet v2");
        BankovniUcet bu01 = new BankovniUcet("127-2566771/0100","Jan Novák");
        bu01.vipisInfo();
        BankovniUcetZpoplatneny buz01 = new BankovniUcetZpoplatneny("127-125888/0100","Pavel Starý",50);
        bu01.vloz(100);
        buz01.vloz(200);
        bu01.vipisInfo();
        buz01.vipisInfo();
    }
}