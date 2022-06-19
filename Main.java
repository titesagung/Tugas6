
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Manusia mns1 = new Manusia("Aku", "3923842934", true, true);
    Manusia mns2 = new Manusia("Rany", "156160601111019", true, true);
    Manusia mns3 = new Manusia("Agustin", "196150600111022", true, false);
    ArrayList<Manusia> output = new ArrayList<>();
    output.add(mns1);
    output.add(mns2);
    output.add(mns3);

    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239",true, false, "205150601111018", 3.70);
    MahasiswaFilkom mhs2 = new MahasiswaFilkom("Rany", "3326134801030063", false, true, "215150600111018", 4.0);
    MahasiswaFilkom mhs3 = new MahasiswaFilkom("Agustin", "3326134801030063", false, false, "215150600111018", 3.2);
    ArrayList<MahasiswaFilkom> output1 = new ArrayList<>();
    output1.add(mhs1);
    output1.add(mhs2);
    output1.add(mhs3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");

    Pekerja pkj1 = new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "195102439283");
    Pekerja pkj2 = new Pekerja("Rany", "3326134801030063", true, false, 9, 28, "2312");
    Pekerja pkj3 = new Pekerja("Agustin", "3326134801030063", false, true, 10, 26, "2312");
    ArrayList<Pekerja> output2 = new ArrayList<>();
    output2.add(pkj1);
    output2.add(pkj2);
    output2.add(pkj3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manajer mnj1 = new Manajer("Lyra Hertin", "351707384392", false, false,9, 20,"204837283728", 1500);
    Manajer mnj2 = new Manajer("Rany", "3326134801030063", false, true,8, 28,"3243", 3789);
    Manajer mnj3 = new Manajer("Agustin", "3326134801030063", true, true,6, 25,"3243", 3432);
    ArrayList<Manajer> output3 = new ArrayList<>();
    output3.add(mnj1);
    output3.add(mnj2);
    output3.add(mnj3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAJER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
