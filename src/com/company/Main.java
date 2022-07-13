package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        İşlemler işlem = new İşlemler(500,1500,3500,0);

        int KartSifresi = 123456;

        Scanner scan = new Scanner(System.in);

        System.out.println("ATM'ye Hoşgeldiniz. Lütfen Bilgilerinizi giriniz.");
        int sifre = scan.nextInt();

        if (sifre != KartSifresi) {
            System.out.println("Yanlış şifre. Tekrar Deneyiniz. Son 2 deneme hakkı.");
            int sifreTekrar = scan.nextInt();

            if (sifreTekrar != KartSifresi) {
                System.out.println("Yanlış şifre. Tekrar Deneyiniz. Son deneme hakkı.");
                int sifreSon = scan.nextInt();

                if (sifreSon != KartSifresi) {
                    System.out.println("Kartınızı Alınız");
                    return;
                }
            }
        }


        int sorgu = 1;
        while (sorgu ==1) {
            System.out.println("Bakiye Sorgulama için 1'i \nPara Çekme için 2'yi \nPara Yatırmak için 3'ü \nÖdeme yapmak 4'ü seçiniz. ");
            int seçim = scan.nextInt();
            switch (seçim) {

                case 1:
                    işlem.BakiyeSorgulama();
                    break;
                case 2:
                    işlem.ParaÇekme();
                    break;
                case 3:
                    işlem.ParaYatırma();
                    break;
                case 4:
                    işlem.Ödeme();
                    break;
            }
            System.out.println("Başka işlem yapmak istiyorsanız 1'e tıklayın.");
            sorgu = scan.nextInt();
        }
    }
}
