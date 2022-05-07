package KDVTutar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double kdvliTutar,kdv,kdvOran=0.18;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Ücret Değerini Giriniz:");

        double para = inp.nextDouble();
        kdv = para * kdvOran;
        kdvliTutar= para + kdv;



        System.out.println("Kdv'siz Para Tutarınız: "+para);
        System.out.println("Kdv Oranını Tutarınız: "+kdvOran);
        System.out.println("Kdv  Tutarınız: "+kdv);
        System.out.println("KDV'li tutarınız: "+kdvliTutar);



    }
}
