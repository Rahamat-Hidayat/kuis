import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args){
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    System.out.print("Total Pegawai : ");
    int jumPegawai = sc1.nextInt();

        for(int i=0; i<jumPegawai; i++){
        System.out.println("");
        System.out.print("Nama Pegawai : ");
        String nama = sc2.next();
        System.out.print("NIP Pegawai : ");
        String nipPegawai = sc2.next();
        Pegawai pegawai = new Pegawai(nama, nipPegawai);
        System.out.print("Total Jam Kerja : ");
        int totalJam = sc1.nextInt();
        pegawai.setJamKerja(totalJam);
        System.out.println("");
        pegawai.hitungGajiHarian();
        pegawai.cetakPenghasilan();
        System.out.println("");
        }
    }
}
   