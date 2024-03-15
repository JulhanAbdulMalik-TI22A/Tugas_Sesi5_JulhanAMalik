/**
 *
 * @author Julhan Abdul Malik
 */
public class BangunDatar {
    private int p, l, s;
    
    //Konstruktor untuk Bujur Sangkar
    BangunDatar (int s){
        this.s = s;
    }
    
    //Konstuktor untuk Persegi Panjang
    BangunDatar (int p, int l){
        this.p = p;
        this.l = l;
    }
    
    //Setter untuk Sisi
    void setSisi(int s){
        this.s = s;
    }
    
    //Setter untuk Panjang dan Lebar
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    //Getter untuk Sisi
    int getS(){
        return s;
    }
    
    //Getter untuk Panjang
    int getP(){
        return p;
    }
    
    //Getter untuk Lebar
    int getL(){
        return l;
    }
}