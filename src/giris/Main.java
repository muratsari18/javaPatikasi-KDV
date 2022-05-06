package giris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int mat,fizik,kimya,tarih,muzik,turkce;
       double ortalama;

       // Scanner sınıfımızı tanımladık
       Scanner inp = new Scanner(System.in);

       //Kullanıcıdan Değer Al

        System.out.print("Matematik notunuzu giriniz:");
        mat=inp.nextInt();
        System.out.println();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=inp.nextInt();
        System.out.println();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();
        System.out.println();

        System.out.print("Tarih notunuzu giriniz:");
        tarih=inp.nextInt();
        System.out.println();

        System.out.print("Müzik notunuzu giriniz:");
        muzik=inp.nextInt();
        System.out.println();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=inp.nextInt();
        System.out.println();

        int toplam =mat+fizik+kimya+turkce+muzik+tarih;

        ortalama=toplam/6.0;
        System.out.println("Ders Ortalamaları: "+ortalama);

        boolean kosul = ortalama>60;
        String str = kosul ? "Geçti":"Kaldı";
        System.out.println(str);

    }
}
