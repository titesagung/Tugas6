import java.text.DecimalFormat;


public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    static int jumlah2 = 0;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja(){
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja(){
        return hariKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public double getGajii(){
        return (getHariKerja() * getJamKerja() * getGaji());
    }

    public double getBonuss(){
        double bonuslembur = ((getHariKerja() / 7) * 7 + (getHariKerja() % 7)) * (getJamKerja() - 7) * 5;
        double bonuslibur = ((getHariKerja() / 7) * 2 + getHariKerja()  * 20);
        if (getJamKerja() <= 7 ){
            return bonuslibur;
        } else {
            return bonuslembur + bonuslibur;
        }
    }

    public String getStatus(){
        String kantor = "";
        String dep = "";
        String cab;
        switch (NIP.substring(0,1)){
            case "1" :
                    kantor = "Mondstadt";
                break;
            case "2" :
                    kantor = "Liyue";
                break;
            case "3" :
                    kantor = "Inazuma";
                break;
            case "4" :
                    kantor = "Sumeru";
                break;
            case "5" :
                    kantor = "Fontaine";
                break;
            case "6" :
                    kantor = "Natlan";
                break;
            case "7" :
                    kantor = "Snezhnaya";
                break;
        }
        cab = " cabang ke- " + NIP.substring(2,3);
        switch (NIP.substring(6,7)){
            case "1" -> dep = "Pemasaran";
            case "2" -> dep = "Humas";
            case "3" -> dep = "Riset";
            case "4" -> dep = "Teknologi";
            case "5" -> dep = "Personalia";
            case "6" -> dep = "Akademik";
            case "7" -> dep = "Administrasi";
            case "8" -> dep = "Operasional";
            case "9" -> dep = "Pembangunan";
        }
        return dep + ", "+ kantor;
    }

    public void totalPekerja(){
        System.out.println(jumlah2);
    }
    @Override
    public String toString(){
        jumlah2++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                        "\nNIK              : "+ getNIK()+
                        "\nJenis Kelamin    : "+ (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan       : "+ (getPendapatan() + getGajii() + getBonuss()) + "$" +
                        "\nBonus            : "+ getBonuss()+ "$" +
                        "\nGaji             : "+ getGajii()+ "$" +
                        "\nStatus           : "+ getStatus() +"\n";

    }
}