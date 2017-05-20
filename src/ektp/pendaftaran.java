/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektp;
import java.util.*;

/**
 *
 * @author Muhammad Fikri
 */
public class pendaftaran {

    Scanner sc = new Scanner(System.in);
    
    String provinsi, kabupaten, kecamatan, kelurahan, rt, namaLengkap, alamat;
    int noKk;
    int nik;
    int kodePos;

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    
    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoKk() {
        return noKk;
    }

    public void setNoKk(int noKk) {
        this.noKk = noKk;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public int getKodePos() {
        return kodePos;
    }

    public void setKodePos(int kodePos) {
        this.kodePos = kodePos;
    }
    
    public void daftar(){
        System.out.print("Pemerintah Provinsi\t\t : ");
        provinsi = sc.nextLine();
        System.out.print("Pemerintah Kabupaten/Kota\t : ");
        kabupaten = sc.nextLine();
        System.out.print("Kecamatan\t\t\t : ");
        kecamatan = sc.nextLine();
        System.out.print("Kelurahan/Desa\t\t\t : ");
        kelurahan = sc.nextLine();
        System.out.println("==============================\n");
        System.out.print("Nama Lengkap\t\t\t : ");
        namaLengkap = sc.nextLine();
        System.out.print("Alamat\t\t\t\t : ");
        alamat = sc.nextLine();
        System.out.print("No. KK\t\t\t\t : ");
        noKk = sc.nextInt();
    }
    
    
}
