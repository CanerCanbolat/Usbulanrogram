import java.util.Scanner;
public class Power_A_Number {
    public static void main (String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int k = inp.nextInt();
        for (double i = 0; i <=k ; i++) {
            double sayi= Math.pow(4,i);
            double sayi2=Math.pow(5,i);
            System.out.println("4'ün "+i+"'inci kuvveti ="+sayi+"\n5'in "+i+"'inci kuvveti ="+sayi2);
        }
    }
}
