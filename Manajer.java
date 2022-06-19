import java.text.DecimalFormat;

public class Manajer extends Pekerja{
    public int lamaKerja;
    static int jumlah3 = 0;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja(){
        return lamaKerja;
    }
    public void setLamaKerja(int jamKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double bonusManajer(){
        return getBonuss() * 0.3;
    }
    public void totalManajer(){
        System.out.println(jumlah3);
    }

    public String toString(){
        jumlah3++;
        String pattern = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return
                "\nNama             : " + getNama()+
                        "\nNIK              : "+ getNIK()+
                        "\nJenis Kelamin    : "+ (getJenisKelamin()?"Laki-laki" : "Perempuan") +
                        "\nPendapatan       : "+ (getPendapatan() + getBonuss() + bonusManajer() + getGajii() + 15) + "$" +
                        "\nBonus            : "+ getBonuss() + bonusManajer()+ "$" +
                        "\nGaji             : "+ getGajii()+ "$" +
                        "\nStatus           : "+ getStatus() +
                        "\nLama Kerja       : "+ getLamaKerja()+ " hari" + "\n"
                ;

    }


}