public class arac {
    private String renk;
    private String marka;
    private int model;

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public arac() {

    }

    /*public arac(String burenk, String bumarka, int bumodel) {
        renk = burenk;//this arac sinifini ve basta tanimladiklarimizi  temsil ediyor
        marka = bumarka;
        model = bumodel;
    }*/public arac(String renk, String marka, int model) {
        this.renk = renk;//this arac sinifini ve basta tanimladiklarimizi  temsil ediyor
        this.marka = marka;
        this.model = model;
    }//bir arac olustururken bos ksntruktur kullanmak zorundasin
    //önemli constructurla sinif class ismi aynidir degilse method falan olabiir

}
