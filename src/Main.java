import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, alfa;

        Scanner input = new Scanner(System.in);

        System.out.println("Daire yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.println("Daire merkez açısını giriniz: ");
        alfa = input.nextInt();

        double pi = 3.14 ;
        double alan, cevre;



        alan = (pi*(r*r)*alfa)/360;
        System.out.println("Daire Diliminin AlanI = " + alan);

    }
}