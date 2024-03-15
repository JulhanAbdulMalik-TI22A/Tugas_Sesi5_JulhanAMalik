/**
 *
 * @author KOMPUTER JARKOM 9
 */
public class BujurSangkar extends BangunDatar{
    BujurSangkar(int s){
        super(s);
    }
    
    //Method untuk Hitung Luas
    int HitungLuas(){
        int s = super.getS();
        return s * s;
    }
    
    //Method untuk Hitung Keliling
    int HitungKeliling(){
        int s = super.getS();
        return 4 * s;
    }
    
    public String toString(){
        String hasil = "\n Luas Bujursangkar : " + HitungLuas() + "\n" + "Keliling Bujursangkar : " + HitungKeliling();
        
        return hasil;
    }
}
