import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double kmUcret=0.10,tutar,indirim1=0.50,indirim2=0.10,indirim3=0.30,indirim4=0.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz: ");
        mesafe=input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("1 => Tek Yön , 2 => Gidiş Dönüş :");
        tip=input.nextInt();

        if(mesafe>0 && yas>0 && (tip==1 || tip==2)){

            tutar=mesafe*kmUcret;

            if(yas<12){
                tutar-=tutar*indirim1;

            }else if(yas>12 && yas<24){
                tutar-=tutar*indirim2;

            }else if(yas>65){
                tutar-=tutar*indirim3;
            }

            if(tip==2){
                tutar-=tutar*indirim4;
                tutar=tutar*2;
            }

            System.out.println("Toplam Tutar: "+tutar+" TL");

        }else {

            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}
