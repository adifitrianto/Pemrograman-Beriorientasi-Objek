public class TiketKereta {

    //Variabel kelas
    static int count;

    //Deklarasi variabel
    private String nama_kereta;
    private String nomor_kereta;
    private String kelas_kereta;
    private String subclass_kereta;
    private String booking_code;
    private String tempat_duduk;
    private String tujuan;
    private String nama_penumpang;
    private String nomor_ID;
    private String tanggal_keberangkatan;
    private String waktu_keberangkatan;
    private String tanggal_tiba;
    private String waktu_tiba;
    private int harga_tiket;

    //Konstruktor
    public TiketKereta (String nama_kereta,String nomor_kereta,String kelas_kereta,String subclass_kereta,String booking_code,
    String tempat_duduk,String tujuan,String nama_penumpang,String nomor_ID,
    String tanggal_keberangkatan,String waktu_keberangkatan,String tanggal_tiba,String waktu_tiba,int harga_tiket) {
        
        this.nama_kereta = nama_kereta;
        this.nomor_kereta = nomor_kereta;
        this.kelas_kereta = kelas_kereta;
        this.subclass_kereta = subclass_kereta;
        this.booking_code = booking_code;
        this.tempat_duduk = tempat_duduk;
        this.tujuan = tujuan;
        this.nama_penumpang = nama_penumpang;
        this.nomor_ID = nomor_ID;
        this.tanggal_keberangkatan = tanggal_keberangkatan;
        this.waktu_keberangkatan = waktu_keberangkatan;
        this.tanggal_tiba = tanggal_tiba;
        this.waktu_tiba = waktu_tiba;
        this.harga_tiket = harga_tiket;
        count++;
    }
    //method kelas
    static String getLine() {
        return ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    static int getCount() {
        return count;
    }

    //instance methods
    public String getInfo()
    {
        return (
            "Nama kereta\t\t: " + nama_kereta +
            "\nNomor kereta\t\t: " + nomor_kereta +
            "\nKelas kereta\t\t: " + kelas_kereta +
            "\nSubclass kereta\t\t: " + subclass_kereta +
            "\nBooking code\t\t: " + booking_code +
            "\nTempat duduk\t\t: " + tempat_duduk +
            "\nTujuan\t\t\t: " + tujuan +
            "\nNama penumpang\t\t: " + nama_penumpang +
            "\nNomor identitas\t\t: " + nomor_ID +
            "\nTanggal keberangkatan\t: " + tanggal_keberangkatan +
            "\nWaktu keberangkatan\t: " + waktu_keberangkatan +
            "\nTanggal tiba\t\t: " + tanggal_tiba +
            "\nWaktu tiba\t\t: " + waktu_tiba +
            "\nHarga tiket\t\t: " + harga_tiket +
            "\nPenumpang ke\t\t: " + getCount()
        );
    }
}