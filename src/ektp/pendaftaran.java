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
    
    public void daftar(){
        attribute_ektp att = new attribute_ektp();
        ArrayList<HashMap<String, String>> arrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hash = new HashMap<String,String>();
	Scanner in = new Scanner(System.in);
        run = true;

        while (run){
		System.out.println("\nMenu :");
		System.out.println("1. Iputan Data eKTP ");
		System.out.println("2. List Data eKTP ");
		System.out.println("3. Sorting Data eKTP ");
		System.out.println("4. exit ");
		System.out.println("Pilih :");
		try{
			inPilihan = in.nextInt();	
		}
		catch(java.util.InputMismatchException a){
			System.out.println("Maaf inan tidak valid " +a);
			break;
		}
		switch(inPilihan){
		case 1:
			System.out.println("===Iputkan Data eKTP===");
			System.out.println("Jumlah Inputan Data eKTP :");
			try{
				inJumlah = in.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Maaf inan tidak valid " +e);
				break;
			}	
			try{
				for (int i = 0; i < inJumlah;i++){
					System.out.println("Data ke-"+(i+1));
					System.out.println("NIK :");
					att.nik = in.next();
					hash.put(att.nik, att.nik);
					
					System.out.println("Nama :");
					att.nama = in.next();				
					hash.put(att.nama, att.nama);
					
					System.out.println("Tempat/Tgl Lahir :");
					att.ttl = in.next();
					hash.put(att.ttl, att.ttl);
					
					System.out.println("Jenis Kelamin :");
					att.jenisKelamin = in.next();
					hash.put(att.jenisKelamin, att.jenisKelamin);
					
					System.out.println("Alamat :"); 
					att.alamat = in.next();
					hash.put(att.alamat, att.alamat);
									
					System.out.println("Kabupaten :");
					att.kabupaten = in.next();
					hash.put(att.kabupaten, att.kabupaten);
                                        
                                        System.out.println("Kecamatan :");
					att.kecamatan = in.next();
					hash.put(att.kecamatan, att.kecamatan);
                                        
					System.out.println("RT:");
					att.rt = in.next();
					hash.put(att.rt, att.rt);
					
					System.out.println("RW:");
					att.rw = in.next();
					hash.put(att.rw, att.rw);
                                        
                                        System.out.println("Kode Pos:");
					att.kodePos = in.next();
					hash.put(att.kodePos, att.kodePos);
					
                                        System.out.println("Agama :");
					att.noKk = in.next();
					hash.put(att.noKk, att.noKk);
                                        
					System.out.println("Agama :");
					att.agama = in.next();
					hash.put(att.agama, att.agama);
					
					System.out.println("Status Perkawinan :");
					att.statusNikah = in.next();
					hash.put(att.statusNikah, att.statusNikah);
					
					System.out.println("Pekerjaan :");
					att.pekerjaan = in.next();
					hash.put(att.pekerjaan, att.pekerjaan);
					
					System.out.println("Kewarganegaraan :");
					att.jenisWarga = in.next();
					hash.put(att.jenisWarga, att.jenisWarga);
					
					System.out.println("Masa Berlaku :");
					att.masaBerlaku = in.next();
					hash.put(att.masaBerlaku, att.masaBerlaku);
					
					arrList.add(hash);
					
					ktp[i] = (i+1) + 
							"\n NIK                 =" +arrList.get(i).get(att.nik) +
							"\n Nama                =" +arrList.get(i).get(att.nama)  +
							"\n Tempat/Tgl Lahir    =" +arrList.get(i).get(att.ttl)+
							"\n Alamat              =" +arrList.get(i).get(att.alamat)+
							"\n RT/RW               =" +arrList.get(i).get(att.rt)+" - "+arrList.get(i).get(att.rw)+
							"\n Desa                =" +arrList.get(i).get(att.kabupaten)+
							"\n Kecamatan		=" +arrList.get(i).get(att.kecamatan)+
                                                        "\n Kecamatan		=" +arrList.get(i).get(att.kodePos)+
                                                        "\n Kecamatan		=" +arrList.get(i).get(att.noKk)+
							"\n Agama       	 =" +arrList.get(i).get(att.agama)+
							"\n Status Perkawinan	 =" +arrList.get(i).get(att.statusNikah)+
							"\n Pekerjaan		 =" +arrList.get(i).get(att.pekerjaan)+
							"\n Kewarganegaraan	 =" +arrList.get(i).get(att.jenisWarga)+
							"\n Masa Berlaku		 =" +arrList.get(i).get(att.masaBerlaku)+ "\n";
					
				}
			}
		
                }
	}
        
    }
}
