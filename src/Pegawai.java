public class Pegawai {
    private String nama, nip;
    private double gajiPokok=0, lembur=0, uangMakan=0, transport=0, totalGaji=0;
    private int jumlahJamKerja;
   
    Pegawai(String nm, String np){
        this.nama = nm;
        this.nip = np;
    }
   
    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public int getJamKerja(){
        return jumlahJamKerja;
    }
    public void hitungGajiHarian(){
        if(jumlahJamKerja>0 && jumlahJamKerja<=7){
            gajiPokok=2000*jumlahJamKerja;
            totalGaji=gajiPokok;
        }else if(jumlahJamKerja>7 && jumlahJamKerja<9){
            gajiPokok=2000*7;
            lembur=(jumlahJamKerja-7)*3000;
            uangMakan=3500;
            totalGaji=gajiPokok+lembur+uangMakan;
        }else if(jumlahJamKerja>=9){
            gajiPokok=2000*7;
            lembur=(jumlahJamKerja-7)*3000;
            uangMakan=3500;
            transport=4000;
            totalGaji=gajiPokok+lembur+uangMakan+transport;
        }
    }   
    public void cetakPenghasilan(){
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Uang Lembur : " + lembur);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Uang Transport : " + transport);
        System.out.println("Total Gaji : " + totalGaji);
        }
    }