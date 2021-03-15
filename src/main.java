public class main {
    public static void main(String[] args) {
        arac arac1 =new arac("mavi","abc",1991);//bos constructur;her sinifin default olarak vardir
        arac arac2 =new arac();//burda getter ve setter kullanilir ihtiyac varsa!!!
arac2.setMarka("abcd");
arac2.setRenk("sari");
arac2.setModel(2012);
String marka= arac2.getMarka();
        System.out.println(marka);
       int model= arac1.getModel();
        System.out.println(model);

    }

}
