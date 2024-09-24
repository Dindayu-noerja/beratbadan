import java.util.Scanner;
public class rataBerat {
    public static void main (String []args) {
        int jumlahSiswa;
        int beratBadan;
        int absensiSiswa;
        double totalSemuaBeratBadan=0;
        double rataRataSiswa;


        Scanner siswa = new Scanner(System.in);
        System.out.println("jumlah siswa");
        jumlahSiswa=siswa.nextInt();
        for(absensiSiswa=1; absensiSiswa<=jumlahSiswa;absensiSiswa++){
            System.out.println("masukkan beratBadan ke-"+ absensiSiswa +",");
            beratBadan = siswa.nextInt();
            totalSemuaBeratBadan += beratBadan;
        }
        System.out.println("");
        rataRataSiswa = totalSemuaBeratBadan/jumlahSiswa;
        System.out.println("berat badan"+jumlahSiswa+"siswa"+rataRataSiswa);

    }
    
}
