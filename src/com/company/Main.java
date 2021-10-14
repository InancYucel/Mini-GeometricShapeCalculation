package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler \n" +
                "1. Kare Alan Hesapla\n" +
                "2. Üçgen Alan Hesapla\n" +
                "3. Daire Alan Hesapla\n" +
                "Çıkış : q";


        while(true){
            System.out.println(islemler);
            System.out.println("\n \n Hangi Şeklin Alanını Hesaplamak İstiyorsunuz");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;

            if (sekil_turu.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (sekil_turu.equals("1")){
                System.out.println("Karenin kenarını giriniz\n");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1", kenar);

                sekil.alanHesapla();
            }

            else if (sekil_turu.equals("2")){
                System.out.println("Üçgenin 1. kenarını giriniz\n");
                int kenar1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçgenin 2. kenarını giriniz\n");
                int kenar2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçgenin 3. kenarını giriniz\n");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen1", kenar1,kenar2,kenar3);

                sekil.alanHesapla();


            }

            else if (sekil_turu.equals("3")){

                System.out.println("Dairenin yaricapini giriniz\n");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", yaricap);

                sekil.alanHesapla();
            }

            else
                System.out.println("Geçersiz işlem");



        }
    }
}
