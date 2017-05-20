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
    boolean run;
    String ktp[] = new String [100];
    String pilih, baca;
    int inPilihan, inJumlah;
    
    public void daftar() {
        attribute_ektp att = new attribute_ektp();
        ArrayList<HashMap<String, String>> arrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hash = new HashMap<String,String>();
	Scanner in = new Scanner(System.in);
        run = true;

        while (run) {
		System.out.println("\nMenu :");
		System.out.println("1. Tambah Data eKTP ");
		System.out.println("2. Daftar Data eKTP ");
		System.out.println("3. Sorting Data eKTP ");
		System.out.println("4. keluar ");
		System.out.print("Pilih : ");
		try {
                    inPilihan = in.nextInt();	
		}
		catch (java.util.InputMismatchException o) {
                    System.out.println("Inputan tidak valid " +o);
                    break;
		}
		switch (inPilihan) {
		case 1:
                    System.out.print("Jumlah Data eKTP yang ingin di inputkan : ");
                    try {
                        inJumlah = in.nextInt();
                    }
                    catch (java.util.InputMismatchException e) {
                        System.out.println("Maaf input tidak valid " +e);
                        break;
                    }	
                    try {
                        for (int i = 0; i < inJumlah;i++) {
                            System.out.println("Data ke - "+(i+1));
                            System.out.print("NIK\t\t\t\t: ");
                            att.nik = in.next();
                            hash.put(att.nik, att.nik);

                            System.out.print("Nama\t\t\t\t: ");
                            att.nama = in.next();				
                            hash.put(att.nama, att.nama);

                            System.out.print("Tempat/Tgl Lahir\t\t: ");
                            att.ttl = in.next();
                            hash.put(att.ttl, att.ttl);

                            System.out.print("Jenis Kelamin\t\t\t: ");
                            att.jenisKelamin = in.next();
                            hash.put(att.jenisKelamin, att.jenisKelamin);

                            System.out.print("Alamat\t\t\t\t: "); 
                            att.alamat = in.next();
                            hash.put(att.alamat, att.alamat);

                            System.out.print("Kabupaten\t\t\t: ");
                            att.kabupaten = in.next();
                            hash.put(att.kabupaten, att.kabupaten);

                            System.out.print("Kecamatan\t\t\t: ");
                            att.kecamatan = in.next();
                            hash.put(att.kecamatan, att.kecamatan);

                            System.out.print("RT\t\t\t\t: ");
                            att.rt = in.next();
                            hash.put(att.rt, att.rt);

                            System.out.print("RW\t\t\t\t: ");
                            att.rw = in.next();
                            hash.put(att.rw, att.rw);

                            System.out.print("Kode Pos\t\t\t: ");
                            att.kodePos = in.next();
                            hash.put(att.kodePos, att.kodePos);

                            System.out.print("No. KK\t\t\t\t: ");
                            att.noKk = in.next();
                            hash.put(att.noKk, att.noKk);

                            System.out.print("Agama\t\t\t\t: ");
                            att.agama = in.next();
                            hash.put(att.agama, att.agama);

                            System.out.print("Status Perkawinan\t\t: ");
                            att.statusNikah = in.next();
                            hash.put(att.statusNikah, att.statusNikah);

                            System.out.print("Pekerjaan\t\t\t: ");
                            att.pekerjaan = in.next();
                            hash.put(att.pekerjaan, att.pekerjaan);

                            System.out.print("Kewarganegaraan\t\t: ");
                            att.jenisWarga = in.next();
                            hash.put(att.jenisWarga, att.jenisWarga);

                            System.out.print("Masa Berlaku\t\t\t: ");
                            att.masaBerlaku = in.next();
                            hash.put(att.masaBerlaku, att.masaBerlaku);

                            arrList.add(hash);

                            ktp[i] = (i+1) + 
                                "\nNIK\t\t\t\t: " +arrList.get(i).get(att.nik) +
                                "\nNama\t\t\t\t: " +arrList.get(i).get(att.nama)  +
                                "\nTempat Tgl Lahir\t\t: " +arrList.get(i).get(att.ttl)+
                                "\nAlamat\t\t\t\t: " +arrList.get(i).get(att.alamat)+
                                "\nRT/RW\t\t\t\t: " +arrList.get(i).get(att.rt)+" - "+arrList.get(i).get(att.rw)+
                                "\nKabupaten\t\t\t: " +arrList.get(i).get(att.kabupaten)+
                                "\nKecamatan\t\t\t: " +arrList.get(i).get(att.kecamatan)+
                                "\nKode Pos\t\t\t: " +arrList.get(i).get(att.kodePos)+
                                "\nNo kk\t\t\t\t: " +arrList.get(i).get(att.noKk)+
                                "\nAgama\t\t\t\t: " +arrList.get(i).get(att.agama)+
                                "\nStatus Perkawinan\t\t: " +arrList.get(i).get(att.statusNikah)+
                                "\nPekerjaan\t\t\t: " +arrList.get(i).get(att.pekerjaan)+
                                "\nKewarganegaraan\t\t\t: " +arrList.get(i).get(att.jenisWarga)+
                                "\nMasa Berlaku\t\t\t: " +arrList.get(i).get(att.masaBerlaku)+ "\n";
                        }
                    }
                    catch (java.util.InputMismatchException a) {
                            System.out.println("Data tidak valid ");
                    }
                    catch (ArrayIndexOutOfBoundsException a) {
                        System.out.println("Data ektp sudah full");
                        System.out.println("Coba Lagi ? Y/N :");
                        try {
                            pilih = in.next();
                        }
                        catch (Exception e){
                            System.out.println("data tidak valid");
                        }
                        if (pilih.equalsIgnoreCase("n") || pilih.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\n################## Daftar Data E-KTP ##################");
                    if (ktp[0] != null) {
                            try {
                                for (int i = 0; i < inJumlah ; i++){
                                    System.out.println(ktp[i]);
                                }
                            } catch(ArrayIndexOutOfBoundsException i) {
                                    System.out.println("Maaf data yang di inattkan salah");
                            }

                    }
                    else {
                        System.out.println("Data Tidak Tersedia\n");
                    }
                    
                    System.out.println("Menu :");
                    System.out.println("1. Kembali ");
                    System.out.println("2. Exit ");
                    System.out.print("Pilihan : ");
                    try {
                        inPilihan = in.nextInt();	
                    }
                    catch (java.util.InputMismatchException b) {
                        System.out.println("Maaf menu tidak valid " +b);
                        break;   
                    }
                    switch(inPilihan) {
                        case 1 :
                            run = true;
                            break;
                        default:
                            System.exit(0);
                    }
                    break;

                case 3:
                    int i = 1;
                    System.out.println("\n################## Cari Data ##################");
                    System.out.println("Masukkan Data Yang Ingin Dicari :");
                    baca = in.nextLine();

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}
