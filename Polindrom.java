import java.util.Scanner;
public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen 5 basamakli bir sayi giriniz");
        int sayi = scanner.nextInt();

        int  basamak_1 = sayi/10000 ;
        int basamak_2 = (sayi%10000)/1000 ;
        int basamak_3 = (sayi%1000)/100 ;
        int basamak_4 = (sayi%100)/10;
        int basamak_5 = (sayi%10);

        String Polindrom_Kontrol;
        if(basamak_1==basamak_5 && basamak_2==basamak_4){
            Polindrom_Kontrol = "Bu sayi polindrom bir sayidir";
        }else{
            Polindrom_Kontrol = "Bu sayi polindrom degildir";
        }
        System.out.println(sayi);
        System.out.println(Polindrom_Kontrol);
        scanner.close();
     }
}