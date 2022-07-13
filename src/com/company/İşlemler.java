package com.company;
import java.util.Scanner;

public class İşlemler {

    public int bakiye;
    int faturaBorcu;
    int krediBorcu;
    int eğitimÖdemesi;
    Scanner scan = new Scanner(System.in);

    public İşlemler(int bakiye, int faturaBorcu,int krediBorcu,int eğitimÖdemesi) {

        this.bakiye = bakiye;
        this.faturaBorcu = faturaBorcu;
        this.krediBorcu = krediBorcu;
        this.eğitimÖdemesi = eğitimÖdemesi;
    }

    public void BakiyeSorgulama(){
        System.out.println("Bakiyeniz: " + bakiye);
    }

    public void ParaÇekme(){
        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
        int çekilen = scan.nextInt();

        if(çekilen > bakiye || çekilen <=0){
            System.out.println("Geçersiz işlem.");
        }
        else {
            bakiye = bakiye - çekilen;
            System.out.println("Para çekildi.\nYeni bakiyeniz: " + bakiye);
        }
    }

    public void ParaYatırma(){
        System.out.println("Yatırılacak tutarı giriniz:");
        int yatırılan = scan.nextInt();
        bakiye = bakiye + yatırılan;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public void Ödeme(){

        System.out.println("Eğitim ödemesi için 1 \n Fatura ödemesi için 2 \n Kredi Kartı borcu ödemesi için 3'e basınız.");
        int ödemeTürü = scan.nextInt();

        if(ödemeTürü == 1){

            if(eğitimÖdemesi ==0){
                System.out.println("Bu kategoride borcunuz bulunmamaktadır.");
            }

            else {
                System.out.print("Ödemek istediğiniz tutar:");
                int ödeme = scan.nextInt();

                if (ödeme > bakiye){
                    System.out.println("Yeterli paranız yok.");
                }
                if(ödeme == eğitimÖdemesi){
                    eğitimÖdemesi = 0;
                    System.out.println("Borcunuz kalmamıştır.");
                }
                else if(ödeme > eğitimÖdemesi){
                    System.out.println("Bu tutarda borcunuz yoktur.");
                }
                else {
                    eğitimÖdemesi = eğitimÖdemesi - ödeme;
                    System.out.println("Güncel borcunuz: " + eğitimÖdemesi);
                }
            }
        }

        if(ödemeTürü == 2){

            if(faturaBorcu ==0){
                System.out.println("Bu kategoride borcunuz bulunmamaktadır.");
            }

            else {
                System.out.print("Ödemek istediğiniz tutar:");
                int ödeme = scan.nextInt();
                if (ödeme > bakiye){
                    System.out.println("Yeterli paranız yok.");
                }

                if(ödeme == faturaBorcu){
                    faturaBorcu = 0;
                    System.out.println("Borcunuz kalmamıştır.");
                }
                else if(ödeme > faturaBorcu){
                    System.out.println("Bu tutarda borcunuz yoktur.");
                }
                else {
                    faturaBorcu = faturaBorcu - ödeme;
                    System.out.println("Güncel borcunuz: " + faturaBorcu);
                }
            }
        }

        if(ödemeTürü == 3){

            if(krediBorcu ==0){
                System.out.println("Bu kategoride borcunuz bulunmamaktadır.");
            }

            else {
                System.out.print("Ödemek istediğiniz tutar:");
                int ödeme = scan.nextInt();
                if (ödeme > bakiye){
                    System.out.println("Yeterli paranız yok.");
                }

                if(ödeme == krediBorcu){
                    krediBorcu = 0;
                    System.out.println("Borcunuz kalmamıştır.");
                }
                else if(ödeme > krediBorcu){
                    System.out.println("Bu tutarda borcunuz yoktur.");
                }
                else {
                    krediBorcu = krediBorcu - ödeme;
                    System.out.println("Güncel borcunuz: " + krediBorcu);
                }
            }
        }
    }

}
