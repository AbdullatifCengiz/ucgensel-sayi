import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner latf=new Scanner(System.in);

        int sayi=1;
        System.out.println("terim sayısı gir");
        int terimsayisi=latf.nextInt();
        int sayac=2;
        for(int i=1; i<=terimsayisi; i++){
            System.out.println(sayi);
            sayi+=sayac;
            sayac+=1;

        }


    }
}