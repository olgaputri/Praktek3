package praktek3;
public class LipstikAksi {
    public static void main (String[] args){
        Lipstik c = new Lipstik();
       
        c.setMerk("Bodyshop");
        c.setWarna("pink");
        c.setHarga("150000");
        
        c.cetakinfo();
        
        System.out.println("Merknya \t: ");
        System.out.println(c.getMerk());
        System.out.println("Warnanya\t: ");
        System.out.println(c.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(c.getHarga());
              
        LipBalm cm = new LipBalm();
        cm.setMerk("Bodyshop");
        cm.setWarna("Pink muda");
        cm.setHarga("100000");
        cm.setJenisLipBalm("Glowing");
        cm.cetakinfo();
        System.out.println("Jenis :"+cm.getJenisLipBalm());
        cm.throttle();
    }
    
}
