import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi;

        Scanner girdi = new Scanner(System.in);

        sayi = girdi.nextInt();
        int i=0;
        while(i<sayi){
            System.out.println(i+" sayının 4 kuvveti :"+ i*4);
            System.out.println(i+" sayının 5 kuvveti :"+ i*5);
            i++;
        }
    }
}
