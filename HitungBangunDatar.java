
import java.util.Scanner;

/**
 *
 * @author KOMPUTER JARKOM 9
 */
public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Isikan Pilihan ---");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.print("Silahkan : ");
        
        int pilihan = sc.nextInt();
        
        if (pilihan == 1){
            System.out.print("\n Silahkan Masukan Nilai Sisi: ");
            int s = sc.nextInt();
            
            BujurSangkar bs = new BujurSangkar(s);
            System.out.println(bs);
        } else if (pilihan == 2){
            System.out.print("\n Silahkan Masukan Nilai Panjang: ");
            int p = sc.nextInt();
            
            System.out.print("Silahkan Masukan Nilai Lebar: ");
            int l = sc.nextInt();
            
            PersegiPanjang bs = new PersegiPanjang(p, l);
            System.out.println(bs);
        }
    }
}
