package cz.pridalsps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Projekt se tridou BankovniUcet v2");
        BankovniUcet bu01 = new BankovniUcet("127-2566771/0100","Jan Novák", 0);
        bu01.vipisInfo();
    }
}