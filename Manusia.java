import java.text.DecimalFormat;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    static int jumlah = 0;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama (){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if (getMenikah() == true && getJenisKelamin() == true){
            return 25;
        } else if (getMenikah() == false && getMenikah() == true){
            return 20;
        } else {
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }

    public void getTotalManusia(){
        System.out.println(jumlah);
    }

    public String toString(){
        jumlah++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                        "\nNIK              : "+ getNIK()+
                        "\nJenis Kelamin    : "+ (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan       : "+ getPendapatan() + "$" + "\n"
                ;

    }

}