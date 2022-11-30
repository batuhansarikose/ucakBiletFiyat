import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {

        System.out.println("BS Air'e Hoşgeldiniz.");
        double tutar, km,indirimGD, kmTutar = 0.10, indirim1 = 0.10,indirim2=0.20, yas, yolculuk1, yolculuk2, indirim12 = 0.50, indirimliTutar12;
        int secim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz :");
        km = inp.nextDouble();
        System.out.print("Yaşınızı giriniz :");
        yas = inp.nextDouble();
        System.out.println("Yolculuk tipini seçiniz\n1-)Tek Yön\n2-)Gidiş Dönüş");
        secim = inp.nextInt();
        tutar = (kmTutar * km);
        if (secim>2)
            System.out.println("Hatalı seçim yaptınız!");

        switch (secim) {
            case 1 -> {
                if (yas < 12) {
                    indirimliTutar12 = (tutar * indirim12);
                    System.out.println("Tutar:"+(tutar - indirimliTutar12));
                }else if ((yas > 12) && (yas < 24)) {
                    indirimliTutar12 = (tutar * indirim1);
                    System.out.println("Tutar:"+(tutar - indirimliTutar12));
                }else System.out.println(tutar);
        }
            case 2 -> {
                if (yas < 12) {
                    indirimliTutar12 = ((tutar)-(tutar *indirim12));
                    indirimGD=(indirimliTutar12*indirim2);
                    System.out.println("Tutar:"+((indirimliTutar12-indirimGD)*(2)));
                }else if ((yas > 12) && (yas < 24)) {
                    indirimliTutar12 = (tutar)-(tutar *indirim1);
                    indirimGD=(indirimliTutar12*indirim2);
                    System.out.println("Tutar:"+((indirimliTutar12-indirimGD)*(2)));
                }else System.out.println("Tutar:"+((tutar)*2));

            }
        }
    }}