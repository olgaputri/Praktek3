package praktek3;

public class Lipstik {
    private String merk;
    private String warna;
    private String harga;
    
    void cetakinfo(){
        System.out.println("Merk \t:"+merk+"\n"+
                "warna \t: "+warna+"\n"+ 
                "Harga \t:"+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
 
    
    
}
