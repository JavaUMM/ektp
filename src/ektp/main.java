/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektp;

/**
 *
 * @author Muhammad Fikri
 */
public class main {
    public static void main(String[] args) {
       
        pendaftaran pdf = new pendaftaran();
        pdf.daftar();
        System.out.println("\n=======================================");
        System.out.print("Pemerintah Provinsi\t\t : "+pdf.getProvinsi());
        System.out.print("\nPemerintah Kabupaten/Kota\t : "+pdf.getKabupaten());
        System.out.print("\nKecamatan\t\t\t : "+pdf.getKecamatan());
        System.out.print("\nKelurahan/Desa\t\t\t : "+pdf.getKelurahan());
        System.out.print("\nNama Lengkap\t\t\t : "+pdf.getNamaLengkap());
        System.out.print("\nNo. KK\t\t\t\t : "+pdf.getNoKk());
        System.out.print("\nAlamat\t\t\t\t : "+pdf.getAlamat());  
    }
}
