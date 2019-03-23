public class DataTiket {
    public static void main (String[] args) {

        //Contoh pengisian data
        
        //Masukkan data tiket 1
        TiketKereta datapenumpang = new TiketKereta 
        ("Argo Parahyangan" , "21" , "Ekonomi" , "Z" , "KP4AXG" , "EKO_AC-4 15C" , 
        "BD-GMR" , "Aris Budiman" , "25032008" , "25 April 2019" , "06.30" , "25 April 2019" , "09.45" , 65000);
        System.out.println (TiketKereta.getLine());
        System.out.println (datapenumpang.getInfo());
        System.out.println (TiketKereta.getLine());

        //Masukkan data tiket 2
        TiketKereta datapenumpang2 = new TiketKereta
        ("Argo Wilis" , "6" , "Eksekutif" , "A" , "AH7G8E" , "EKS-4 8A" , 
        "BD-SGU" , "Herdiawan Susanto" , "9995138453" , "25 Maret 2019" , "08.30" , "25 Maret 2019" , "21.30" , 450000);
        System.out.println (datapenumpang2.getInfo());
        System.out.println (TiketKereta.getLine());
    }
}