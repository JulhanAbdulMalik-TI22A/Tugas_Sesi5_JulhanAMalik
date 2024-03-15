/**
 *
 * @author KOMPUTER JARKOM 9
 */
public class PersegiPanjang extends BangunDatar {
    PersegiPanjang(int p, int l){
        super(p, l);
    }
    
    //Method untuk Hitung Luas
    int HitungLuas(){
        int p = super.getP();
        int l = super.getL();
        
        return p * l;
    }
    
    //Method untuk Hitung Keliling
    int HitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        
        return 2 * (p + l);
    }
    
    public String toString(){
        String hasil = "\n Luas Persegi : " + HitungLuas() + "\n" + "Keliling Persegi : " + HitungKeliling();
        
        return hasil;
    }
}
