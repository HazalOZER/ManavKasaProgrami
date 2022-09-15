import java.util.Scanner;

public class ManavKasaEkrani {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        double armut= 2.14,elma= 3.67,domates = 1.11,muz=0.95,patlican= 5.00;

        System.out.println("Kaç Kg Armut istediğinizi Yazınız: ");
        double arKg= scan.nextDouble();

        System.out.println("Kaç Kg Elma İstediğinizi Yazınız");
        double elKg= scan.nextDouble();

        System.out.println("Kaç Kg Domates İstediğinizi Yazınız");
        double domKg= scan.nextDouble();

        System.out.println("Kaç Kg Muz İstediğinizi Yazınız");
        double muzKg= scan.nextDouble();

        System.out.println("Kaç Kg Patlıcan İstediğinizi Yazınız");
        double patKg= scan.nextDouble();

        double arFiyat= arKg*armut,elFiyat=elKg*elma, domFiyat=domKg*domates,muzFiyat=muzKg*muz,patFiyat=patKg*patlican;
        double toplam=arFiyat+elFiyat+domFiyat+muzFiyat+patFiyat;

        System.out.println("Armut: "+arFiyat+"TL"+"\nElma: "+elFiyat+"TL"+"\nDomates: "+domFiyat+"TL"+"\nMuz: "
                +muzFiyat+"TL"+"\nPatlıcan: "+patFiyat+"TL"+"\nToplam: "+toplam+"TL");

    }
}
